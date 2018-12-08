package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CountrySpecificArticleData;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountrySpecificArticleDataId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountrySpecificArticleDataRepository extends JpaRepository<CountrySpecificArticleData, CountrySpecificArticleDataId> {


}
