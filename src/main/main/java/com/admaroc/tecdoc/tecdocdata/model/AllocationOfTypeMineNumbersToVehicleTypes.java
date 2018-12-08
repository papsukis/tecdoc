package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfTypeMineNumbersToVehicleTypesId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="123_allocation_of_type_mine_numbers_to_vehicle_types")
public class AllocationOfTypeMineNumbersToVehicleTypes {

  @EmbeddedId
    AllocationOfTypeMineNumbersToVehicleTypesId id;
    int dLNr;
    int sA;

    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "allocationOfTypeMineNumbersToVehicleTypes")
    private List<VehicleTypes> vehicleTypes;


    public AllocationOfTypeMineNumbersToVehicleTypes() {
    }

    public AllocationOfTypeMineNumbersToVehicleTypes(Map<String,String> datas) {
        this.id = new AllocationOfTypeMineNumbersToVehicleTypesId(datas.get("TypMine"),Integer.valueOf(datas.get("KTypNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
    }

    public List<VehicleTypes> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public AllocationOfTypeMineNumbersToVehicleTypesId getId() {
        return id;
    }

    public void setId(AllocationOfTypeMineNumbersToVehicleTypesId id) {
        this.id = id;
    }

    public int getdLNr() {
        return dLNr;
    }

    public void setdLNr(int dLNr) {
        this.dLNr = dLNr;
    }

    public int getsA() {
        return sA;
    }

    public void setsA(int sA) {
        this.sA = sA;
    }

}
