package com.admaroc.tecdoc.controller;

import com.admaroc.tecdoc.tecdoc.model.FileStructure;
import com.admaroc.tecdoc.services.tecdoc.FileStructureServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class FileStructureController {

    @Autowired
    FileStructureServices fileStructureServices;


    @GetMapping(value="/files")
    public String showAll(Model model) throws IOException {
        List<FileStructure> l=fileStructureServices.findAll();


        Map<String,String> t=fileStructureServices.getAllTableNames();
        model.addAttribute("allFiles",l);
        return "files";
    }

    @GetMapping(value="/addfilestructure")
    public String save(Model model)
    {

        model.addAttribute("filestructure",new FileStructure());

        return "addfilestructure";
    }

    @PostMapping(value="/addfilestructure")
    public String save(Model model, @ModelAttribute FileStructure fileStructure)
    {


        if(fileStructureServices.isFileStructureExists(fileStructure))
            return "redirect:/files";

        fileStructureServices.saveFileStructure(fileStructure);

        return "redirect:/files";
    }

    @GetMapping(value =  "/updateStructure/{id}" )
    public String updateStructure(Model model,@PathVariable("id") int id) {

        model.addAttribute("filestructure",fileStructureServices.findById(id));


        return "updateStructure";
    }

    @PostMapping(value =  "/updateStructure" )
    public String updateUser(Model model,@ModelAttribute FileStructure filestructure) {


        fileStructureServices.saveFileStructure(filestructure);

        return "redirect:/files";
    }

    @GetMapping(value="/deleteStructure")
    public String deleteStructure(@RequestParam int id)
    {
        fileStructureServices.deleteFileStructure(id);

        return "redirect:/files";
    }

    @GetMapping(value="/getAlltables")
    public String getAll(Model model) throws IOException {





       // model.addAttribute("tables",l);

        return "tables";

    }


}
