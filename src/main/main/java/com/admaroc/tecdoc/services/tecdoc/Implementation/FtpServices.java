package com.admaroc.tecdoc.services.tecdoc.Implementation;


import com.admaroc.tecdoc.Utils.Converter;
import com.admaroc.tecdoc.tecdoc.model.FileStructure;
import com.admaroc.tecdoc.tecdoc.model.FtpClient;


import com.admaroc.tecdoc.tecdoc.model.Node;
import com.admaroc.tecdoc.tecdoc.model.Tree;
import com.admaroc.tecdoc.tecdocdata.model.*;
import com.admaroc.tecdoc.tecdocdata.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FtpServices {

    FtpClient ftp;
    Converter converter;

    @Autowired
    LanguageRepository languageRepository;
    @Autowired
    LanguageDescriptionsRepository languageDescriptionsRepository;

    public FtpClient connect(String ipAddress,int port, String userName, String password) throws IOException {

        ftp=new FtpClient(ipAddress,port,userName,password);

        List<String> files=new ArrayList<>();

        try
        {
            ftp.open();
            ftp.enterPassiveMode();
            return ftp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public String CurrentDirectory() {
        try {
            return ftp.currentDirectory();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void changeDirectory(String path) throws IOException{
        ftp.changeDirectory(path);
    }

    public List<String> listAllFiles(){
        List<String> files=new ArrayList<>();
        try {

            files= ftp.listFiles("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return files;
    }

    public List<String> listAllFiles(String path){
        List<String> files=new ArrayList<>();
        try {
            files= ftp.listFiles(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return files;
    }

    public List<String> listAllDirectories(){
        List<String> files=new ArrayList<>();
        try {
            files= (List<String>) ftp.listDirectories("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return files;
    }
    public List<String> listAllDirectories(String path){
        List<String> files=new ArrayList<>();
        try {
            files= (List<String>) ftp.listDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return files;
    }

    public Tree<String> getHierarchy(){
        if(ftp==null)
            return new Tree<String>();
        return ftp.getHierarchy();
    }



    public Node<String> findNode(Node<String> n, String s) {
        if (n.getData().equals(s)) {
            return n;
        } else {
            for (Node<String> child: n.getChildren()) {
                Node<String> result = findNode(child, s);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    public String getUrl(Node<String> n){
        if(n.isRoot())
        {
            return "/";
        }

        List<String> parents=n.getAllParents();
        String path="";
        for(String N:parents)
        {
            path+="/"+N;
        }
        path+="/"+n.getData();
        return path;
    }

    public void uncompressFile(String file,String path) throws IOException {
        ftp.uncompressFile(file,path);
    }

    public void changeDirectoryName(String name,String directory) throws IOException {
        ftp.changeDirectoryName(directory,name);

    }
    public void deleteDirectory(String path) throws IOException {
        ftp.deleteDirectory(path);
    }

    public String readFile(String path) throws IOException {
        return ftp.readFile(path);
    }
    public List<String> getData(String path) throws IOException {
        return ftp.getData(path);
    }

    public void storeData(String file, List<String> data, List<FileStructure> fileStructure){
        converter=new Converter(data,file,fileStructure);
        List<LanguageDescriptions> test=new ArrayList<>();
        for(int i=0;i<converter.getDatas().size();i++)
        {
            LanguageDescriptions tmp=new LanguageDescriptions(converter.getDatas().get(i));
            test.add(tmp);
            languageDescriptionsRepository.save(tmp);
        }


    }

}

