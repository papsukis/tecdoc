package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AustrianNatCodesId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="129_austrian_natcodes")
public class AustrianNatCodes {

    @EmbeddedId
    AustrianNatCodesId id;
    int dLNr;
    int sA;


    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "austrianNatCodes")
    private List<VehicleTypes> vehicleTypes;

    public AustrianNatCodes() {
    }

    public AustrianNatCodes(Map<String,String> datas) {
        this.id = new AustrianNatCodesId(datas.get("STyp"),Integer.valueOf(datas.get("KTypNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
    }

    public AustrianNatCodesId getId() {
        return id;
    }

    public void setId(AustrianNatCodesId id) {
        this.id = id;
    }

    public List<VehicleTypes> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
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
