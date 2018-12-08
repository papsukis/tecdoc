package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CVSecondaryTypesCountryRestrictions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVSecondaryTypesCountryRestrictionsRepository extends JpaRepository<CVSecondaryTypesCountryRestrictions, Integer> {


}
