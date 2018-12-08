package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.BodyTypeSynonyms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyTypeSynonymsRepository extends JpaRepository<BodyTypeSynonyms, Integer> {


}
