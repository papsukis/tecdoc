package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVCountrySpecificDeviationsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="534_cv_country_specific_deviations")
public class CVCountrySpecificDeviations {

    @EmbeddedId
    CVCountrySpecificDeviationsId id;
    int dLNr;
    int sA;
    int bjvon;
    int bjbis;
    int loschFlag;

    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("nTypeNr")
    @ManyToOne
    @JoinColumn(name = "nTypeNr",
                referencedColumnName = "nTypeNr")
    private CVTypes cvTypes;

    public CVCountrySpecificDeviations() {
    }

    public CVCountrySpecificDeviations(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.bjvon = bjvon;
        this.bjbis = bjbis;
        this.loschFlag = loschFlag;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public CVTypes getCvTypes() {
        return cvTypes;
    }

    public void setCvTypes(CVTypes cvTypes) {
        this.cvTypes = cvTypes;
    }

    public CVCountrySpecificDeviationsId getId() {
        return id;
    }

    public void setId(CVCountrySpecificDeviationsId id) {
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

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
