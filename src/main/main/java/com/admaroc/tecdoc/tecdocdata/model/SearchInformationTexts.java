package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.SearchInformationTextsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="401_search_information_texts")
public class SearchInformationTexts {

    @EmbeddedId
    SearchInformationTextsId id;
    int dLNr;
    int sA;
    String lKZ;
    int infArt;
    int anzSofort;
    String tBSNr;
    int exclude;
    int loschFlag;

    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr")
    private ArticleTable articleTable;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ")
    private CountryTable countryTable;
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr")
    private GenericArticles genericArticles;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;
    @MapsId("TextModulesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tBSNr",
                    referencedColumnName = "tBSNr"),
            @JoinColumn(
                    name = "sprachNr",
                    referencedColumnName = "sprachNr"),
            @JoinColumn(
                    name="lfdNr",
                    referencedColumnName = "lfdNr")})
    private TextModules textModules;

    public SearchInformationTexts() {
    }

    public SearchInformationTexts(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.lKZ = lKZ;
        this.infArt = infArt;
        this.anzSofort = anzSofort;
        this.tBSNr = tBSNr;
        this.exclude = exclude;
        this.loschFlag = loschFlag;
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

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public TextModules getTextModules() {
        return textModules;
    }

    public void setTextModules(TextModules textModules) {
        this.textModules = textModules;
    }

    public SearchInformationTextsId getId() {
        return id;
    }

    public void setId(SearchInformationTextsId id) {
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

    public String getlKZ() {
        return lKZ;
    }

    public void setlKZ(String lKZ) {
        this.lKZ = lKZ;
    }

    public int getInfArt() {
        return infArt;
    }

    public void setInfArt(int infArt) {
        this.infArt = infArt;
    }

    public int getAnzSofort() {
        return anzSofort;
    }

    public void setAnzSofort(int anzSofort) {
        this.anzSofort = anzSofort;
    }

    public String gettBSNr() {
        return tBSNr;
    }

    public void settBSNr(String tBSNr) {
        this.tBSNr = tBSNr;
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
