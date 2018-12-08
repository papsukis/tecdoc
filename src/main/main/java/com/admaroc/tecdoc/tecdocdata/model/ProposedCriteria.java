package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ProposedCriteriaId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="329_proposed_criteria")
public class ProposedCriteria {

    @EmbeddedId
    ProposedCriteriaId id;
    int dLNr;
    int sA;
    String lKZ;
    int kritNr;
    int n210;
    int n400;
    int exclude;
    int loschFlag;
    @MapsId("CriteriaId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "artNr",
                    referencedColumnName = "artNr"),
            @JoinColumn(
                    name = "sortNr",
                    referencedColumnName = "sortNr")})

    private ArticleCriteria articleCriteria;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId(value="genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;
    @MapsId("CriteriaId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "dLNr",
                    referencedColumnName = "dLNr"),
            @JoinColumn(
                    name = "kritNr",
                    referencedColumnName = "kritNr")})
    private CriteriaTable criteriaTable;
    @MapsId("ArticleLinkageId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "artNr",
                    referencedColumnName = "artNr"),
            @JoinColumn(
                    name = "genArtNr",
                    referencedColumnName = "genArtNr"),
            @JoinColumn(
                    name = "vknZielArt",
                    referencedColumnName = "vknZielArt"),
            @JoinColumn(
                    name = "vknZielNr",
                    referencedColumnName = "vknZielNr"),
            @JoinColumn(
                    name = "lfdNr",
                    referencedColumnName = "lfdNr")})
    private ArticleLinkage articleLinkage;

    public ProposedCriteria() {
    }

    public ProposedCriteria(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.lKZ = lKZ;
        this.kritNr = kritNr;
        this.n210 = n210;
        this.n400 = n400;
        this.exclude = exclude;
        this.loschFlag = loschFlag;
    }

    public ArticleLinkage getArticleLinkage() {
        return articleLinkage;
    }

    public void setArticleLinkage(ArticleLinkage articleLinkage) {
        this.articleLinkage = articleLinkage;
    }

    public ArticleCriteria getArticleCriteria() {
        return articleCriteria;
    }

    public void setArticleCriteria(ArticleCriteria articleCriteria) {
        this.articleCriteria = articleCriteria;
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

    public CriteriaTable getCriteriaTable() {
        return criteriaTable;
    }

    public void setCriteriaTable(CriteriaTable criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public ProposedCriteriaId getId() {
        return id;
    }

    public void setId(ProposedCriteriaId id) {
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

    public int getKritNr() {
        return kritNr;
    }

    public void setKritNr(int kritNr) {
        this.kritNr = kritNr;
    }

    public int getN210() {
        return n210;
    }

    public void setN210(int n210) {
        this.n210 = n210;
    }

    public int getN400() {
        return n400;
    }

    public void setN400(int n400) {
        this.n400 = n400;
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
