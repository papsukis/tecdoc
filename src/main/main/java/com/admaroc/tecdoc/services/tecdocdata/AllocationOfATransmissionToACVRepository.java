package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfATransmissionToACV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfATransmissionToACVRepository extends JpaRepository<AllocationOfATransmissionToACV, Integer> {


}
