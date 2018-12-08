package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.EngineCountryRestrictions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineCountryRestrictionsRepository extends JpaRepository<EngineCountryRestrictions, Integer> {


}
