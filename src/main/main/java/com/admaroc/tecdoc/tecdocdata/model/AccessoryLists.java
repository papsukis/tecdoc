package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AccessoryListsId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="222_accessory_lists")
public class AccessoryLists {
    @EmbeddedId
    AccessoryListsId id;
    int dLNr;
    int sA;
    int vKNART;
    int vKNValue;
    String zArtNr;
    int menge;
    int zubGenArtNr;
    String reserved;
    int bezNr;
    int loschFlag;
    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr",
                referencedColumnName = "artNr")
    private ArticleTable articleTable;
    @MapsId("LanguageDescriptionsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "bezNr",
                    referencedColumnName = "bezNr"),
            @JoinColumn(
                    name = "sprachNr",
                    referencedColumnName = "sprachNr")
    })
    private LanguageDescriptions languageDescriptions;
    @MapsId("AccessoryListsCountryRestrictionsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "artNr",
                    referencedColumnName = "artNr"),
            @JoinColumn(
                    name = "lfdNrZub",
                    referencedColumnName = "lfdNrZub"),
            @JoinColumn(
                    name = "sortNr",
                    referencedColumnName = "sortNr"),
            @JoinColumn(
                    name = "lKZ",
                    referencedColumnName = "lKZ"),
    })
    private AccessoryListsCountryRestrictions accessoryListsCountryRestrictions;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "accessoryLists")
    private List<AccessoryListsCriteria> accessoryListsCriteria;
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;

    public AccessoryLists() {
    }

    public AccessoryLists(Map<String,String> datas) {
        this.id = new AccessoryListsId(datas.get("ArtNr"),Integer.valueOf(datas.get("LfdNr")),Integer.valueOf(datas.get("SortNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));;
        this.vKNART = Integer.valueOf(datas.get("VKN_ART"));;
        this.vKNValue = Integer.valueOf(datas.get("VKN_Value"));;
        this.zArtNr = datas.get("ZArtNr");
        this.menge = Integer.valueOf(datas.get("Menge"));;
        this.zubGenArtNr = Integer.valueOf(datas.get("ZubGenArtNr"));;
        this.reserved = datas.get("Reserved");
        this.bezNr = Integer.valueOf(datas.get("BezNr"));
        this.loschFlag = 0;
    }

    public ArticleTable getArticleTable() {
        return articleTable;
    }

    public void setArticleTable(ArticleTable articleTable) {
        this.articleTable = articleTable;
    }

    public LanguageDescriptions getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(LanguageDescriptions languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
    }

    public AccessoryListsCountryRestrictions getAccessoryListsCountryRestrictions() {
        return accessoryListsCountryRestrictions;
    }

    public void setAccessoryListsCountryRestrictions(AccessoryListsCountryRestrictions accessoryListsCountryRestrictions) {
        this.accessoryListsCountryRestrictions = accessoryListsCountryRestrictions;
    }

    public List<AccessoryListsCriteria> getAccessoryListsCriteria() {
        return accessoryListsCriteria;
    }

    public void setAccessoryListsCriteria(List<AccessoryListsCriteria> accessoryListsCriteria) {
        this.accessoryListsCriteria = accessoryListsCriteria;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public AccessoryListsId getId() {
        return id;
    }

    public void setId(AccessoryListsId id) {
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

    public int getvKNART() {
        return vKNART;
    }

    public void setvKNART(int vKNART) {
        this.vKNART = vKNART;
    }

    public int getvKNValue() {
        return vKNValue;
    }

    public void setvKNValue(int vKNValue) {
        this.vKNValue = vKNValue;
    }


    public String getzArtNr() {
        return zArtNr;
    }

    public void setzArtNr(String zArtNr) {
        this.zArtNr = zArtNr;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public int getZubGenArtNr() {
        return zubGenArtNr;
    }

    public void setZubGenArtNr(int zubGenArtNr) {
        this.zubGenArtNr = zubGenArtNr;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public int getBezNr() {
        return bezNr;
    }

    public void setBezNr(int bezNr) {
        this.bezNr = bezNr;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
