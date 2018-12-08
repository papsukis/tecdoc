package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.DriveTypeSynonyms;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.DriveTypeSynonymsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriveTypeSynonymsRepository extends JpaRepository<DriveTypeSynonyms, DriveTypeSynonymsId> {


}
