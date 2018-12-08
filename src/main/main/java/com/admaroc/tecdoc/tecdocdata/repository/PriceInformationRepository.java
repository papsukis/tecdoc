package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.PriceInformation;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.PriceInformationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceInformationRepository extends JpaRepository<PriceInformation, PriceInformationId> {

}
