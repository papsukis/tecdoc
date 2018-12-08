package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AustrianNatCodes;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AustrianNatCodesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AustrianNatCodesRepository extends JpaRepository<AustrianNatCodes, AustrianNatCodesId> {

    }
