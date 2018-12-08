package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ReferenceNumbersId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="203_reference_numbers")
public class ReferenceNumbers {

    @EmbeddedId
    ReferenceNumbersId id;
    int dLNr;
    int sA;
    String refNr;
    int exclude;
    int additiv;
    String referenzInfo;
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
    @MapsId("herNr")
    @ManyToOne
    @JoinColumn(name = "herNr",
                referencedColumnName = "herNr")
    private Manufacturer manufacturer;

    public ReferenceNumbers() {
    }

    public ReferenceNumbers(Map<String,String> datas) {
        this.id=new ReferenceNumbersId(datas.get("ArtNr"),Integer.valueOf(datas.get("HerNr")),Integer.valueOf(datas.get("Sort")),datas.get("LKZ"));
        this.dLNr=Integer.valueOf(datas.get("DLNr"));
        this.sA=Integer.valueOf(datas.get("SA"));
        this.referenzInfo=datas.get("ReferenzInfo");
        this.refNr=datas.get("RefNr");
        this.exclude=Integer.valueOf(datas.get("Exclude"));
        this.additiv=Integer.valueOf(datas.get("Additiv"));
        this.loschFlag=Integer.valueOf(datas.get("Lösch-Flag"));
        this.articleTable=new ArticleTable();
        this.countryTable=new CountryTable();
       // this.manufacturer=new Manufacturer();
    }

    @Override
    public String toString() {
        return "ReferenceNumbers{" +
                "id=" + id +
                ", dLNr=" + dLNr +
                ", sA=" + sA +
                ", refNr=" + refNr +
                ", exclude=" + exclude +
                ", additiv=" + additiv +
                ", referenzInfo='" + referenzInfo + '\'' +
                ", loschFlag=" + loschFlag +
                ", articleTable=" + articleTable +
                ", countryTable=" + countryTable +
                ", manufacturer=" + manufacturer +
                '}';
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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ReferenceNumbersId getId() {
        return id;
    }

    public void setId(ReferenceNumbersId id) {
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


    public String getRefNr() {
        return refNr;
    }

    public void setRefNr(String refNr) {
        this.refNr = refNr;
    }

    public int getExclude() {
        return exclude;
    }

    public void setExclude(int exclude) {
        this.exclude = exclude;
    }


    public int getAdditiv() {
        return additiv;
    }

    public void setAdditiv(int additiv) {
        this.additiv = additiv;
    }

    public String getReferenzInfo() {
        return referenzInfo;
    }

    public void setReferenzInfo(String referenzInfo) {
        this.referenzInfo = referenzInfo;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
