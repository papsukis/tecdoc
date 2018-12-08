package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.TransmissionCountryRestrictionsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="545_transmission_country_restrictions")
public class TransmissionCountryRestrictions {

    @EmbeddedId
    TransmissionCountryRestrictionsId id;
    int dLNr;
    int sA;
    int exclude;
    int loschFlag;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("getrNr")
    @ManyToOne
    @JoinColumn(name = "getrNr",
                referencedColumnName = "getrNr")
    private Transmission transmission;

    public TransmissionCountryRestrictions() {
    }

    public TransmissionCountryRestrictions(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.exclude = exclude;
        this.loschFlag = loschFlag;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public TransmissionCountryRestrictionsId getId() {
        return id;
    }

    public void setId(TransmissionCountryRestrictionsId id) {
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
