package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="544_transmission")
public class Transmission {

    @Id
    int getrNr;
    int dLNr;
    int sA;
    int herNr;
    String code;
    int getrArt;
    int bjvon;
    int bjbis;
    int trmin;
    int trmax;
    int trinv;
    String ID;
    int gaenge;
    int loschFlag;

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
            mappedBy = "transmission")
    private List<AllocationOfATransmissionToACV> allocationOfATransmissionToACVS;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "transmission")
    private List<TransmissionCountryRestrictions> transmissionCountryRestrictions;

    public Transmission() {
    }

    public Transmission(Map<String,String> datas) {
        this.getrNr = getrNr;
        this.dLNr = dLNr;
        this.sA = sA;
        this.herNr = herNr;
        this.code = code;
        this.getrArt = getrArt;
        this.bjvon = bjvon;
        this.bjbis = bjbis;
        this.trmin = trmin;
        this.trmax = trmax;
        this.trinv = trinv;
        this.ID = ID;
        this.gaenge = gaenge;
        this.loschFlag = loschFlag;
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

    public List<AllocationOfATransmissionToACV> getAllocationOfATransmissionToACVS() {
        return allocationOfATransmissionToACVS;
    }

    public void setAllocationOfATransmissionToACVS(List<AllocationOfATransmissionToACV> allocationOfATransmissionToACVS) {
        this.allocationOfATransmissionToACVS = allocationOfATransmissionToACVS;
    }

    public List<TransmissionCountryRestrictions> getTransmissionCountryRestrictions() {
        return transmissionCountryRestrictions;
    }

    public void setTransmissionCountryRestrictions(List<TransmissionCountryRestrictions> transmissionCountryRestrictions) {
        this.transmissionCountryRestrictions = transmissionCountryRestrictions;
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

    public int getGetrNr() {
        return getrNr;
    }

    public void setGetrNr(int getrNr) {
        this.getrNr = getrNr;
    }

    public int getHerNr() {
        return herNr;
    }

    public void setHerNr(int herNr) {
        this.herNr = herNr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getGetrArt() {
        return getrArt;
    }

    public void setGetrArt(int getrArt) {
        this.getrArt = getrArt;
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

    public int getTrmin() {
        return trmin;
    }

    public void setTrmin(int trmin) {
        this.trmin = trmin;
    }

    public int getTrmax() {
        return trmax;
    }

    public void setTrmax(int trmax) {
        this.trmax = trmax;
    }

    public int getTrinv() {
        return trinv;
    }

    public void setTrinv(int trinv) {
        this.trinv = trinv;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getGaenge() {
        return gaenge;
    }

    public void setGaenge(int gaenge) {
        this.gaenge = gaenge;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
