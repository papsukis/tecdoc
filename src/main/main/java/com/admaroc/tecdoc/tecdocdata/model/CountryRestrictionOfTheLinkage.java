package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountryRestrictionOfTheLinkageId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="403_country_restriction_of_the_linkage")
public class CountryRestrictionOfTheLinkage {

    @EmbeddedId
    CountryRestrictionOfTheLinkageId id;
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
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
            referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;

    public CountryRestrictionOfTheLinkage() {
    }

    public CountryRestrictionOfTheLinkage(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
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

    public CountryRestrictionOfTheLinkageId getId() {
        return id;
    }

    public void setId(CountryRestrictionOfTheLinkageId id) {
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
