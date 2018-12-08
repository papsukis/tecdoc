package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AccessoryListsCriteriaId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="228_accesory_lists_criteria")
public class AccessoryListsCriteria {

    @EmbeddedId
    AccessoryListsCriteriaId id;
    int dLNr;
    int sA;
    String lKZ;
    int kritNr;
    String kritWert;
    int exclude;
    int loschFlag;

    @MapsId("CountryAndLanguageDependentDescriptionsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "lbezNr",
                    referencedColumnName = "lbezNr"),
            @JoinColumn(
                    name = "lKZ",
                    referencedColumnName = "lKZ"),
            @JoinColumn(
                    name = "sprachNr",
                    referencedColumnName = "sprachNr")
    })
    private CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("AccessoryListsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "artNr",
                    referencedColumnName = "artNr"),
            @JoinColumn(
                    name = "lfdNr",
                    referencedColumnName = "lfdNr"),
            @JoinColumn(
                    name = "sortNr",
                    referencedColumnName = "sortNr")
    })
    private AccessoryLists accessoryLists;
    @MapsId("CriteriaId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "dLNr",
                    referencedColumnName = "dLNr"),
            @JoinColumn(
                    name = "kritNr",
                    referencedColumnName = "kritNr")
    })
    private CriteriaTable criteriaTable;

    public AccessoryListsCriteria() {
    }

    public AccessoryListsCriteria(Map<String,String> datas) {
        this.id = new AccessoryListsCriteriaId(datas.get("ArtNr"),Integer.valueOf(datas.get("LfdNr1")),Integer.valueOf(datas.get("sortNr1")),Integer.valueOf(datas.get("LfdNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.lKZ = datas.get("LKZ");
        this.kritNr = Integer.valueOf(datas.get("KritNr"));
        this.kritWert = datas.get("KritWert");
        this.exclude = Integer.valueOf(datas.get("Exclude"));
        this.loschFlag = 0;
    }

    public CountryAndLanguageDependentDescriptions getCountryAndLanguageDependentDescriptions() {
        return countryAndLanguageDependentDescriptions;
    }

    public void setCountryAndLanguageDependentDescriptions(CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions) {
        this.countryAndLanguageDependentDescriptions = countryAndLanguageDependentDescriptions;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public AccessoryLists getAccessoryLists() {
        return accessoryLists;
    }

    public void setAccessoryLists(AccessoryLists accessoryLists) {
        this.accessoryLists = accessoryLists;
    }

    public CriteriaTable getCriteriaTable() {
        return criteriaTable;
    }

    public void setCriteriaTable(CriteriaTable criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public AccessoryListsCriteriaId getId() {
        return id;
    }

    public void setId(AccessoryListsCriteriaId id) {
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

    public String getlKZ() {
        return lKZ;
    }

    public void setlKZ(String lKZ) {
        this.lKZ = lKZ;
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
