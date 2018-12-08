package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.GenericArticleSynonyms;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.GenericArticleSynonymsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericArticleSynonymsRepository extends JpaRepository<GenericArticleSynonyms, GenericArticleSynonymsId> {

}
