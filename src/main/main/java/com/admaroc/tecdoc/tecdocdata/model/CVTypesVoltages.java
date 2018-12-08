package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVTypesVoltagesId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="540_types_voltages")
public class CVTypesVoltages {

    @EmbeddedId
    CVTypesVoltagesId id;
    int dLNr;
    int sA;
    int volt;
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
                    name = "nTypSubNr",
                    referencedColumnName = "nTypSubNr")})
    private CVSecondaryTypes cvSecondaryTypes;
    @MapsId("CVTypesId")
    @ManyToOne
    @JoinColumn(name = "nTypeNr",
                referencedColumnName = "nTypeNr")
    private CVTypes cvTypes;

    public CVTypesVoltages() {
    }

    public CVTypesVoltages(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.volt = volt;
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

    public CVTypesVoltagesId getId() {
        return id;
    }

    public void setId(CVTypesVoltagesId id) {
        this.id = id;
    }

    public CVTypes getCvTypes() {
        return cvTypes;
    }

    public void setCvTypes(CVTypes cvTypes) {
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

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
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
