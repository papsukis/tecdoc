package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="160_axle")
public class Axle {

    @Id
    int aTypNr;
    int dLNr;
    int sA;
    String bezeichnung;
    int kmodNr;
    int sortNr;
    int bjvon;
    int bjbis;
    int achsArt;
    int ausfuhrung;
    int bremsAusf;
    int achskorper;
    int zulLastVon;
    int zulLastBis;
    int radBefestigung;
    int spurweite;
    String nabensystem;
    int fahrhoheVon;
    int fahrhoheBis;
    int delet;
    int loschFlag;

    @MapsId("kModNr")
    @ManyToOne
    @JoinColumn(name = "kModNr",
                referencedColumnName = "kModNr")
    private VehicleModelSeries vehicleModelSeries;
    @MapsId("KeyTablesEntriesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "axle")
    private List<AllocationOfAxleTypesToCVTypes> allocationOfAxleTypesToCVTypes;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "axle")
    private List<AxleBrakeSize> axleBrakeSizes;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "axle")
    private List<AxleWheelbases> axleWheelbases;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "axle")
    private List<AxleBodyTypes> axleBodyTypes;

    public Axle() {
    }

    public Axle(Map<String,String> datas) {
        this.aTypNr = Integer.valueOf(datas.get("AtypNr"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.bezeichnung = datas.get("Bezeichnung");
        this.kmodNr = Integer.valueOf(datas.get("KmodNr"));
        this.sortNr = Integer.valueOf(datas.get("SortNr"));
        this.bjvon = Integer.valueOf(datas.get("Bjvon"));
        this.bjbis = Integer.valueOf(datas.get("Bjbis"));
        this.achsArt = Integer.valueOf(datas.get("AchsArt"));
        this.ausfuhrung = Integer.valueOf(datas.get("Ausführung"));
        this.bremsAusf = Integer.valueOf(datas.get("BremsAusf"));
        this.achskorper = Integer.valueOf(datas.get("Achskörper"));
        this.zulLastVon = Integer.valueOf(datas.get("ZulLastVon"));
        this.zulLastBis = Integer.valueOf(datas.get("ZulLastBis"));
        this.radBefestigung = Integer.valueOf(datas.get("RadBefestigung"));
        this.spurweite = Integer.valueOf(datas.get("Spurweite"));
        this.nabensystem = datas.get("Nabensystem");
        this.fahrhoheVon = Integer.valueOf(datas.get("Fahrhöhe von"));
        this.fahrhoheBis = Integer.valueOf(datas.get("Fahrhöhe bis"));
        this.delet = Integer.valueOf(datas.get("Delete"));
        this.loschFlag = 0;
    }

    public VehicleModelSeries getVehicleModelSeries() {
        return vehicleModelSeries;
    }

    public void setVehicleModelSeries(VehicleModelSeries vehicleModelSeries) {
        this.vehicleModelSeries = vehicleModelSeries;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public List<AllocationOfAxleTypesToCVTypes> getAllocationOfAxleTypesToCVTypes() {
        return allocationOfAxleTypesToCVTypes;
    }

    public void setAllocationOfAxleTypesToCVTypes(List<AllocationOfAxleTypesToCVTypes> allocationOfAxleTypesToCVTypes) {
        this.allocationOfAxleTypesToCVTypes = allocationOfAxleTypesToCVTypes;
    }

    public List<AxleBrakeSize> getAxleBrakeSizes() {
        return axleBrakeSizes;
    }

    public void setAxleBrakeSizes(List<AxleBrakeSize> axleBrakeSizes) {
        this.axleBrakeSizes = axleBrakeSizes;
    }

    public List<AxleWheelbases> getAxleWheelbases() {
        return axleWheelbases;
    }

    public void setAxleWheelbases(List<AxleWheelbases> axleWheelbases) {
        this.axleWheelbases = axleWheelbases;
    }

    public List<AxleBodyTypes> getAxleBodyTypes() {
        return axleBodyTypes;
    }

    public void setAxleBodyTypes(List<AxleBodyTypes> axleBodyTypes) {
        this.axleBodyTypes = axleBodyTypes;
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

    public int getaTypNr() {
        return aTypNr;
    }

    public void setaTypNr(int aTypNr) {
        this.aTypNr = aTypNr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getKmodNr() {
        return kmodNr;
    }

    public void setKmodNr(int kmodNr) {
        this.kmodNr = kmodNr;
    }

    public int getSortNr() {
        return sortNr;
    }

    public void setSortNr(int sortNr) {
        this.sortNr = sortNr;
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

    public int getAchsArt() {
        return achsArt;
    }

    public void setAchsArt(int achsArt) {
        this.achsArt = achsArt;
    }

    public int getAusfuhrung() {
        return ausfuhrung;
    }

    public void setAusfuhrung(int ausfuhrung) {
        this.ausfuhrung = ausfuhrung;
    }

    public int getBremsAusf() {
        return bremsAusf;
    }

    public void setBremsAusf(int bremsAusf) {
        this.bremsAusf = bremsAusf;
    }

    public int getAchskorper() {
        return achskorper;
    }

    public void setAchskorper(int achskorper) {
        this.achskorper = achskorper;
    }

    public int getZulLastVon() {
        return zulLastVon;
    }

    public void setZulLastVon(int zulLastVon) {
        this.zulLastVon = zulLastVon;
    }

    public int getZulLastBis() {
        return zulLastBis;
    }

    public void setZulLastBis(int zulLastBis) {
        this.zulLastBis = zulLastBis;
    }

    public int getRadBefestigung() {
        return radBefestigung;
    }

    public void setRadBefestigung(int radBefestigung) {
        this.radBefestigung = radBefestigung;
    }

    public int getSpurweite() {
        return spurweite;
    }

    public void setSpurweite(int spurweite) {
        this.spurweite = spurweite;
    }

    public String getNabensystem() {
        return nabensystem;
    }

    public void setNabensystem(String nabensystem) {
        this.nabensystem = nabensystem;
    }

    public int getFahrhoheVon() {
        return fahrhoheVon;
    }

    public void setFahrhoheVon(int fahrhoheVon) {
        this.fahrhoheVon = fahrhoheVon;
    }

    public int getFahrhoheBis() {
        return fahrhoheBis;
    }

    public void setFahrhoheBis(int fahrhoheBis) {
        this.fahrhoheBis = fahrhoheBis;
    }

    public int getDelete() {
        return delet;
    }

    public void setDelete(int delet) {
        this.delet = delet;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
