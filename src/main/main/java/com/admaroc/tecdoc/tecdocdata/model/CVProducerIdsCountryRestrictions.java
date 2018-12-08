package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVProducerIdsCountryRestrictionsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="555_cv_producer_ids_country_restrictions")
public class CVProducerIdsCountryRestrictions {

    @EmbeddedId
    CVProducerIdsCountryRestrictionsId id;
    int dLNr;
    int sA;
    int exclude;
    int loschFlag;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("herlDNr")
    @ManyToOne
    @JoinColumn(name = "herlDNr",
                referencedColumnName = "herlDNr")
    private CVProducerIDs cvProducerIDs;

    public CVProducerIdsCountryRestrictions() {
    }

    public CVProducerIdsCountryRestrictions(Map<String,String> datas) {
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

    public CVProducerIDs getCvProducerIDs() {
        return cvProducerIDs;
    }

    public void setCvProducerIDs(CVProducerIDs cvProducerIDs) {
        this.cvProducerIDs = cvProducerIDs;
    }

    public CVProducerIdsCountryRestrictionsId getId() {
        return id;
    }

    public void setId(CVProducerIdsCountryRestrictionsId id) {
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
