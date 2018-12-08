package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.BodyTypeSynonyms;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.BodyTypeSynonymsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyTypeSynonymsRepository extends JpaRepository<BodyTypeSynonyms, BodyTypeSynonymsId> {


}
