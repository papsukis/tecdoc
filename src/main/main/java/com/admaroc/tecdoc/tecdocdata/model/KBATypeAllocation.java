package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.KBATypeAllocationId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="121_kba_type_allocation")
public class KBATypeAllocation {

    @EmbeddedId
    KBATypeAllocationId id;
    int dLNr;
    int sA;
    int aufbauArt;
    String aBENr;
    int aBEvon;
    String statHer;
    String statTyp;
    int loschFlag;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTableEntries;
    @MapsId("kTypNr")
    @ManyToOne
    @JoinColumn(name = "kTypNr",
                referencedColumnName = "kTypNr")
    private VehicleTypes vehicleTypes;

    public KBATypeAllocation() {
    }

    public KBATypeAllocation(Map<String,String> datas) {
        this.id = new KBATypeAllocationId(datas.get("KBANr"),Integer.valueOf(datas.get("KTypNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.aufbauArt = Integer.valueOf(datas.get("AufbauArt"));
        this.aBENr = datas.get("ABENr");
        this.aBEvon = Integer.valueOf(datas.get("ABEvon"));
        this.statHer = (datas.get("StatHer"));
        this.statTyp = (datas.get("StatTyp"));
        this.loschFlag = 0;
    }

    public KeyTablesEntries getKeyTableEntries() {
        return keyTableEntries;
    }

    public void setKeyTableEntries(KeyTablesEntries keyTableEntries) {
        this.keyTableEntries = keyTableEntries;
    }

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(VehicleTypes vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public KBATypeAllocationId getId() {
        return id;
    }

    public void setId(KBATypeAllocationId id) {
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


    public int getAufbauArt() {
        return aufbauArt;
    }

    public void setAufbauArt(int aufbauArt) {
        this.aufbauArt = aufbauArt;
    }

    public String getaBENr() {
        return aBENr;
    }

    public void setaBENr(String aBENr) {
        this.aBENr = aBENr;
    }

    public int getaBEvon() {
        return aBEvon;
    }

    public void setaBEvon(int aBEvon) {
        this.aBEvon = aBEvon;
    }

    public String getStatHer() {
        return statHer;
    }

    public void setStatHer(String statHer) {
        this.statHer = statHer;
    }

    public String getStatTyp() {
        return statTyp;
    }

    public void setStatTyp(String statTyp) {
        this.statTyp = statTyp;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
