package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CriteriaTable;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CriteriaTableId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaTableRepository extends JpaRepository<CriteriaTable, CriteriaTableId> {


}
