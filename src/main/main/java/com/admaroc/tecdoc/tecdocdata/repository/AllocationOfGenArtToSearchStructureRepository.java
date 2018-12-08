package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfGenArtToSearchStructure;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfGenArtToSearchStructureId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfGenArtToSearchStructureRepository extends JpaRepository<AllocationOfGenArtToSearchStructure, AllocationOfGenArtToSearchStructureId> {


}
