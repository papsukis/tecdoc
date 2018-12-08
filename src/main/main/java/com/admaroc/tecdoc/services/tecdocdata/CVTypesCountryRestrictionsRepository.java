package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CVTypesCountryRestrictions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVTypesCountryRestrictionsRepository extends JpaRepository<CVTypesCountryRestrictions, Integer> {

}
