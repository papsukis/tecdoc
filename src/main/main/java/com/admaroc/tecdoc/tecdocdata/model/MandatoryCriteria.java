package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.MandatoryCriteriaId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="328_mandatory_criteria")
public class MandatoryCriteria {

    @EmbeddedId
    MandatoryCriteriaId id;
    int dLNr;
    int sA;
    String lKZ;
    int kritNr;
    int only210;
    int only400;
    int exclude;
    int loschFlag;

    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;
    @MapsId("AllocationOfCriteriaValuesToGAMandatoryCriteriaId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "genArtNr",
                    referencedColumnName = "genArtNr"),
            @JoinColumn(
                    name = "lfdNr",
                    referencedColumnName = "lfdNr"),
            @JoinColumn(
                    name="kritWert",
                    referencedColumnName = "kritWert")})
    private AllocationOfCriteriaValuesToGAMandatoryCriteria allocationOfCriteriaValuesToGAMandatoryCriteria;
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

    public MandatoryCriteria() {
    }

    public MandatoryCriteria(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.lKZ = lKZ;
        this.kritNr = kritNr;
        this.only210 = only210;
        this.only400 = only400;
        this.exclude = exclude;
        this.loschFlag = loschFlag;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public AllocationOfCriteriaValuesToGAMandatoryCriteria getAllocationOfCriteriaValuesToGAMandatoryCriteria() {
        return allocationOfCriteriaValuesToGAMandatoryCriteria;
    }

    public void setAllocationOfCriteriaValuesToGAMandatoryCriteria(AllocationOfCriteriaValuesToGAMandatoryCriteria allocationOfCriteriaValuesToGAMandatoryCriteria) {
        this.allocationOfCriteriaValuesToGAMandatoryCriteria = allocationOfCriteriaValuesToGAMandatoryCriteria;
    }

    public CriteriaTable getCriteriaTable() {
        return criteriaTable;
    }

    public void setCriteriaTable(CriteriaTable criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public MandatoryCriteriaId getId() {
        return id;
    }

    public void setId(MandatoryCriteriaId id) {
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

    public int getOnly210() {
        return only210;
    }

    public void setOnly210(int only210) {
        this.only210 = only210;
    }

    public int getOnly400() {
        return only400;
    }

    public void setOnly400(int only400) {
        this.only400 = only400;
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
