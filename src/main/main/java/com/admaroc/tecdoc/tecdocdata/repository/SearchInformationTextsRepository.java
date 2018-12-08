package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.SearchInformationTexts;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.SearchInformationTextsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchInformationTextsRepository extends JpaRepository<SearchInformationTexts, SearchInformationTextsId> {


}
