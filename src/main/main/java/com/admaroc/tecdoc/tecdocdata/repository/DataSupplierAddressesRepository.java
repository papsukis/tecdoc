package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.DataSupplierAddresses;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.DataSupplierAdressesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSupplierAddressesRepository extends JpaRepository<DataSupplierAddresses, DataSupplierAdressesId> {


}
