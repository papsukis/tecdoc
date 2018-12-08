package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVTypesCountryRestrictions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVTypesCountryRestrictionsID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVTypesCountryRestrictionsRepository extends JpaRepository<CVTypesCountryRestrictions, CVTypesCountryRestrictionsID> {

}
