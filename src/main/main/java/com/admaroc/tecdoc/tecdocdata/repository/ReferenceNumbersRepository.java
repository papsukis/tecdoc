package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ReferenceNumbers;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ReferenceNumbersId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenceNumbersRepository extends JpaRepository<ReferenceNumbers, ReferenceNumbersId> {




}
