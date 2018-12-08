package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="320_generic_articles")
public class GenericArticles {


    int dLNr;
    int sA;
    @Id
    int genArtNr;
    int nartNr;
    int bgNr;
    int verWNr;
    int oKPKW;
    int oKNKW;
    int oKMotor;
    int oKUniversal;
    int oKFZGUnab;
    int delet;
    int oKAchse;
    int loschFlag;

    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "genericArticles")
    private List<ArticleInformation> articleInformations;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "articleTable")
    private List<CountryRestrictionOfTheLinkage> countryRestrictionOfTheLinkages;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "articleTable")
    private List<SortingOfTheLinkage> sortingOfTheLinkages;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<PartsLists> partsLists;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<AccessoryLists> accessoryLists;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<MandatoryCriteria> mandatoryCriteria;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<ProposedCriteria> proposedCriteria;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<AllocationOfCriteriaValuesToGAMandatoryCriteria> allocationOfCriteriaValuesToGAMandatoryCriteria;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<ArticleLinkage> articleLinkages;
    @MapsId("LanguageDescriptionsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "bezNr",
                    referencedColumnName = "bezNr"),
            @JoinColumn(
                    name = "sprachNr",
                    referencedColumnName = "sprachNr")})
    private LanguageDescriptions languageDescriptions;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<AllocationOfCriteriaToTheSearchStructure> allocationOfCriteriaToTheSearchStructures;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<AllocationOfGenArtToSearchStructure> allocationOfGenArtToSearchStructures;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<ArticleToGenericArticleAllocation> articleToGenericArticleAllocations;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<GenericArticleSynonyms> genericArticleSynonyms;
    @MapsId("nartNr")
    @ManyToOne
    @JoinColumn(name = "nartNr",
                referencedColumnName = "nartNr")
    private StandardisedArticleDescription standardisedArticleDescription;
    @MapsId("bgNr")
    @ManyToOne
    @JoinColumn(name = "bgNr",
                referencedColumnName = "bgNr")
    private AssemblyGroups assemblyGroups;
    @MapsId("verwNr")
    @ManyToOne
    @JoinColumn(name = "verwNr",
                referencedColumnName = "verwNr")
    private PurposeOfUse purposeOfUse;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "articleTable")
    private List<LinkageAttributes> linkageAttributes;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<ArticleCriteria> articleCriteria;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<SearchInformationTexts> searchInformationTexts;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<LinkagesNotToBeDisplayedInCertainCountries> linkagesNotToBeDisplayedInCertainCountries;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "genericArticles")
    private List<LinkageDependentGraphicsDocuments> linkageDependentGraphicsDocuments;

    public GenericArticles() {
    }

    public GenericArticles(Map<String,String> datas) {
        this.dLNr = dLNr;
        this.sA = sA;
        this.genArtNr = genArtNr;
        this.nartNr = nartNr;
        this.bgNr = bgNr;
        this.verWNr = verWNr;
        this.oKPKW = oKPKW;
        this.oKNKW = oKNKW;
        this.oKMotor = oKMotor;
        this.oKUniversal = oKUniversal;
        this.oKFZGUnab = oKFZGUnab;
        this.delet = delet;
        this.oKAchse = oKAchse;
        this.loschFlag = loschFlag;
    }

    public int getDelet() {
        return delet;
    }

    public void setDelet(int delet) {
        this.delet = delet;
    }

    public List<LinkageAttributes> getLinkageAttributes() {
        return linkageAttributes;
    }

    public void setLinkageAttributes(List<LinkageAttributes> linkageAttributes) {
        this.linkageAttributes = linkageAttributes;
    }

    public List<SortingOfTheLinkage> getSortingOfTheLinkages() {
        return sortingOfTheLinkages;
    }

    public void setSortingOfTheLinkages(List<SortingOfTheLinkage> sortingOfTheLinkages) {
        this.sortingOfTheLinkages = sortingOfTheLinkages;
    }

    public List<CountryRestrictionOfTheLinkage> getCountryRestrictionOfTheLinkages() {
        return countryRestrictionOfTheLinkages;
    }

    public void setCountryRestrictionOfTheLinkages(List<CountryRestrictionOfTheLinkage> countryRestrictionOfTheLinkages) {
        this.countryRestrictionOfTheLinkages = countryRestrictionOfTheLinkages;
    }

    public List<ArticleInformation> getArticleInformations() {
        return articleInformations;
    }

    public void setArticleInformations(List<ArticleInformation> articleInformations) {
        this.articleInformations = articleInformations;
    }

    public List<PartsLists> getPartsLists() {
        return partsLists;
    }

    public void setPartsLists(List<PartsLists> partsLists) {
        this.partsLists = partsLists;
    }

    public List<AccessoryLists> getAccessoryLists() {
        return accessoryLists;
    }

    public void setAccessoryLists(List<AccessoryLists> accessoryLists) {
        this.accessoryLists = accessoryLists;
    }

    public List<MandatoryCriteria> getMandatoryCriteria() {
        return mandatoryCriteria;
    }

    public void setMandatoryCriteria(List<MandatoryCriteria> mandatoryCriteria) {
        this.mandatoryCriteria = mandatoryCriteria;
    }

    public List<ProposedCriteria> getProposedCriteria() {
        return proposedCriteria;
    }

    public void setProposedCriteria(List<ProposedCriteria> proposedCriteria) {
        this.proposedCriteria = proposedCriteria;
    }

    public List<AllocationOfCriteriaValuesToGAMandatoryCriteria> getAllocationOfCriteriaValuesToGAMandatoryCriteria() {
        return allocationOfCriteriaValuesToGAMandatoryCriteria;
    }

    public void setAllocationOfCriteriaValuesToGAMandatoryCriteria(List<AllocationOfCriteriaValuesToGAMandatoryCriteria> allocationOfCriteriaValuesToGAMandatoryCriteria) {
        this.allocationOfCriteriaValuesToGAMandatoryCriteria = allocationOfCriteriaValuesToGAMandatoryCriteria;
    }

    public List<ArticleLinkage> getArticleLinkages() {
        return articleLinkages;
    }

    public void setArticleLinkages(List<ArticleLinkage> articleLinkages) {
        this.articleLinkages = articleLinkages;
    }

    public LanguageDescriptions getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(LanguageDescriptions languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
    }

    public List<AllocationOfCriteriaToTheSearchStructure> getAllocationOfCriteriaToTheSearchStructures() {
        return allocationOfCriteriaToTheSearchStructures;
    }

    public void setAllocationOfCriteriaToTheSearchStructures(List<AllocationOfCriteriaToTheSearchStructure> allocationOfCriteriaToTheSearchStructures) {
        this.allocationOfCriteriaToTheSearchStructures = allocationOfCriteriaToTheSearchStructures;
    }

    public List<AllocationOfGenArtToSearchStructure> getAllocationOfGenArtToSearchStructures() {
        return allocationOfGenArtToSearchStructures;
    }

    public void setAllocationOfGenArtToSearchStructures(List<AllocationOfGenArtToSearchStructure> allocationOfGenArtToSearchStructures) {
        this.allocationOfGenArtToSearchStructures = allocationOfGenArtToSearchStructures;
    }

    public List<ArticleToGenericArticleAllocation> getArticleToGenericArticleAllocations() {
        return articleToGenericArticleAllocations;
    }

    public void setArticleToGenericArticleAllocations(List<ArticleToGenericArticleAllocation> articleToGenericArticleAllocations) {
        this.articleToGenericArticleAllocations = articleToGenericArticleAllocations;
    }

    public List<GenericArticleSynonyms> getGenericArticleSynonyms() {
        return genericArticleSynonyms;
    }

    public void setGenericArticleSynonyms(List<GenericArticleSynonyms> genericArticleSynonyms) {
        this.genericArticleSynonyms = genericArticleSynonyms;
    }

    public StandardisedArticleDescription getStandardisedArticleDescription() {
        return standardisedArticleDescription;
    }

    public void setStandardisedArticleDescription(StandardisedArticleDescription standardisedArticleDescription) {
        this.standardisedArticleDescription = standardisedArticleDescription;
    }

    public AssemblyGroups getAssemblyGroups() {
        return assemblyGroups;
    }

    public void setAssemblyGroups(AssemblyGroups assemblyGroups) {
        this.assemblyGroups = assemblyGroups;
    }

    public PurposeOfUse getPurposeOfUse() {
        return purposeOfUse;
    }

    public void setPurposeOfUse(PurposeOfUse purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }

    public List<ArticleCriteria> getArticleCriteria() {
        return articleCriteria;
    }

    public void setArticleCriteria(List<ArticleCriteria> articleCriteria) {
        this.articleCriteria = articleCriteria;
    }

    public List<SearchInformationTexts> getSearchInformationTexts() {
        return searchInformationTexts;
    }

    public void setSearchInformationTexts(List<SearchInformationTexts> searchInformationTexts) {
        this.searchInformationTexts = searchInformationTexts;
    }

    public List<LinkagesNotToBeDisplayedInCertainCountries> getLinkagesNotToBeDisplayedInCertainCountries() {
        return linkagesNotToBeDisplayedInCertainCountries;
    }

    public void setLinkagesNotToBeDisplayedInCertainCountries(List<LinkagesNotToBeDisplayedInCertainCountries> linkagesNotToBeDisplayedInCertainCountries) {
        this.linkagesNotToBeDisplayedInCertainCountries = linkagesNotToBeDisplayedInCertainCountries;
    }

    public List<LinkageDependentGraphicsDocuments> getLinkageDependentGraphicsDocuments() {
        return linkageDependentGraphicsDocuments;
    }

    public void setLinkageDependentGraphicsDocuments(List<LinkageDependentGraphicsDocuments> linkageDependentGraphicsDocuments) {
        this.linkageDependentGraphicsDocuments = linkageDependentGraphicsDocuments;
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

    public int getGenArtNr() {
        return genArtNr;
    }

    public void setGenArtNr(int genArtNr) {
        this.genArtNr = genArtNr;
    }

    public int getNartNr() {
        return nartNr;
    }

    public void setNartNr(int nartNr) {
        this.nartNr = nartNr;
    }

    public int getBgNr() {
        return bgNr;
    }

    public void setBgNr(int bgNr) {
        this.bgNr = bgNr;
    }

    public int getVerWNr() {
        return verWNr;
    }

    public void setVerWNr(int verWNr) {
        this.verWNr = verWNr;
    }

    public int getoKPKW() {
        return oKPKW;
    }

    public void setoKPKW(int oKPKW) {
        this.oKPKW = oKPKW;
    }

    public int getoKNKW() {
        return oKNKW;
    }

    public void setoKNKW(int oKNKW) {
        this.oKNKW = oKNKW;
    }

    public int getoKMotor() {
        return oKMotor;
    }

    public void setoKMotor(int oKMotor) {
        this.oKMotor = oKMotor;
    }

    public int getoKUniversal() {
        return oKUniversal;
    }

    public void setoKUniversal(int oKUniversal) {
        this.oKUniversal = oKUniversal;
    }

    public int getoKFZGUnab() {
        return oKFZGUnab;
    }

    public void setoKFZGUnab(int oKFZGUnab) {
        this.oKFZGUnab = oKFZGUnab;
    }

    public int getDelete() {
        return delet;
    }

    public void setDelete(int delet) {
        this.delet = delet;
    }

    public int getoKAchse() {
        return oKAchse;
    }

    public void setoKAchse(int oKAchse) {
        this.oKAchse = oKAchse;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
