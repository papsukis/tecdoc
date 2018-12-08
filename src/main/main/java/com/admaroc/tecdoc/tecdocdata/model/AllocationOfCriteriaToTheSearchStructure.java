package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfCriteriaToTheSearchStructureId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="304_allocation_of_criteria_to_the_search_structure")
public class AllocationOfCriteriaToTheSearchStructure {

    @EmbeddedId
    AllocationOfCriteriaToTheSearchStructureId id;
    int dLNr;
    int sortNr;
    int loschFlag;
    @MapsId("nodeId")
    @ManyToOne
    @JoinColumn(name = "nodeId",
                referencedColumnName = "nodeId")
    private TecdocSearchStructure tecdocSearchStructure;
    @MapsId("CriteriaId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "dLNr",
                    referencedColumnName = "dLNr"),
            @JoinColumn(
                    name = "kritNr",
                    referencedColumnName = "kritNr"
                   )})
    private CriteriaTable criteriaTable;
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;

    public AllocationOfCriteriaToTheSearchStructure() {
    }

    public AllocationOfCriteriaToTheSearchStructure(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sortNr = sortNr;
        this.loschFlag = loschFlag;
    }

    public TecdocSearchStructure getTecdocSearchStructure() {
        return tecdocSearchStructure;
    }

    public void setTecdocSearchStructure(TecdocSearchStructure tecdocSearchStructure) {
        this.tecdocSearchStructure = tecdocSearchStructure;
    }

    public CriteriaTable getCriteriaTable() {
        return criteriaTable;
    }

    public void setCriteriaTable(CriteriaTable criteriaTable) {
        this.criteriaTable = criteriaTable;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public AllocationOfCriteriaToTheSearchStructureId getId() {
        return id;
    }

    public void setId(AllocationOfCriteriaToTheSearchStructureId id) {
        this.id = id;
    }

    public int getdLNr() {
        return dLNr;
    }

    public void setdLNr(int dLNr) {
        this.dLNr = dLNr;
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
