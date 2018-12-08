package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.SwissTypeNumberAllocationToVehicleTypesId;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="126_swiss_type_number_allocation_to_vehicle_types")
public class SwissTypeNumberAllocationToVehicleTypes {

@EmbeddedId
    SwissTypeNumberAllocationToVehicleTypesId id;
    int dLNr;
    int sA;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "swissTypeNumberAllocationToVehicleTypes")
    private List<VehicleTypes> vehicleTypes;

    public SwissTypeNumberAllocationToVehicleTypes() {
    }

    public SwissTypeNumberAllocationToVehicleTypes(Map<String,String> datas) {
        this.id = new SwissTypeNumberAllocationToVehicleTypesId(datas.get("ChTyp"),Integer.valueOf(datas.get("KTypNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
    }

    public List<VehicleTypes> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public SwissTypeNumberAllocationToVehicleTypesId getId() {
        return id;
    }

    public void setId(SwissTypeNumberAllocationToVehicleTypesId id) {
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
