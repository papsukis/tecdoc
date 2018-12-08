package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AccessoryListsCriteria;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AccessoryListsCriteriaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoryListsCriteriaRepository extends JpaRepository<AccessoryListsCriteria, AccessoryListsCriteriaId> {


}
