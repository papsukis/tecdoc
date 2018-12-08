package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.LinkageDependentGraphicsDocumentsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="432_linkage_dependent_graphics_documents")
public class LinkageDependentGraphicsDocuments {

    @EmbeddedId
    LinkageDependentGraphicsDocumentsId id;
    int dLNr;
    int sA;
    String lKZ;
    int bildNr;
    int dokumentenArt;
    int exclude;
    int loschFlag;

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
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("dokumentenArt")
    @ManyToOne
    @JoinColumn(name = "dokumentenArt",
                referencedColumnName = "dokumentenArt")
    private DocumentTypes documentTypes;
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;
    @MapsId("GraphicsDocumentsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "bildNr",
                    referencedColumnName = "bildNr"),
            @JoinColumn(
                    name = "dokumentenArt",
                    referencedColumnName = "dokumentenArt"),
            @JoinColumn(
                    name="sprachNr",
                    referencedColumnName = "sprachNr")})
    private GraphicsDocuments graphicsDocuments;
    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr",
                referencedColumnName = "artNr")
    private ArticleTable articleTable;

    public LinkageDependentGraphicsDocuments() {
    }

    public LinkageDependentGraphicsDocuments(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.lKZ = lKZ;
        this.bildNr = bildNr;
        this.dokumentenArt = dokumentenArt;
        this.exclude = exclude;
        this.loschFlag = loschFlag;
    }

    public ArticleLinkage getArticleLinkage() {
        return articleLinkage;
    }

    public void setArticleLinkage(ArticleLinkage articleLinkage) {
        this.articleLinkage = articleLinkage;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public DocumentTypes getDocumentTypes() {
        return documentTypes;
    }

    public void setDocumentTypes(DocumentTypes documentTypes) {
        this.documentTypes = documentTypes;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public GraphicsDocuments getGraphicsDocuments() {
        return graphicsDocuments;
    }

    public void setGraphicsDocuments(GraphicsDocuments graphicsDocuments) {
        this.graphicsDocuments = graphicsDocuments;
    }

    public ArticleTable getArticleTable() {
        return articleTable;
    }

    public void setArticleTable(ArticleTable articleTable) {
        this.articleTable = articleTable;
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

    public LinkageDependentGraphicsDocumentsId getId() {
        return id;
    }

    public void setId(LinkageDependentGraphicsDocumentsId id) {
        this.id = id;
    }

    public String getlKZ() {
        return lKZ;
    }

    public void setlKZ(String lKZ) {
        this.lKZ = lKZ;
    }


    public int getBildNr() {
        return bildNr;
    }

    public void setBildNr(int bildNr) {
        this.bildNr = bildNr;
    }

    public int getDokumentenArt() {
        return dokumentenArt;
    }

    public void setDokumentenArt(int dokumentenArt) {
        this.dokumentenArt = dokumentenArt;
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
