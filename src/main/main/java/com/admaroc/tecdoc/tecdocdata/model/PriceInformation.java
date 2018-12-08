package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.PriceInformationId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="201_price_information")
public class PriceInformation {

    @EmbeddedId
    PriceInformationId id;
    int dLNr;
    int sA;
    int preis;
    int datbis;
    String rabattgruppe;
    int minderrabatt;
    int loschFlag;

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
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;

    public PriceInformation() {
    }

    public PriceInformation(Map<String,String> datas) {
        this.id = new PriceInformationId(datas.get("ArtNr"),Integer.valueOf(datas.get("PrArt")),datas.get("LKZ"),datas.get("WKZ"),Integer.valueOf(datas.get("Datvon")),Integer.valueOf(datas.get("PENr")),datas.get("MENr"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.preis = Integer.valueOf(datas.get("Preis"));
        this.datbis = Integer.valueOf(datas.get("Datbis"));
        this.rabattgruppe = datas.get("Rabattgruppe");
        this.minderrabatt = Integer.valueOf(datas.get("Minderrabatt"));
        this.loschFlag = 0;
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

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public PriceInformationId getId() {
        return id;
    }

    public void setId(PriceInformationId id) {
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

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getDatbis() {
        return datbis;
    }

    public void setDatbis(int datbis) {
        this.datbis = datbis;
    }

    public String getRabattgruppe() {
        return rabattgruppe;
    }

    public void setRabattgruppe(String rabattgruppe) {
        this.rabattgruppe = rabattgruppe;
    }

    public int getMinderrabatt() {
        return minderrabatt;
    }

    public void setMinderrabatt(int minderrabatt) {
        this.minderrabatt = minderrabatt;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
