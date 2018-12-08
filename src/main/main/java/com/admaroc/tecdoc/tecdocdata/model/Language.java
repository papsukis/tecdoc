package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="020_language")
public class Language {

    @Id
    int sprachNr;
    int dLNr;
    int sA;
    int bezNr;
    String isoCode;
    int codePage;
    int loschFlag;

    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "language")
    private List<LanguageDescriptions> languageDescriptions;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "language")
    private List<TextModules> textModules;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "language")
    private List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics> allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "language")
    private List<GraphicsDocuments> graphicsDocuments;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "language")
    private List<ContextSensitiveGraphics> contextSensitiveGraphics;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "language")
    private List<GenericArticleSynonyms> genericArticleSynonyms;

    public Language() {
    }

    public Language(Map<String,String> datas) {
        this.sprachNr = Integer.valueOf(datas.get("SprachNr"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.bezNr = Integer.valueOf(datas.get("BezNr"));
        this.isoCode = datas.get("ISO Code");
        this.codePage = Integer.valueOf(datas.get("Codepage"));
        this.loschFlag = 0;
    }

    public List<LanguageDescriptions> getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(List<LanguageDescriptions> languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
    }

    public List<TextModules> getTextModules() {
        return textModules;
    }

    public void setTextModules(List<TextModules> textModules) {
        this.textModules = textModules;
    }

    public List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics> getAllocationOfPartsListCoordinatesToContextSensitiveGraphics() {
        return allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    }

    public void setAllocationOfPartsListCoordinatesToContextSensitiveGraphics(List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics> allocationOfPartsListCoordinatesToContextSensitiveGraphics) {
        this.allocationOfPartsListCoordinatesToContextSensitiveGraphics = allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    }

    public List<GraphicsDocuments> getGraphicsDocuments() {
        return graphicsDocuments;
    }

    public void setGraphicsDocuments(List<GraphicsDocuments> graphicsDocuments) {
        this.graphicsDocuments = graphicsDocuments;
    }

    public List<ContextSensitiveGraphics> getContextSensitiveGraphics() {
        return contextSensitiveGraphics;
    }

    public void setContextSensitiveGraphics(List<ContextSensitiveGraphics> contextSensitiveGraphics) {
        this.contextSensitiveGraphics = contextSensitiveGraphics;
    }

    public List<GenericArticleSynonyms> getGenericArticleSynonyms() {
        return genericArticleSynonyms;
    }

    public void setGenericArticleSynonyms(List<GenericArticleSynonyms> genericArticleSynonyms) {
        this.genericArticleSynonyms = genericArticleSynonyms;
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

    public int getSprachNr() {
        return sprachNr;
    }

    public void setSprachNr(int sprachNr) {
        this.sprachNr = sprachNr;
    }

    public int getBezNr() {
        return bezNr;
    }

    public void setBezNr(int bezNr) {
        this.bezNr = bezNr;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public int getCodePage() {
        return codePage;
    }

    public void setCodePage(int codePage) {
        this.codePage = codePage;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
