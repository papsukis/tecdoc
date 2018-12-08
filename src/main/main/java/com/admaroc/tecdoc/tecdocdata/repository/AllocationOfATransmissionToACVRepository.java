package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfATransmissionToACV;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfATransmissionToACVId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfATransmissionToACVRepository extends JpaRepository<AllocationOfATransmissionToACV, AllocationOfATransmissionToACVId> {


}
