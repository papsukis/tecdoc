package com.admaroc.tecdoc.services.tecdoc;

import com.admaroc.tecdoc.tecdoc.model.FileStructure;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface FileStructureServices {

    FileStructure findById(int id);
    List<FileStructure> findByFilename(String filename);
    List<FileStructure> findByTableName(String tablename);
    void saveFileStructure(FileStructure fileStructure);
    void deleteFileStructure(int id);
    List<FileStructure> findAll();
    boolean isFileStructureExists(FileStructure fileStructure);


    Map<String, String> getAllTableNames() throws IOException;
}
