package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.ManufacturerKBAReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerKBAReferenceRepository extends JpaRepository<ManufacturerKBAReference, Integer> {


}
