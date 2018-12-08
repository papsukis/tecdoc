package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.DataSupplierMainAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSupplierMainAddressRepository extends JpaRepository<DataSupplierMainAddress, Integer> {

    }
