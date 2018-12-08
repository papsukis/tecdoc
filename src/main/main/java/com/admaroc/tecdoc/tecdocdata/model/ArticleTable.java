package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="200_article_table")
public class ArticleTable {

    @Id
    String artNr;
    int dLNr;
    int sA;
    int bezNr;
    int kZSB;
    int kZMat;
    int kZAT;
    int kZZub;
    int losGr1;
    int losGr2;
    int loschFlag;
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
            mappedBy = "articleTable")
    private List<CountryRestrictionOfTheLinkage> countryRestrictionOfTheLinkages;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "articleTable")
    private List<LinkageAttributes> linkageAttributes;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "articleTable")
    private List<SortingOfTheLinkage> sortingOfTheLinkages;

    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<CountrySpecificArticleData> countrySpecificArticleData;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<PriceInformation> priceInformations;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<PartsListsCountryRestrictions> partsListsCountryRestrictions;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<ArticleLinkage> articleLinkages;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<SearchInformationTexts> searchInformationTexts;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<LinkagesNotToBeDisplayedInCertainCountries> linkagesNotToBeDisplayedInCertainCountries;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<CountrySpecificPartsListQuantities> countrySpecificPartsListQuantities;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics> allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<AccessoryLists> accessoryLists;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<AccessoryListsCountryRestrictions> accessoryListsCountryRestrictions;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<CountrySpecificAcessoriesListsQuantities> countrySpecificAcessoriesListsQuantities;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<AllocationOfGraphicsToArticleNumbers> allocationOfGraphicsToArticleNumbers;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<ArticleToGenericArticleAllocation> articleToGenericArticleAllocations;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<ArticleCriteria> articleCriteria;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<EAN> eans;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<PartsListCritera> partsListCriteras;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<TradeNumbers> tradeNumbers;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<ArticleInformation> articleInformations;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<PartsLists> partsLists;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<SupersedingArticles> supersedingArticles;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<ReferenceNumbers> referenceNumbers;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "articleTable")
    private List<ArticleCountryRestrictions> articleCountryRestrictions;

    public ArticleTable() {
    }

    public ArticleTable(Map<String,String> datas) {
        this.artNr =datas.get("ArtNr");
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.bezNr = Integer.valueOf(datas.get("BezNr"));
        this.kZSB = Integer.valueOf(datas.get("KZSB"));
        this.kZMat = Integer.valueOf(datas.get("KZMat"));
        this.kZAT = Integer.valueOf(datas.get("KZAT"));
        this.kZZub = Integer.valueOf(datas.get("KZZub"));
        this.losGr1 = Integer.valueOf(datas.get("LosGr1"));
        this.losGr2 = Integer.valueOf(datas.get("LosGr2"));
        this.loschFlag = 0;
    }

    public List<LinkageAttributes> getLinkageAttributes() {
        return linkageAttributes;
    }

    public void setLinkageAttributes(List<LinkageAttributes> linkageAttributes) {
        this.linkageAttributes = linkageAttributes;
    }

    public List<CountryRestrictionOfTheLinkage> getCountryRestrictionOfTheLinkages() {
        return countryRestrictionOfTheLinkages;
    }

    public List<SortingOfTheLinkage> getSortingOfTheLinkages() {
        return sortingOfTheLinkages;
    }

    public void setSortingOfTheLinkages(List<SortingOfTheLinkage> sortingOfTheLinkages) {
        this.sortingOfTheLinkages = sortingOfTheLinkages;
    }

    public void setCountryRestrictionOfTheLinkages(List<CountryRestrictionOfTheLinkage> countryRestrictionOfTheLinkages) {
        this.countryRestrictionOfTheLinkages = countryRestrictionOfTheLinkages;
    }

    public LanguageDescriptions getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(LanguageDescriptions languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
    }

    public List<CountrySpecificArticleData> getCountrySpecificArticleData() {
        return countrySpecificArticleData;
    }

    public void setCountrySpecificArticleData(List<CountrySpecificArticleData> countrySpecificArticleData) {
        this.countrySpecificArticleData = countrySpecificArticleData;
    }

    public List<PriceInformation> getPriceInformations() {
        return priceInformations;
    }

    public void setPriceInformations(List<PriceInformation> priceInformations) {
        this.priceInformations = priceInformations;
    }

    public List<PartsListsCountryRestrictions> getPartsListsCountryRestrictions() {
        return partsListsCountryRestrictions;
    }

    public void setPartsListsCountryRestrictions(List<PartsListsCountryRestrictions> partsListsCountryRestrictions) {
        this.partsListsCountryRestrictions = partsListsCountryRestrictions;
    }

    public List<ArticleLinkage> getArticleLinkages() {
        return articleLinkages;
    }

    public void setArticleLinkages(List<ArticleLinkage> articleLinkages) {
        this.articleLinkages = articleLinkages;
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

    public List<CountrySpecificPartsListQuantities> getCountrySpecificPartsListQuantities() {
        return countrySpecificPartsListQuantities;
    }

    public void setCountrySpecificPartsListQuantities(List<CountrySpecificPartsListQuantities> countrySpecificPartsListQuantities) {
        this.countrySpecificPartsListQuantities = countrySpecificPartsListQuantities;
    }

    public List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics> getAllocationOfPartsListCoordinatesToContextSensitiveGraphics() {
        return allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    }

    public void setAllocationOfPartsListCoordinatesToContextSensitiveGraphics(List<AllocationOfPartsListCoordinatesToContextSensitiveGraphics> allocationOfPartsListCoordinatesToContextSensitiveGraphics) {
        this.allocationOfPartsListCoordinatesToContextSensitiveGraphics = allocationOfPartsListCoordinatesToContextSensitiveGraphics;
    }

    public List<AccessoryLists> getAccessoryLists() {
        return accessoryLists;
    }

    public void setAccessoryLists(List<AccessoryLists> accessoryLists) {
        this.accessoryLists = accessoryLists;
    }

    public List<AccessoryListsCountryRestrictions> getAccessoryListsCountryRestrictions() {
        return accessoryListsCountryRestrictions;
    }

    public void setAccessoryListsCountryRestrictions(List<AccessoryListsCountryRestrictions> accessoryListsCountryRestrictions) {
        this.accessoryListsCountryRestrictions = accessoryListsCountryRestrictions;
    }

    public List<CountrySpecificAcessoriesListsQuantities> getCountrySpecificAcessoriesListsQuantities() {
        return countrySpecificAcessoriesListsQuantities;
    }

    public void setCountrySpecificAcessoriesListsQuantities(List<CountrySpecificAcessoriesListsQuantities> countrySpecificAcessoriesListsQuantities) {
        this.countrySpecificAcessoriesListsQuantities = countrySpecificAcessoriesListsQuantities;
    }

    public List<AllocationOfGraphicsToArticleNumbers> getAllocationOfGraphicsToArticleNumbers() {
        return allocationOfGraphicsToArticleNumbers;
    }

    public void setAllocationOfGraphicsToArticleNumbers(List<AllocationOfGraphicsToArticleNumbers> allocationOfGraphicsToArticleNumbers) {
        this.allocationOfGraphicsToArticleNumbers = allocationOfGraphicsToArticleNumbers;
    }

    public List<ArticleToGenericArticleAllocation> getArticleToGenericArticleAllocations() {
        return articleToGenericArticleAllocations;
    }

    public void setArticleToGenericArticleAllocations(List<ArticleToGenericArticleAllocation> articleToGenericArticleAllocations) {
        this.articleToGenericArticleAllocations = articleToGenericArticleAllocations;
    }

    public List<ArticleCriteria> getArticleCriteria() {
        return articleCriteria;
    }

    public void setArticleCriteria(List<ArticleCriteria> articleCriteria) {
        this.articleCriteria = articleCriteria;
    }

    public List<EAN> getEans() {
        return eans;
    }

    public void setEans(List<EAN> eans) {
        this.eans = eans;
    }

    public List<PartsListCritera> getPartsListCriteras() {
        return partsListCriteras;
    }

    public void setPartsListCriteras(List<PartsListCritera> partsListCriteras) {
        this.partsListCriteras = partsListCriteras;
    }

    public List<TradeNumbers> getTradeNumbers() {
        return tradeNumbers;
    }

    public void setTradeNumbers(List<TradeNumbers> tradeNumbers) {
        this.tradeNumbers = tradeNumbers;
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

    public List<SupersedingArticles> getSupersedingArticles() {
        return supersedingArticles;
    }

    public void setSupersedingArticles(List<SupersedingArticles> supersedingArticles) {
        this.supersedingArticles = supersedingArticles;
    }

    public List<ReferenceNumbers> getReferenceNumbers() {
        return referenceNumbers;
    }

    public void setReferenceNumbers(List<ReferenceNumbers> referenceNumbers) {
        this.referenceNumbers = referenceNumbers;
    }

    public List<ArticleCountryRestrictions> getArticleCountryRestrictions() {
        return articleCountryRestrictions;
    }

    public void setArticleCountryRestrictions(List<ArticleCountryRestrictions> articleCountryRestrictions) {
        this.articleCountryRestrictions = articleCountryRestrictions;
    }

    public String getArtNr() {
        return artNr;
    }

    public void setArtNr(String artNr) {
        this.artNr = artNr;
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

    public int getBezNr() {
        return bezNr;
    }

    public void setBezNr(int bezNr) {
        this.bezNr = bezNr;
    }

    public int getkZSB() {
        return kZSB;
    }

    public void setkZSB(int kZSB) {
        this.kZSB = kZSB;
    }

    public int getkZMat() {
        return kZMat;
    }

    public void setkZMat(int kZMat) {
        this.kZMat = kZMat;
    }

    public int getkZAT() {
        return kZAT;
    }

    public void setkZAT(int kZAT) {
        this.kZAT = kZAT;
    }

    public int getkZZub() {
        return kZZub;
    }

    public void setkZZub(int kZZub) {
        this.kZZub = kZZub;
    }

    public int getLosGr1() {
        return losGr1;
    }

    public void setLosGr1(int losGr1) {
        this.losGr1 = losGr1;
    }

    public int getLosGr2() {
        return losGr2;
    }

    public void setLosGr2(int losGr2) {
        this.losGr2 = losGr2;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
