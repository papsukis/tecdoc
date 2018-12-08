package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CountryRestrictionOfTheLinkage;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountryRestrictionOfTheLinkageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRestrictionOfTheLinkageRepository extends JpaRepository<CountryRestrictionOfTheLinkage, CountryRestrictionOfTheLinkageId> {

}
