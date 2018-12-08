package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVSecondaryTypesCountryRestrictions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVSecondaryTypesCountryRestrictionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVSecondaryTypesCountryRestrictionsRepository extends JpaRepository<CVSecondaryTypesCountryRestrictions, CVSecondaryTypesCountryRestrictionsId> {


}
