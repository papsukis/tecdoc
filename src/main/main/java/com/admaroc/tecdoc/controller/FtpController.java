package com.admaroc.tecdoc.controller;



import com.admaroc.tecdoc.services.tecdoc.FileStructureServices;
import com.admaroc.tecdoc.tecdoc.model.Node;
import com.admaroc.tecdoc.tecdoc.model.Tree;
import com.admaroc.tecdoc.services.tecdoc.Implementation.LocalServices;
import com.admaroc.tecdoc.services.tecdoc.Implementation.TecdocServices;
import com.admaroc.tecdoc.tecdocdata.model.ReferenceNumbers;
import com.admaroc.tecdoc.tecdocdata.repository.ReferenceNumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class FtpController {

    @Autowired
    TecdocServices ftpTecdoc;
    @Autowired
    LocalServices ftpLocal;
    @Autowired
    FileStructureServices fileStructureServices;

    Tree<String> tecdocHierarchy ;

    Tree<String> localHierarchy ;

    Node<String> currentNodeTecdoc;

    Node<String> currentNodeLocal;

    boolean tecdoc = false;
    boolean local = false;

    @GetMapping(value="/tecdocConect")
    public String conectTecdoc(Model model,@RequestParam String server,@RequestParam("name") String username,@RequestParam String password,@RequestParam int port) throws IOException {
        if (ftpTecdoc.connect(server, port, username, password) == null)
            return "redirect:/index";
        else {
            tecdoc=true;

            model.addAttribute("parentDirectory", "root");
            return "redirect:/ftp";
        }
    }
    @GetMapping(value="/localConect")
    public String conectLocal(Model model,@RequestParam String server,@RequestParam("name") String username,@RequestParam String password,@RequestParam int port) throws IOException {
        if (ftpLocal.connect(server, port, username, password) == null)
            return "redirect:/index";
        else {
            local=true;

            localHierarchy=ftpLocal.getHierarchy();
            currentNodeLocal=localHierarchy.getRootElement();

            model.addAttribute("parentDirectory", "root");
            return "redirect:/ftp";
        }
    }

    @RequestMapping(value = "/ftp", method = RequestMethod.GET)
    public String showFiles(Model model ,@RequestParam(value="tecdocCurrentDirectory", defaultValue ="root")String tecdocCurrentDirectory,@RequestParam(value="localCurrentDirectory", defaultValue ="root")String localCurrentDirectory) throws IOException {


        model.addAttribute("tecdoc", tecdoc);
        model.addAttribute("local", local);

        if(tecdoc)
        {

            getTecdocCurrentNode(tecdocCurrentDirectory);
            model.addAttribute("tecdocFiles", ftpTecdoc.listAllFiles(ftpTecdoc.getUrl(currentNodeTecdoc)));
            model.addAttribute("tecdocDirectories", ftpTecdoc.listAllDirectories(ftpTecdoc.getUrl(currentNodeTecdoc)));
            if(!currentNodeTecdoc.isRoot())
                model.addAttribute("tecdocParentDirectory",currentNodeTecdoc.getAllParents());
            model.addAttribute("tecdocCurrentDirectory", tecdocCurrentDirectory);
        }
        if(local)
        {

            getLocalCurrentNode(localCurrentDirectory);
            model.addAttribute("localFiles", ftpLocal.listAllFiles(ftpLocal.getUrl(currentNodeLocal)));
            model.addAttribute("localDirectories", ftpLocal.listAllDirectories(ftpLocal.getUrl(currentNodeLocal)));
            if(!currentNodeLocal.isRoot())
                model.addAttribute("localParentDirectory",currentNodeLocal.getAllParents());
            model.addAttribute("localCurrentDirectory", localCurrentDirectory);


            ftpLocal.storeData("030",ftpLocal.getData("REFERENCE_DATA_1118/030.dat"),fileStructureServices.findByFilename("030"));


            /*List<String> fi=ftpLocal.getData("0001/203.0001");
            DataUtil data=new DataUtil(fi,"203");

            List<FileStructure> f=fileStructureServices.findByFilename("203");
            data.readData(f);*/
        }

        return "ftpPage";
        }


    @GetMapping(value = "/uncompress/{file}")
    public String uncompress(Model model, @PathVariable("file") String File) throws IOException {


        ftpLocal.uncompressFile(File,ftpLocal.getUrl(currentNodeLocal));

        return "redirect:/ftp";
    }

    @GetMapping(value="/rename/{directory}")
    public String renameFolder(Model model,@RequestParam("name") String name, @PathVariable("directory") String directory) throws IOException {

        String path="";
        if(!currentNodeTecdoc.getData().equals("/"))
        {
            path=ftpTecdoc.getUrl(currentNodeTecdoc) + "/";

        }

        ftpTecdoc.changeDirectoryName(path+directory,path+name);

        return "redirect:/ftp";
    }

    @GetMapping(value = "/renomer/{directory}")
    public String view(@PathVariable("directory") String directory, Model model) {

        model.addAttribute("directory", directory);
        return "common/modal :: view";
    }

    @GetMapping(value="/delete/{directory}")
    public String deleteFolder(@PathVariable String directory,Model model) throws IOException {

        String path="";
        if(!currentNodeTecdoc.getData().equals("/"))
        {
            path=ftpTecdoc.getUrl(currentNodeTecdoc) + "/";

        }

        ftpTecdoc.deleteDirectory(path+directory);
        return "redirect:/ftp";
    }

    @GetMapping(value="/read/{file}")
    public String readTecdocFile(@PathVariable String file,Model model) throws IOException {

        String path=getTedocPath(currentNodeTecdoc);
        model.addAttribute("filename",file);
        model.addAttribute("file",ftpTecdoc.readFile(path+file));
        return "common/modal :: file";
    }
    @GetMapping(value="/lire/{file}")
    public String readLocalFile(@PathVariable String file,Model model) throws IOException {

        String path=getLocalPath(currentNodeLocal);
        model.addAttribute("filename",file);
        model.addAttribute("file",ftpLocal.readFile(path+file));
        return "common/modal :: file";
    }

    @GetMapping(value="/download/{file}")
    public String download(@PathVariable String file,Model model) throws IOException {
        if(tecdoc & local)
        {
            ftpLocal.uploadFile(ftpTecdoc.downloadFile(getTedocPath(currentNodeTecdoc)+file),file);
        }

        return "redirect:/ftp";
    }


    public String getTedocPath(Node<String> n) {
        String path="";
        if(!n.getData().equals("/"))
        {
            path=ftpTecdoc.getUrl(n) + "/";


        }

        return path;
    }
    public String getLocalPath(Node<String> n ){
        String path="";
        if(!n.getData().equals("/"))
        {
            path=ftpLocal.getUrl(n) + "/";


        }

        return path;
    }

    public void getTecdocCurrentNode( String currentDirectory) {
        tecdocHierarchy = ftpTecdoc.getHierarchy();

        if(currentDirectory.equals("root"))
        {
            currentNodeTecdoc=tecdocHierarchy.getRootElement();
        }

        else if(currentNodeTecdoc==tecdocHierarchy.getRootElement())
        {
            currentNodeTecdoc=tecdocHierarchy.getNode(currentDirectory);
        }
        else
        {
            currentNodeTecdoc=tecdocHierarchy.getNode(currentDirectory,currentNodeTecdoc);
        }

        if(currentNodeTecdoc==null)
        {
            currentNodeTecdoc=tecdocHierarchy.getNode(currentDirectory);
        }
    }
    public void getLocalCurrentNode( String currentDirectory) {
        localHierarchy = ftpLocal.getHierarchy();

        if(currentDirectory.equals("root"))
        {
            currentNodeLocal=localHierarchy.getRootElement();
        }

        else if(currentNodeLocal==localHierarchy.getRootElement())
        {
            currentNodeLocal=localHierarchy.getNode(currentDirectory);
        }
        else
        {
            currentNodeLocal=localHierarchy.getNode(currentDirectory,currentNodeLocal);
        }

        if(currentNodeLocal==null)
        {
            currentNodeLocal=localHierarchy.getNode(currentDirectory);
        }
    }

    @GetMapping(value="/uncompressMultipleFiles")
    public String uncompressMultipleFiles(Model model, @RequestParam ArrayList<String> file)
    {
       for(String f:file)
       {
           System.out.println(f);
       }
        return "redirect:/ftp";
    }

}
