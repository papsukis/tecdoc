package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.TextModules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextModulesRepository extends JpaRepository<TextModules, Integer> {


}
