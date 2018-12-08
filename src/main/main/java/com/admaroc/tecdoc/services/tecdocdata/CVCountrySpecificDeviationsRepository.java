package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CVCountrySpecificDeviations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVCountrySpecificDeviationsRepository extends JpaRepository<CVCountrySpecificDeviations, Integer> {


}
