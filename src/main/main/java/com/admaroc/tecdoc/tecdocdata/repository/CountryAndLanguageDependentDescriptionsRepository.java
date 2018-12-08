package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CountryAndLanguageDependentDescriptions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountryAndLanguageDescriptionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryAndLanguageDependentDescriptionsRepository extends JpaRepository<CountryAndLanguageDependentDescriptions, CountryAndLanguageDescriptionsId> {

}
