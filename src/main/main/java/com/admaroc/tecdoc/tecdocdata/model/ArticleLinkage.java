package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleLinkageId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="400_article_linkage")
public class ArticleLinkage {

    @EmbeddedId
    ArticleLinkageId id;
    int dLNr;
    int sA;
    int loschFlag;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleLinkage")
    private List<ProposedCriteria> proposedCriteria;
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
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleLinkage")
    private List<LinkageDependentGraphicsDocuments >linkageDependentGraphicsDocuments;
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

    public ArticleLinkage() {
    }

    public ArticleLinkage(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.loschFlag = loschFlag;
    }

    public List<ProposedCriteria> getProposedCriteria() {
        return proposedCriteria;
    }

    public void setProposedCriteria(List<ProposedCriteria> proposedCriteria) {
        this.proposedCriteria = proposedCriteria;
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

    public List<LinkageDependentGraphicsDocuments> getLinkageDependentGraphicsDocuments() {
        return linkageDependentGraphicsDocuments;
    }

    public void setLinkageDependentGraphicsDocuments(List<LinkageDependentGraphicsDocuments> linkageDependentGraphicsDocuments) {
        this.linkageDependentGraphicsDocuments = linkageDependentGraphicsDocuments;
    }

    public CriteriaTable getCriteriaTable() {
        return criteriaTable;
    }

    public void setCriteriaTable(CriteriaTable criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public ArticleLinkageId getId() {
        return id;
    }

    public void setId(ArticleLinkageId id) {
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


    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
