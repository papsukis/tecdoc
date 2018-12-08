package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AccessoryListsCountryRestrictionsId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="225_accessory_lists_country_restrictions")
public class AccessoryListsCountryRestrictions {

    @EmbeddedId
    AccessoryListsCountryRestrictionsId id;
    private int dLNr;
    private int sA;
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
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "accessoryListsCountryRestrictions")
    private List<AccessoryLists> accessoryLists;

    public AccessoryListsCountryRestrictions() {
    }

    public AccessoryListsCountryRestrictions(Map<String,String> datas) {
        this.id = new AccessoryListsCountryRestrictionsId(datas.get("ArtNr"),Integer.valueOf(datas.get("LfdNrZub")),Integer.valueOf(datas.get("SortNr")),datas.get("LKZ"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
    }

    public AccessoryListsCountryRestrictionsId getId() {
        return id;
    }

    public void setId(AccessoryListsCountryRestrictionsId id) {
        this.id = id;
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

    public List<AccessoryLists> getAccessoryLists() {
        return accessoryLists;
    }

    public void setAccessoryLists(List<AccessoryLists> accessoryLists) {
        this.accessoryLists = accessoryLists;
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

}
