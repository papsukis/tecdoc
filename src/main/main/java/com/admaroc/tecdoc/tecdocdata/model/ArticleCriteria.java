package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleCriteriaId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="210_article_criteria")
public class ArticleCriteria {

    @EmbeddedId
    ArticleCriteriaId id;
    int dLNr;
    int sA;
    String reserviert;
    int kritNr;
    String kritWert;
    int anzSofort;
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
    @MapsId("ProposedCriteriaId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "genArtNr",
                    referencedColumnName = "genArtNr"),
            @JoinColumn(
                    name = "lfdNr",
                    referencedColumnName = "lfdNr")})
    private ProposedCriteria proposedCriteria;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
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

    public ArticleCriteria() {
    }

    public ArticleCriteria(Map<String,String> datas) {
        this.id = new ArticleCriteriaId(datas.get("ArtNr"),Integer.valueOf(datas.get("SortNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.reserviert = datas.get("Reserviert");
        this.kritNr = Integer.valueOf(datas.get("KritNr"));
        this.kritWert = datas.get("KritWert");
        this.anzSofort = Integer.valueOf(datas.get("AnzSofort1"));
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

    public ProposedCriteria getProposedCriteria() {
        return proposedCriteria;
    }

    public void setProposedCriteria(ProposedCriteria proposedCriteria) {
        this.proposedCriteria = proposedCriteria;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public CriteriaTable getCriteriaTable() {
        return criteriaTable;
    }

    public void setCriteriaTable(CriteriaTable criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public ArticleCriteriaId getId() {
        return id;
    }

    public void setId(ArticleCriteriaId id) {
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

    public String getReserviert() {
        return reserviert;
    }

    public void setReserviert(String reserviert) {
        this.reserviert = reserviert;
    }

    public int getKritNr() {
        return kritNr;
    }

    public void setKritNr(int kritNr) {
        this.kritNr = kritNr;
    }

    public String getKritWert() {
        return kritWert;
    }

    public void setKritWert(String kritWert) {
        this.kritWert = kritWert;
    }

    public int getAnzSofort() {
        return anzSofort;
    }

    public void setAnzSofort(int anzSofort) {
        this.anzSofort = anzSofort;
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
