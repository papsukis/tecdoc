package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.PartsListsCountryRestrictions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsListsCountryRestrictionsRepository extends JpaRepository<PartsListsCountryRestrictions, Integer> {


}
