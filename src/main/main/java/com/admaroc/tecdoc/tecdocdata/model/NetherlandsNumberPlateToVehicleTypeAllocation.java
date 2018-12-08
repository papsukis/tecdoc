package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.NetherlandsNumberPlateToVehicleTypeAllocationId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="127_netherlands_number_plate_to_vehicle_type_allocation")
public class NetherlandsNumberPlateToVehicleTypeAllocation {

@EmbeddedId
    NetherlandsNumberPlateToVehicleTypeAllocationId id;
    int dLNr;
    int sA;


    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "netherlandsNumberPlateToVehicleTypeAllocation")
    private List<VehicleTypes> vehicleTypes;

    public NetherlandsNumberPlateToVehicleTypeAllocation() {
    }

    public NetherlandsNumberPlateToVehicleTypeAllocation(Map<String,String> datas) {
        this.id = new NetherlandsNumberPlateToVehicleTypeAllocationId(datas.get("NLTyp"),Integer.valueOf(datas.get("KTypNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
    }

    public List<VehicleTypes> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public NetherlandsNumberPlateToVehicleTypeAllocationId getId() {
        return id;
    }

    public void setId(NetherlandsNumberPlateToVehicleTypeAllocationId id) {
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
