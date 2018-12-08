package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.GraphicsDocuments;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.GraphicsDocumentsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsDocumentsRepository extends JpaRepository<GraphicsDocuments, GraphicsDocumentsId> {


}
