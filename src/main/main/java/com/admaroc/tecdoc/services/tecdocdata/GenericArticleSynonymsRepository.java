package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.GenericArticleSynonyms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericArticleSynonymsRepository extends JpaRepository<GenericArticleSynonyms, Integer> {

}
