package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.LinkageDependentGraphicsDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkageDependentGraphicsDocumentsRepository extends JpaRepository<LinkageDependentGraphicsDocuments, Integer> {

}
