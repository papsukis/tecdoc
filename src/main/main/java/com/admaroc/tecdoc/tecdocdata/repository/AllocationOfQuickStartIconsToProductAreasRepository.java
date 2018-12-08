package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfQuickStartIconsToProductAreas;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfQuickStartIconsToProductAreasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfQuickStartIconsToProductAreasRepository extends JpaRepository<AllocationOfQuickStartIconsToProductAreas, AllocationOfQuickStartIconsToProductAreasId> {


}
