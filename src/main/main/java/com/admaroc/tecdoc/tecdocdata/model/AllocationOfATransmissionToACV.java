package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfATransmissionToACVId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="546_allocation_of_a_transmission_to_a_cv")
public class AllocationOfATransmissionToACV {

    @EmbeddedId
    AllocationOfATransmissionToACVId id;
    int dLNr;
    int sA;
    int getrNr;
    int bjvon;
    int bjbis;
    String lKZ;
    int exclude;
    int loschFlag;

    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("CVSecondaryTypesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "nTypNr",
                    referencedColumnName = "nTypNr"),
            @JoinColumn(
                    name = "NtypSubNr",
                    referencedColumnName = "NtypSubNr")
    })
    private CVSecondaryTypes cvSecondaryTypes;
    @MapsId("nTypeNr")
    @ManyToOne
    @JoinColumn(name = "nTypeNr",
                referencedColumnName = "nTypeNr")
    private CVTypes cvTypes;
    @MapsId("getrNr")
    @ManyToOne
    @JoinColumn(name = "getrNr",
                referencedColumnName = "getrNr")
    private Transmission transmission;

    public AllocationOfATransmissionToACV() {
    }

    public AllocationOfATransmissionToACV(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.getrNr = getrNr;
        this.bjvon = bjvon;
        this.bjbis = bjbis;
        this.lKZ = lKZ;
        this.exclude = exclude;
        this.loschFlag = loschFlag;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public CVSecondaryTypes getCvSecondaryTypes() {
        return cvSecondaryTypes;
    }

    public void setCvSecondaryTypes(CVSecondaryTypes cvSecondaryTypes) {
        this.cvSecondaryTypes = cvSecondaryTypes;
    }

    public CVTypes getCvTypes() {
        return cvTypes;
    }

    public void setCvTypes(CVTypes cvTypes) {
        this.cvTypes = cvTypes;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
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

    public AllocationOfATransmissionToACVId getId() {
        return id;
    }

    public void setId(AllocationOfATransmissionToACVId id) {
        this.id = id;
    }

    public int getGetrNr() {
        return getrNr;
    }

    public void setGetrNr(int getrNr) {
        this.getrNr = getrNr;
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

    public String getlKZ() {
        return lKZ;
    }

    public void setlKZ(String lKZ) {
        this.lKZ = lKZ;
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
