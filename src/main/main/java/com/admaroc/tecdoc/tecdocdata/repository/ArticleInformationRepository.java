package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ArticleInformation;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleInformationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleInformationRepository extends JpaRepository<ArticleInformation, ArticleInformationId> {


}
