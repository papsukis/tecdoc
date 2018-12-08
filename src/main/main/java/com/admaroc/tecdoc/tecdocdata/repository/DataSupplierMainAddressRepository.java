package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.DataSupplierMainAddress;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.DataSupplierMainAddressId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSupplierMainAddressRepository extends JpaRepository<DataSupplierMainAddress, DataSupplierMainAddressId> {

    }
