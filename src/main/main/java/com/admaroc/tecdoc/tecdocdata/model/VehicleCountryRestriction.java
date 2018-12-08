package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.VehicleCountryRestrictionId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="122_vehicle_country_restriction")
public class VehicleCountryRestriction {

    @EmbeddedId
    VehicleCountryRestrictionId id;
    int dLNr;
    int sA;
    int exclude;
    int loschFlag;

    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("kTypNr")
    @ManyToOne
    @JoinColumn(name = "kTypNr",
                referencedColumnName = "kTypNr")
    private VehicleTypes vehicleTypes;

    public VehicleCountryRestriction() {
    }

    public VehicleCountryRestriction(Map<String,String> datas) {
        this.id = new VehicleCountryRestrictionId(Integer.valueOf(datas.get("KTypNr")),datas.get("LKZ"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.exclude = Integer.valueOf(datas.get("Exclude"));
        this.loschFlag = 0;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(VehicleTypes vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public VehicleCountryRestrictionId getId() {
        return id;
    }

    public void setId(VehicleCountryRestrictionId id) {
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


    public int getExclude() {
        return exclude;
    }

    public void setExclude(int exclude) {
        this.exclude = exclude;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
