package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.DriveTypeSynonyms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriveTypeSynonymsRepository extends JpaRepository<DriveTypeSynonyms, Integer> {


}
