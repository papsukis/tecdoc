package com.admaroc.tecdoc.tecdoc.repository;

import com.admaroc.tecdoc.tecdoc.model.FileStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileStructureRepository extends JpaRepository<FileStructure, Integer> {

    List<FileStructure> findByFilename(String filename);
    List<FileStructure> findByTableName(String filename);


}
