package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfGenArtToSearchStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfGenArtToSearchStructureRepository extends JpaRepository<AllocationOfGenArtToSearchStructure, Integer> {


}
