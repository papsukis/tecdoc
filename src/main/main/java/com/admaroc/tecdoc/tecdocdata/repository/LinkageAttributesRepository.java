package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.LinkageAttributes;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.LinkageAttributesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkageAttributesRepository extends JpaRepository<LinkageAttributes, LinkageAttributesId> {


}
