package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.SortingOfTheLinkage;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.SortingOfTheLinkageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SortingOfTheLinkageRepository extends JpaRepository<SortingOfTheLinkage, SortingOfTheLinkageId> {

}
