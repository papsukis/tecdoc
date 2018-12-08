package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.PartsListCriteraId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="208_parts_lists_criteria")
public class PartsListCritera {

    @EmbeddedId
    PartsListCriteraId id;
    int dLNr;
    int sA;
    String reserved;
    int kritNr;
    String kritWert;
    String reserve;
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
    @MapsId("CriteriaId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "dLNr",
                    referencedColumnName = "dLNr"),
            @JoinColumn(
                    name = "kritNr",
                    referencedColumnName = "kritNr")})
    private CriteriaTable criteriaTable;
    @MapsId("PartsListsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "artNr",
                    referencedColumnName = "artNr"),
            @JoinColumn(
                    name = "lfdNr",
                    referencedColumnName = "lfdNr")})
    private PartsLists partsLists;

    public PartsListCritera() {
    }

    public PartsListCritera(Map<String,String> datas) {
        this.id = new PartsListCriteraId(datas.get("ArtNr"),Integer.valueOf(datas.get("LfdNr1")),Integer.valueOf(datas.get("LfdNr")),Integer.valueOf(datas.get("SortNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.reserved = datas.get("Reserved");
        this.kritNr = Integer.valueOf(datas.get("KritNr"));
        this.kritWert = datas.get("KritWert");
        this.reserve = datas.get("Reserve");
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

    public CriteriaTable getCriteriaTable() {
        return criteriaTable;
    }

    public void setCriteriaTable(CriteriaTable criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public PartsLists getPartsLists() {
        return partsLists;
    }

    public void setPartsLists(PartsLists partsLists) {
        this.partsLists = partsLists;
    }

    public PartsListCriteraId getId() {
        return id;
    }

    public void setId(PartsListCriteraId id) {
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

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
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

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
