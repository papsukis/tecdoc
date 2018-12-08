package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfCriteriaValuesToGAMandatoryCriteriaId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="330_allocation_of_criteria_values_to_ga_mandatory_criteria")
public class AllocationOfCriteriaValuesToGAMandatoryCriteria {

    @EmbeddedId
    AllocationOfCriteriaValuesToGAMandatoryCriteriaId id;
    int dLNr;
    int sA;
    int sortNr;
    int loschFlag;

    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "allocationOfCriteriaValuesToGAMandatoryCriteria")
    private List<MandatoryCriteria> mandatoryCriteria;

    public AllocationOfCriteriaValuesToGAMandatoryCriteria() {
    }

    public AllocationOfCriteriaValuesToGAMandatoryCriteria(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.sortNr = sortNr;
        this.loschFlag = loschFlag;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public List<MandatoryCriteria> getMandatoryCriteria() {
        return mandatoryCriteria;
    }

    public void setMandatoryCriteria(List<MandatoryCriteria> mandatoryCriteria) {
        this.mandatoryCriteria = mandatoryCriteria;
    }

    public AllocationOfCriteriaValuesToGAMandatoryCriteriaId getId() {
        return id;
    }

    public void setId(AllocationOfCriteriaValuesToGAMandatoryCriteriaId id) {
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

    public int getSortNr() {
        return sortNr;
    }

    public void setSortNr(int sortNr) {
        this.sortNr = sortNr;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
