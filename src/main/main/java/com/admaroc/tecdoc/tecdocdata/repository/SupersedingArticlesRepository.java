package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.SupersedingArticles;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.SupersedingArticlesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupersedingArticlesRepository extends JpaRepository<SupersedingArticles, SupersedingArticlesId> {


}
