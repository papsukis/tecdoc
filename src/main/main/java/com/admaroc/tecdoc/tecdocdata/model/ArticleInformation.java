package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleInformationId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="206_article_information")
public class ArticleInformation {

    @EmbeddedId
    ArticleInformationId id;
    int dLNr;
    int sA;
    String lKZ;
    int infArt;
    int anzSofort;
    String TBSNr;
    int exclude;
    int loschFlag;

    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr",
                referencedColumnName = "artNr")
    private ArticleTable articleTable;
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
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
                    name = "lfdNr",
                    referencedColumnName = "lfdNr")})
    private TextModules textModules;
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

    public ArticleInformation() {
    }

    public ArticleInformation(Map<String,String> datas) {
        this.id = new ArticleInformationId(datas.get("ArtNr"),Integer.valueOf(datas.get("SortNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.lKZ = datas.get("LKZ");
        this.infArt = Integer.valueOf(datas.get("InfArt"));
        this.anzSofort = Integer.valueOf(datas.get("AnzSofort"));
        this.TBSNr =datas.get("TBSNr");
        this.exclude = Integer.valueOf(datas.get("Exclude"));
        this.loschFlag = 0;
    }

    public ArticleTable getArticleTable() {
        return articleTable;
    }

    public void setArticleTable(ArticleTable articleTable) {
        this.articleTable = articleTable;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public TextModules getTextModules() {
        return textModules;
    }

    public void setTextModules(TextModules textModules) {
        this.textModules = textModules;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public ArticleInformationId getId() {
        return id;
    }

    public void setId(ArticleInformationId id) {
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

    public String getTBSNr() {
        return TBSNr;
    }

    public void setTBSNr(String TBSNr) {
        this.TBSNr = TBSNr;
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
