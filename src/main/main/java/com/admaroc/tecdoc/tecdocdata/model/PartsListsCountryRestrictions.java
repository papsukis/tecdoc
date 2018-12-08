package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.PartsListsCountryRestrictionsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="215_parts_lists_country_restrictions")
public class PartsListsCountryRestrictions {

    @EmbeddedId
    PartsListsCountryRestrictionsId id;
    int dLNr;
    int sA;
    int exclude;
    int loschFlag;

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

    public PartsListsCountryRestrictions() {
    }

    public PartsListsCountryRestrictions(Map<String,String> datas) {
        this.id = new PartsListsCountryRestrictionsId(datas.get("ArtNr"),Integer.valueOf(datas.get("LfdNr")),datas.get("LKZ"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.exclude = Integer.valueOf(datas.get("Exclude"));
        this.loschFlag = 0;
    }

    public PartsLists getPartsLists() {
        return partsLists;
    }

    public void setPartsLists(PartsLists partsLists) {
        this.partsLists = partsLists;
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

    public PartsListsCountryRestrictionsId getId() {
        return id;
    }

    public void setId(PartsListsCountryRestrictionsId id) {
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
