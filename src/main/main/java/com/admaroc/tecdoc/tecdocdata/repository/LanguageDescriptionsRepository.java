package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.LanguageDescriptions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.LanguageDescriptionsID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageDescriptionsRepository extends JpaRepository<LanguageDescriptions, LanguageDescriptionsID> {

}
