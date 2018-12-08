package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.TransmissionCountryRestrictions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.TransmissionCountryRestrictionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmissionCountryRestrictionsRepository extends JpaRepository<TransmissionCountryRestrictions, TransmissionCountryRestrictionsId> {

}
