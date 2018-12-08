package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.EngineCountryRestrictions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.EngineCountryRestrictionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineCountryRestrictionsRepository extends JpaRepository<EngineCountryRestrictions, EngineCountryRestrictionsId> {


}
