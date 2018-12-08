package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.GraphicsDocumentsId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="231_graphics_documents")
public class GraphicsDocuments {

    @EmbeddedId
    GraphicsDocumentsId id;
    int dLNr;
    int sA;
    String bildname;
    int bildType;
    int bezNorm;
    int breit;
    int hoch;
    int farben;
    int loschFlag;
    String url;

    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "graphicsDocuments")
    private List<DataSupplierLogos> dataSupplierLogos;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "graphicsDocuments")
    private List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics >allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    @MapsId("sprachNr")
    @ManyToOne
    @JoinColumn(name = "sprachNr",
                referencedColumnName = "sprachNr")
    private Language language;
    @MapsId("LanguageDescriptions")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "bezNr",
                    referencedColumnName = "bezNr"),
            @JoinColumn(
                    name = "sprachNr",
                    referencedColumnName = "sprachNr")})
    private LanguageDescriptions languageDescriptions;
    @MapsId("dokumentenArt")
    @ManyToOne
    @JoinColumn(name = "dokumentenArt",
                referencedColumnName = "dokumentenArt")
    private DocumentTypes documentTypes;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "graphicsDocuments")
    private List<AllocationOfGraphicsToArticleNumbers> allocationOfGraphicsToArticleNumbers;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "graphicsDocuments")
    private List<ContextSensitiveGraphics> contextSensitiveGraphics;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "graphicsDocuments")
    private List<LinkageDependentGraphicsDocuments> linkageDependentGraphicsDocuments;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;

    public GraphicsDocuments() {
    }

    public GraphicsDocuments(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.bildname = bildname;
        this.bildType = bildType;
        this.bezNorm = bezNorm;
        this.breit = breit;
        this.hoch = hoch;
        this.farben = farben;
        this.loschFlag = loschFlag;
        this.url = url;
    }

    public List<DataSupplierLogos> getDataSupplierLogos() {
        return dataSupplierLogos;
    }

    public void setDataSupplierLogos(List<DataSupplierLogos> dataSupplierLogos) {
        this.dataSupplierLogos = dataSupplierLogos;
    }

    public List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics> getAllocationOfPartsListCoordinatesToContextSensitiveGraphics() {
        return allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    }

    public void setAllocationOfPartsListCoordinatesToContextSensitiveGraphics(List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics> allocationOfPartsListCoordinatesToContextSensitiveGraphics) {
        this.allocationOfPartsListCoordinatesToContextSensitiveGraphics = allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LanguageDescriptions getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(LanguageDescriptions languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
    }

    public DocumentTypes getDocumentTypes() {
        return documentTypes;
    }

    public void setDocumentTypes(DocumentTypes documentTypes) {
        this.documentTypes = documentTypes;
    }

    public List<AllocationOfGraphicsToArticleNumbers> getAllocationOfGraphicsToArticleNumbers() {
        return allocationOfGraphicsToArticleNumbers;
    }

    public void setAllocationOfGraphicsToArticleNumbers(List<AllocationOfGraphicsToArticleNumbers> allocationOfGraphicsToArticleNumbers) {
        this.allocationOfGraphicsToArticleNumbers = allocationOfGraphicsToArticleNumbers;
    }

    public List<ContextSensitiveGraphics> getContextSensitiveGraphics() {
        return contextSensitiveGraphics;
    }

    public void setContextSensitiveGraphics(List<ContextSensitiveGraphics> contextSensitiveGraphics) {
        this.contextSensitiveGraphics = contextSensitiveGraphics;
    }

    public List<LinkageDependentGraphicsDocuments> getLinkageDependentGraphicsDocuments() {
        return linkageDependentGraphicsDocuments;
    }

    public void setLinkageDependentGraphicsDocuments(List<LinkageDependentGraphicsDocuments> linkageDependentGraphicsDocuments) {
        this.linkageDependentGraphicsDocuments = linkageDependentGraphicsDocuments;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public GraphicsDocumentsId getId() {
        return id;
    }

    public void setId(GraphicsDocumentsId id) {
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


    public String getBildname() {
        return bildname;
    }

    public void setBildname(String bildname) {
        this.bildname = bildname;
    }

    public int getBildType() {
        return bildType;
    }

    public void setBildType(int bildType) {
        this.bildType = bildType;
    }

    public int getBezNorm() {
        return bezNorm;
    }

    public void setBezNorm(int bezNorm) {
        this.bezNorm = bezNorm;
    }

    public int getBreit() {
        return breit;
    }

    public void setBreit(int breit) {
        this.breit = breit;
    }

    public int getHoch() {
        return hoch;
    }

    public void setHoch(int hoch) {
        this.hoch = hoch;
    }

    public int getFarben() {
        return farben;
    }

    public void setFarben(int farben) {
        this.farben = farben;
    }


    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
