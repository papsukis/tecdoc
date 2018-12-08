package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CountryRestrictionsForTheAllocationOfCVToIDNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRestrictionsForTheAllocationOfCVToIDNumbersRepository extends JpaRepository<CountryRestrictionsForTheAllocationOfCVToIDNumbers, Integer> {


}
