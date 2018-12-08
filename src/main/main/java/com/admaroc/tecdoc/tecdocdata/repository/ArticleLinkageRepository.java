package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ArticleLinkage;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleLinkageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleLinkageRepository extends JpaRepository<ArticleLinkage, ArticleLinkageId> {


}
