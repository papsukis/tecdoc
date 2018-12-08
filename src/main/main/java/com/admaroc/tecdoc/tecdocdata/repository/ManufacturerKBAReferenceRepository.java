package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ManufacturerKBAReference;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ManufacturerKbaReferenceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerKBAReferenceRepository extends JpaRepository<ManufacturerKBAReference, ManufacturerKbaReferenceId> {


}
