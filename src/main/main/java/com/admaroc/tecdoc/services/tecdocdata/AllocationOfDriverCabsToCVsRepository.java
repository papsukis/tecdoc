package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfDriverCabsToCVs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfDriverCabsToCVsRepository extends JpaRepository<AllocationOfDriverCabsToCVs, Integer> {

}
