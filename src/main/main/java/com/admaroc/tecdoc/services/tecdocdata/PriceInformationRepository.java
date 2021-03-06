package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.PriceInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceInformationRepository extends JpaRepository<PriceInformation, Integer> {

}
