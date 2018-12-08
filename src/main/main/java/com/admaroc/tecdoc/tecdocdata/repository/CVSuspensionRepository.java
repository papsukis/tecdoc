package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVSuspension;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVSuspensionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVSuspensionRepository extends JpaRepository<CVSuspension, CVSuspensionId> {

}
