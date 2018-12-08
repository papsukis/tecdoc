package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.TextModules;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.TextModulesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextModulesRepository extends JpaRepository<TextModules, TextModulesId> {


}
