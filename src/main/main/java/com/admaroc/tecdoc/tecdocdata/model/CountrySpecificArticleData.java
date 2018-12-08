package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountrySpecificArticleDataId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="212_country_specific_article_data")
public class CountrySpecificArticleData {

    @EmbeddedId
    CountrySpecificArticleDataId id;
    int dLNr;
    int sA;
    String vPE;
    int mengeProVPE;
    int artStat;
    int statusDat;
    int loschFlag;

    @MapsId("KeyTablesEntriesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;
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

    public CountrySpecificArticleData() {
    }

    public CountrySpecificArticleData(Map<String,String> datas) {
        this.id = new CountrySpecificArticleDataId(datas.get("ArtNr"),datas.get("LKZ"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.vPE = datas.get("VPE");
        this.mengeProVPE = Integer.valueOf(datas.get("MengeProVPE"));
        this.artStat = Integer.valueOf(datas.get("MengeProVPE"));
        this.statusDat = Integer.valueOf(datas.get("StatusDat"));
        this.loschFlag = 0;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
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

    public CountrySpecificArticleDataId getId() {
        return id;
    }

    public void setId(CountrySpecificArticleDataId id) {
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


    public String getvPE() {
        return vPE;
    }

    public void setvPE(String vPE) {
        this.vPE = vPE;
    }

    public int getMengeProVPE() {
        return mengeProVPE;
    }

    public void setMengeProVPE(int mengeProVPE) {
        this.mengeProVPE = mengeProVPE;
    }

    public int getArtStat() {
        return artStat;
    }

    public void setArtStat(int artStat) {
        this.artStat = artStat;
    }

    public int getStatusDat() {
        return statusDat;
    }

    public void setStatusDat(int statusDat) {
        this.statusDat = statusDat;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
