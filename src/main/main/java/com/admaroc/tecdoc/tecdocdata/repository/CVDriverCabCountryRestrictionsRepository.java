package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVDriverCabCountryRestrictions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVDriverCabCountryRestrictionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVDriverCabCountryRestrictionsRepository extends JpaRepository<CVDriverCabCountryRestrictions, CVDriverCabCountryRestrictionsId> {

}
