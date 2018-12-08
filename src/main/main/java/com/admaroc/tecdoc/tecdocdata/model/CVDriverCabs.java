package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="541_cv_driver_cabs")
public class CVDriverCabs {

    @Id
    int fHausNr;
    int dLNr;
    int sA;
    int herNr;
    int kModNr;
    String baumuster;
    int lbezNr;
    int size;
    int bjvon;
    int bjbis;
    int lenght;
    int width;
    int delet;
    int loschFlag;

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
                    name = "sprachNr",
                    referencedColumnName = "sprachNr")})
    private CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions;
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
    @MapsId("herNr")
    @ManyToOne
    @JoinColumn(name = "herNr",
                referencedColumnName = "herNr")
    private Manufacturer manufacturer;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "cvDriverCabs")
    private List<CVDriverCabCountryRestrictions> cvDriverCabCountryRestrictions;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "cvDriverCabs")
    private List<AllocationOfDriverCabsToCVs> allocationOfDriverCabsToCVs;

    public CVDriverCabs() {
    }

    public CVDriverCabs(Map<String,String> datas) {
        this.fHausNr = fHausNr;
        this.dLNr = dLNr;
        this.sA = sA;
        this.herNr = herNr;
        this.kModNr = kModNr;
        this.baumuster = baumuster;
        this.lbezNr = lbezNr;
        this.size = size;
        this.bjvon = bjvon;
        this.bjbis = bjbis;
        this.lenght = lenght;
        this.width = width;
        this.delet = delet;
        this.loschFlag = loschFlag;
    }

    public CountryAndLanguageDependentDescriptions getCountryAndLanguageDependentDescriptions() {
        return countryAndLanguageDependentDescriptions;
    }

    public void setCountryAndLanguageDependentDescriptions(CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions) {
        this.countryAndLanguageDependentDescriptions = countryAndLanguageDependentDescriptions;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<CVDriverCabCountryRestrictions> getCvDriverCabCountryRestrictions() {
        return cvDriverCabCountryRestrictions;
    }

    public void setCvDriverCabCountryRestrictions(List<CVDriverCabCountryRestrictions> cvDriverCabCountryRestrictions) {
        this.cvDriverCabCountryRestrictions = cvDriverCabCountryRestrictions;
    }

    public List<AllocationOfDriverCabsToCVs> getAllocationOfDriverCabsToCVs() {
        return allocationOfDriverCabsToCVs;
    }

    public void setAllocationOfDriverCabsToCVs(List<AllocationOfDriverCabsToCVs> allocationOfDriverCabsToCVs) {
        this.allocationOfDriverCabsToCVs = allocationOfDriverCabsToCVs;
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

    public int getfHausNr() {
        return fHausNr;
    }

    public void setfHausNr(int fHausNr) {
        this.fHausNr = fHausNr;
    }

    public int getHerNr() {
        return herNr;
    }

    public void setHerNr(int herNr) {
        this.herNr = herNr;
    }

    public int getkModNr() {
        return kModNr;
    }

    public void setkModNr(int kModNr) {
        this.kModNr = kModNr;
    }

    public String getBaumuster() {
        return baumuster;
    }

    public void setBaumuster(String baumuster) {
        this.baumuster = baumuster;
    }

    public int getLbezNr() {
        return lbezNr;
    }

    public void setLbezNr(int lbezNr) {
        lbezNr = lbezNr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
