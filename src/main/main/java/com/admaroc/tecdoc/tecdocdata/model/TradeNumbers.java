package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.TradeNumbersId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="207_trade_numbers")
public class TradeNumbers {

@EmbeddedId
    TradeNumbersId id;
    int dLNr;
    int sA;
    int exclude;
    int anzSofort;
    int sort;
    int loschFlag;

    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr",
                referencedColumnName = "artNr")
    private ArticleTable articleTable;

    public TradeNumbers() {
    }

    public TradeNumbers(Map<String,String> datas) {
        this.id = new TradeNumbersId(datas.get("ArtNr"),Integer.valueOf(datas.get("GebrNr")),datas.get("LKZ"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.exclude = Integer.valueOf(datas.get("Exclude"));
        this.anzSofort = Integer.valueOf(datas.get("AnzSofort"));
        this.sort = Integer.valueOf(datas.get("Sort"));
        this.loschFlag = 0;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public ArticleTable getArticleTable() {
        return articleTable;
    }

    public void setArticleTable(ArticleTable articleTable) {
        this.articleTable = articleTable;
    }

    public TradeNumbersId getId() {
        return id;
    }

    public void setId(TradeNumbersId id) {
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


    public int getExclude() {
        return exclude;
    }

    public void setExclude(int exclude) {
        this.exclude = exclude;
    }

    public int getAnzSofort() {
        return anzSofort;
    }

    public void setAnzSofort(int anzSofort) {
        this.anzSofort = anzSofort;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
