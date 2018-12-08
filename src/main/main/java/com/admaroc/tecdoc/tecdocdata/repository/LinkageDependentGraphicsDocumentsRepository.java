package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.LinkageDependentGraphicsDocuments;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.LinkageDependentGraphicsDocumentsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkageDependentGraphicsDocumentsRepository extends JpaRepository<LinkageDependentGraphicsDocuments, LinkageDependentGraphicsDocumentsId> {

}
