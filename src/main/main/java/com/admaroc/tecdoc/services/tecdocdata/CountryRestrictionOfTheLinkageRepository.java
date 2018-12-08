package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CountryRestrictionOfTheLinkage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRestrictionOfTheLinkageRepository extends JpaRepository<CountryRestrictionOfTheLinkage, Integer> {

}
