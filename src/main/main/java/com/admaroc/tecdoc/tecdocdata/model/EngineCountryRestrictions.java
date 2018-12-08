package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.EngineCountryRestrictionsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="156_engine_country_restrictions")
public class EngineCountryRestrictions {

    @EmbeddedId
    EngineCountryRestrictionsId id;
    int dLNr;
    int sA;
    int loschFlag;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("motNr")
    @ManyToOne
    @JoinColumn(name = "motNr",
                referencedColumnName = "motNr")
    private Engines engines;

    public EngineCountryRestrictions() {
    }

    public EngineCountryRestrictions(Map<String,String> datas) {
        this.id = new EngineCountryRestrictionsId(Integer.valueOf(datas.get("MotNr")),datas.get("LKZ"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.loschFlag = 0;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public EngineCountryRestrictionsId getId() {
        return id;
    }

    public void setId(EngineCountryRestrictionsId id) {
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


    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
