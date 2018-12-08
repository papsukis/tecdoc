package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.LanguageDescriptionsID;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="030_language_descriptions")
public class LanguageDescriptions {

    @EmbeddedId
    LanguageDescriptionsID id;
    int dlNr;
    int sA;
    String bez;
    int loschFlag;


    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<CountryTable> countryTable;
    @MapsId("sprachNr")
    @ManyToOne
    @JoinColumn(name = "sprachNr",
                referencedColumnName = "sprachNr")
    private Language language;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<DocumentTypes >documentTypes;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<TecdocSearchStructure> tecdocSearchStructure;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<QuickStartIcons> quickStartIcons;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<AccessoryLists >accessoryLists;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<KeyTables> keyTables;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<KeyTablesEntries> keyTablesEntries;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<CriteriaTable >criteriaTable;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<GraphicsDocuments >graphicsDocuments;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<PurposeOfUse> purposeOfUse;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<AssemblyGroups> assemblyGroups;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<StandardisedArticleDescription> standardisedArticleDescription;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "languageDescriptions")
    private List<GenericArticles> genericArticles;

    public LanguageDescriptions() {
    }

    public LanguageDescriptions(Map<String,String> datas) {
        this.id = new LanguageDescriptionsID(Integer.valueOf(datas.get("BezNr")),Integer.valueOf(datas.get("SprachNr")));
        this.dlNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.bez = datas.get("Bez");
        this.loschFlag = 0;
    }

    public List<CountryTable> getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(List<CountryTable> countryTable) {
        this.countryTable = countryTable;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<DocumentTypes> getDocumentTypes() {
        return documentTypes;
    }

    public void setDocumentTypes(List<DocumentTypes> documentTypes) {
        this.documentTypes = documentTypes;
    }

    public List<TecdocSearchStructure> getTecdocSearchStructure() {
        return tecdocSearchStructure;
    }

    public void setTecdocSearchStructure(List<TecdocSearchStructure> tecdocSearchStructure) {
        this.tecdocSearchStructure = tecdocSearchStructure;
    }

    public List<QuickStartIcons> getQuickStartIcons() {
        return quickStartIcons;
    }

    public void setQuickStartIcons(List<QuickStartIcons> quickStartIcons) {
        this.quickStartIcons = quickStartIcons;
    }

    public List<AccessoryLists> getAccessoryLists() {
        return accessoryLists;
    }

    public void setAccessoryLists(List<AccessoryLists> accessoryLists) {
        this.accessoryLists = accessoryLists;
    }

    public List<KeyTables> getKeyTables() {
        return keyTables;
    }

    public void setKeyTables(List<KeyTables> keyTables) {
        this.keyTables = keyTables;
    }

    public List<KeyTablesEntries> getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(List<KeyTablesEntries> keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public List<CriteriaTable> getCriteriaTable() {
        return criteriaTable;
    }

    public void setCriteriaTable(List<CriteriaTable> criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public List<GraphicsDocuments> getGraphicsDocuments() {
        return graphicsDocuments;
    }

    public void setGraphicsDocuments(List<GraphicsDocuments> graphicsDocuments) {
        this.graphicsDocuments = graphicsDocuments;
    }

    public List<PurposeOfUse> getPurposeOfUse() {
        return purposeOfUse;
    }

    public void setPurposeOfUse(List<PurposeOfUse> purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }

    public List<AssemblyGroups> getAssemblyGroups() {
        return assemblyGroups;
    }

    public void setAssemblyGroups(List<AssemblyGroups> assemblyGroups) {
        this.assemblyGroups = assemblyGroups;
    }

    public List<StandardisedArticleDescription> getStandardisedArticleDescription() {
        return standardisedArticleDescription;
    }

    public void setStandardisedArticleDescription(List<StandardisedArticleDescription> standardisedArticleDescription) {
        this.standardisedArticleDescription = standardisedArticleDescription;
    }

    public List<GenericArticles> getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(List<GenericArticles> genericArticles) {
        this.genericArticles = genericArticles;
    }

    public LanguageDescriptionsID getId() {
        return id;
    }

    public void setId(LanguageDescriptionsID id) {
        this.id = id;
    }

    public int getDlNr() {
        return dlNr;
    }

    public void setDlNr(int dlNr) {
        this.dlNr = dlNr;
    }

    public int getsA() {
        return sA;
    }

    public void setsA(int sA) {
        this.sA = sA;
    }

    public String getBez() {
        return bez;
    }

    public void setBez(String bez) {
        this.bez = bez;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
