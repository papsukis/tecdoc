package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfDriverCabsToCVs;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfDriverCabsToCVsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfDriverCabsToCVsRepository extends JpaRepository<AllocationOfDriverCabsToCVs, AllocationOfDriverCabsToCVsId> {

}
