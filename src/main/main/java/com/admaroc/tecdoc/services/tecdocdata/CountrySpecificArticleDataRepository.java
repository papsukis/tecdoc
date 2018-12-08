package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CountrySpecificArticleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountrySpecificArticleDataRepository extends JpaRepository<CountrySpecificArticleData, Integer> {


}
