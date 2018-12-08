package com.admaroc.tecdoc.services.tecdoc.Implementation;

import com.admaroc.tecdoc.tecdoc.model.FileStructure;
import com.admaroc.tecdoc.tecdoc.repository.FileStructureRepository;
import com.admaroc.tecdoc.services.tecdoc.FileStructureServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.*;

@Service
@Transactional
public class FileStructureServicesImpl implements FileStructureServices {

    @Autowired
    FileStructureRepository fileStructureRepository;

    @Override
    public FileStructure findById(int id) {
        return fileStructureRepository.findById(id).get();
    }

    @Override
    public List<FileStructure> findByFilename(String filename) {
        return fileStructureRepository.findByFilename(filename);
    }

    @Override
    public List<FileStructure> findByTableName(String tablename) {
        return fileStructureRepository.findByTableName(tablename);
    }

    @Override
    public void saveFileStructure(FileStructure fileStructure) {
        fileStructureRepository.save(fileStructure);

    }

    @Override
    public void deleteFileStructure(int id) {
        fileStructureRepository.delete(findById(id));

    }

    @Override
    public List<FileStructure> findAll() {
        return fileStructureRepository.findAll();
    }

    @Override
    public boolean isFileStructureExists(FileStructure fileStructure) {

        List<FileStructure> l=findByFilename(fileStructure.getFilename());

        for(FileStructure f:l)
        {
            if(f.getName().equals(fileStructure.getName())){

                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, String> getAllTableNames() throws IOException {
        List<String> tables=new ArrayList<>();

        List<FileStructure> fs=fileStructureRepository.findAll();
        Map<String,String> t = new TreeMap<>();

        for(FileStructure f:fs){
            if(!t.containsKey(f.getFilename()))
            {
                t.put(f.getFilename(),f.getTableName());
            }
        }


        return t;
    }

}
