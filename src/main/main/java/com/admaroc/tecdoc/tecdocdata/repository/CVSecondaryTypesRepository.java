package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVSecondaryTypes;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVSecondaryTypesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVSecondaryTypesRepository extends JpaRepository<CVSecondaryTypes, CVSecondaryTypesId> {


}
