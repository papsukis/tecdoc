package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AssemblyGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssemblyGroupsRepository extends JpaRepository<AssemblyGroups, Integer> {


}
