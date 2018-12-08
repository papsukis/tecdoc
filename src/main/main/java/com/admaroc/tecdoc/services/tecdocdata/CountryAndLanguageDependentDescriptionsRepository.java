package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CountryAndLanguageDependentDescriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryAndLanguageDependentDescriptionsRepository extends JpaRepository<CountryAndLanguageDependentDescriptions, Integer> {

}
