package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfDriverCabsToCVsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="543_allocation_of_driver_cabs_to_cvs")
public class AllocationOfDriverCabsToCVs {

    @EmbeddedId
    AllocationOfDriverCabsToCVsId id;
    int dLNr;
    int sA;
    int fHausNr;
    int bjvon;
    int bjbis;

    int exclude;
    int loschFlag;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("fHausNr")
    @ManyToOne
    @JoinColumn(name = "fHausNr",
                referencedColumnName = "fHausNr")
    private CVDriverCabs cvDriverCabs;
    @MapsId("CVSecondaryTypesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "nTypNr",
                    referencedColumnName = "nTypNr"),
            @JoinColumn(
                    name = "nTypSubNr",
                    referencedColumnName = "nTypSubNr")})
    private CVSecondaryTypes cvSecondaryTypes;
    @MapsId("nTypeNr")
    @ManyToOne
    @JoinColumn(name = "nTypeNr",
                referencedColumnName = "nTypeNr")
    private CVTypes cvTypes;


    public AllocationOfDriverCabsToCVs() {
    }

    public AllocationOfDriverCabsToCVs(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.fHausNr = fHausNr;
        this.bjvon = bjvon;
        this.bjbis = bjbis;
        this.exclude = exclude;
        this.loschFlag = loschFlag;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public CVDriverCabs getCvDriverCabs() {
        return cvDriverCabs;
    }

    public void setCvDriverCabs(CVDriverCabs cvDriverCabs) {
        this.cvDriverCabs = cvDriverCabs;
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


    public AllocationOfDriverCabsToCVsId getId() {
        return id;
    }

    public void setId(AllocationOfDriverCabsToCVsId id) {
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

    public int getfHausNr() {
        return fHausNr;
    }

    public void setfHausNr(int fHausNr) {
        this.fHausNr = fHausNr;
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
