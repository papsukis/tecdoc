package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.EngineNumberAllocationtoVehicleTypesId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="125_engine_number_allocation_to_vehicle_types")
public class EngineNumberAllocationtoVehicleTypes {


    @EmbeddedId
    EngineNumberAllocationtoVehicleTypesId id;
    int dLNr;
    int sA;
    int motNr;
    int bjvon;
    int bjbis;
    int exclude;
    String lKZ;
    int loschFlag;
    @MapsId("kTypNr")
    @ManyToOne
    @JoinColumn(name = "kTypNr",
                referencedColumnName = "kTypNr")
    private VehicleTypes vehicleTypes;
    @MapsId("motNr")
    @ManyToOne
    @JoinColumn(name = "motNr",
                referencedColumnName = "motNr")
    private Engines engines;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;

    public EngineNumberAllocationtoVehicleTypes() {
    }

    public EngineNumberAllocationtoVehicleTypes(Map<String,String> datas) {
        this.id = new EngineNumberAllocationtoVehicleTypesId(Integer.valueOf(datas.get("KTypNr")),Integer.valueOf(datas.get("LfdNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.motNr = Integer.valueOf(datas.get("MotNr"));
        this.bjvon = Integer.valueOf(datas.get("Bjvon"));
        this.bjbis = Integer.valueOf(datas.get("Bjbis"));
        this.lKZ=datas.get("LKZ");
        this.exclude = Integer.valueOf(datas.get("Exclude"));
        this.loschFlag = 0;
    }

    public String getlKZ() {
        return lKZ;
    }

    public void setlKZ(String lKZ) {
        this.lKZ = lKZ;
    }

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(VehicleTypes vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public EngineNumberAllocationtoVehicleTypesId getId() {
        return id;
    }

    public void setId(EngineNumberAllocationtoVehicleTypesId id) {
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


    public int getMotNr() {
        return motNr;
    }

    public void setMotNr(int motNr) {
        this.motNr = motNr;
    }

    public int getBjvon() {
        return bjvon;
    }

    public void setBjvon(int bjvon) {
        this.bjvon = bjvon;
    }

    public int getBjbis() {
        return bjbis;
    }

    public void setBjbis(int bjbis) {
        this.bjbis = bjbis;
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
