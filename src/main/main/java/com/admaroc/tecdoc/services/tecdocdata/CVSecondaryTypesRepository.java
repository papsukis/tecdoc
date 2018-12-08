package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CVSecondaryTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVSecondaryTypesRepository extends JpaRepository<CVSecondaryTypes, Integer> {


}
