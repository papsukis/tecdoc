package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVProducerIdsCountryRestrictions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVProducerIdsCountryRestrictionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVProducerIdsCountryRestrictionsRepository extends JpaRepository<CVProducerIdsCountryRestrictions, CVProducerIdsCountryRestrictionsId> {

}
