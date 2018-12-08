package com.admaroc.tecdoc.tecdocdata.repository;


import com.admaroc.tecdoc.tecdocdata.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository<Header, Integer> {


}
