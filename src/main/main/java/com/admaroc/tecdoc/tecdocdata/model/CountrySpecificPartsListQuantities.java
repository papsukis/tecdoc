package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountrySpecificPartsListQuantitiesId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="216_country_specific_parts_lists_quantities")
public class CountrySpecificPartsListQuantities {

    @EmbeddedId
    CountrySpecificPartsListQuantitiesId id;
    private int dLNr;
    private int sA;
    private int menge;

    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr",
                referencedColumnName = "artNr")
    private ArticleTable articleTable;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("PartsListsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "artNr",
                    referencedColumnName = "artNr"),
            @JoinColumn(
                    name = "lfdNr",
                    referencedColumnName = "lfdNr")})
    private PartsLists partsLists;

    public CountrySpecificPartsListQuantities() {
    }

    public CountrySpecificPartsListQuantities(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.menge = menge;
    }

    public ArticleTable getArticleTable() {
        return articleTable;
    }

    public void setArticleTable(ArticleTable articleTable) {
        this.articleTable = articleTable;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public PartsLists getPartsLists() {
        return partsLists;
    }

    public void setPartsLists(PartsLists partsLists) {
        this.partsLists = partsLists;
    }

    public CountrySpecificPartsListQuantitiesId getId() {
        return id;
    }

    public void setId(CountrySpecificPartsListQuantitiesId id) {
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


    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

}
