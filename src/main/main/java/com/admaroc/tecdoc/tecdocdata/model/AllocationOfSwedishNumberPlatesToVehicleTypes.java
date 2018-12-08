package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfSwedishNumberPlatesToVehicleTypesId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="128_allocation_of_swedish_number_plates_to_vehicle_types")
public class AllocationOfSwedishNumberPlatesToVehicleTypes {

    @EmbeddedId
    AllocationOfSwedishNumberPlatesToVehicleTypesId id;
    int dLNr;
    int sA;


    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "allocationOfSwedishNumberPlatesToVehicleTypes")
    private List<VehicleTypes> vehicleTypes;

    public AllocationOfSwedishNumberPlatesToVehicleTypes() {
    }

    public AllocationOfSwedishNumberPlatesToVehicleTypes(Map<String,String> datas) {
        this.id = new AllocationOfSwedishNumberPlatesToVehicleTypesId(datas.get("STyp"),Integer.valueOf(datas.get("KTypNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
    }

    public List<VehicleTypes> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public AllocationOfSwedishNumberPlatesToVehicleTypesId getId() {
        return id;
    }

    public void setId(AllocationOfSwedishNumberPlatesToVehicleTypesId id) {
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
