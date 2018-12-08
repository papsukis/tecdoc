package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVCountrySpecificDeviations;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVCountrySpecificDeviationsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVCountrySpecificDeviationsRepository extends JpaRepository<CVCountrySpecificDeviations, CVCountrySpecificDeviationsId> {


}
