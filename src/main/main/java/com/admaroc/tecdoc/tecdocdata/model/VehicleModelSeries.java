package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="110_vehicle_model_series")
public class VehicleModelSeries {

    @Id
    int kModNr;
    int dLNr;
    int sA;
    int lBezNr;
    int herNr;
    int sortNr;
    int bjvon;
    int bJBis;
    int pKW;
    int nKW;
    int achse;
    int delet;
    int transporter;
    int loschFlag;

    @MapsId("herNr")
    @ManyToOne
    @JoinColumn(name = "herNr",
                referencedColumnName = "herNr")
    private Manufacturer manufacturer;
    @MapsId("CountryAndLanguageDependentDescriptionsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "lBezNr",
                    referencedColumnName = "lBezNr"),
            @JoinColumn(
                    name = "lKZ",
                    referencedColumnName = "lKZ"),
            @JoinColumn(
                    name="sprachNr",
                    referencedColumnName = "sprachNr")})
    private CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleModelSeries")
    private List<VehicleTypes > vehicleTypes;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleModelSeries")
    private List<Axle >axle;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleModelSeries")
    private List<AdditionalDescriptionsToVehicleModelSeries >additionalDescriptionsToVehicleModelSeries;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleModelSeries")
    private List<AllocationOfBodyTypesToModelSeries> allocationOfBodyTypesToModelSeries;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleModelSeries")
    private List<BodyTypeSynonyms> bodyTypeSynonyms;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleModelSeries")
    private List<CVTypes> cvTypes;

    public VehicleModelSeries() {
    }

    public VehicleModelSeries(Map<String,String> datas) {
        this.kModNr = Integer.valueOf(datas.get("KModNr"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.lBezNr = Integer.valueOf(datas.get("LBezNr"));
        this.herNr = Integer.valueOf(datas.get("HerNr"));
        this.sortNr = Integer.valueOf(datas.get("SortNr"));
        this.bjvon = Integer.valueOf(datas.get("Bjvon"));
        this.bJBis = Integer.valueOf(datas.get("BJBis"));
        this.pKW = Integer.valueOf(datas.get("PKW"));
        this.nKW = Integer.valueOf(datas.get("NKW"));
        this.achse = Integer.valueOf(datas.get("Achse"));
        this.delet = Integer.valueOf(datas.get("Delete"));
        this.transporter = Integer.valueOf(datas.get("Transporter"));
        this.loschFlag = 0;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CountryAndLanguageDependentDescriptions getCountryAndLanguageDependentDescriptions() {
        return countryAndLanguageDependentDescriptions;
    }

    public void setCountryAndLanguageDependentDescriptions(CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions) {
        this.countryAndLanguageDependentDescriptions = countryAndLanguageDependentDescriptions;
    }

    public List<VehicleTypes> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public List<Axle> getAxle() {
        return axle;
    }

    public void setAxle(List<Axle> axle) {
        this.axle = axle;
    }

    public List<AdditionalDescriptionsToVehicleModelSeries> getAdditionalDescriptionsToVehicleModelSeries() {
        return additionalDescriptionsToVehicleModelSeries;
    }

    public void setAdditionalDescriptionsToVehicleModelSeries(List<AdditionalDescriptionsToVehicleModelSeries> additionalDescriptionsToVehicleModelSeries) {
        this.additionalDescriptionsToVehicleModelSeries = additionalDescriptionsToVehicleModelSeries;
    }

    public List<AllocationOfBodyTypesToModelSeries> getAllocationOfBodyTypesToModelSeries() {
        return allocationOfBodyTypesToModelSeries;
    }

    public void setAllocationOfBodyTypesToModelSeries(List<AllocationOfBodyTypesToModelSeries> allocationOfBodyTypesToModelSeries) {
        this.allocationOfBodyTypesToModelSeries = allocationOfBodyTypesToModelSeries;
    }

    public List<BodyTypeSynonyms> getBodyTypeSynonyms() {
        return bodyTypeSynonyms;
    }

    public void setBodyTypeSynonyms(List<BodyTypeSynonyms> bodyTypeSynonyms) {
        this.bodyTypeSynonyms = bodyTypeSynonyms;
    }

    public List<CVTypes> getCvTypes() {
        return cvTypes;
    }

    public void setCvTypes(List<CVTypes> cvTypes) {
        this.cvTypes = cvTypes;
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

    public int getkModNr() {
        return kModNr;
    }

    public void setkModNr(int kModNr) {
        this.kModNr = kModNr;
    }

    public int getlBezNr() {
        return lBezNr;
    }

    public void setlBezNr(int lBezNr) {
        this.lBezNr = lBezNr;
    }

    public int getHerNr() {
        return herNr;
    }

    public void setHerNr(int herNr) {
        this.herNr = herNr;
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

    public int getbJBis() {
        return bJBis;
    }

    public void setbJBis(int bJBis) {
        this.bJBis = bJBis;
    }

    public int getpKW() {
        return pKW;
    }

    public void setpKW(int pKW) {
        this.pKW = pKW;
    }

    public int getnKW() {
        return nKW;
    }

    public void setnKW(int nKW) {
        this.nKW = nKW;
    }

    public int getAchse() {
        return achse;
    }

    public void setAchse(int achse) {
        this.achse = achse;
    }

    public int getDelete() {
        return delet;
    }

    public void setDelete(int delet) {
        this.delet = delet;
    }

    public int getTransporter() {
        return transporter;
    }

    public void setTransporter(int transporter) {
        this.transporter = transporter;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
