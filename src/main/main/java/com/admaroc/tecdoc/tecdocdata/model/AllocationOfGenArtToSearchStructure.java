package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfGenArtToSearchStructureId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="302_allocation_of_genart_to_search_structure")
public class AllocationOfGenArtToSearchStructure {

    @EmbeddedId
    AllocationOfGenArtToSearchStructureId id;
    int dLNr;
    int sA;
    int sortNr;
    int loschFlag;

    @MapsId("nodeId")
    @ManyToOne
    @JoinColumn(name = "nodeId",
                referencedColumnName = "nodeId")
    private TecdocSearchStructure tecdocSearchStructure;
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;

    public AllocationOfGenArtToSearchStructure() {
    }

    public AllocationOfGenArtToSearchStructure(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.sortNr = sortNr;
        this.loschFlag = loschFlag;
    }

    public TecdocSearchStructure getTecdocSearchStructure() {
        return tecdocSearchStructure;
    }

    public void setTecdocSearchStructure(TecdocSearchStructure tecdocSearchStructure) {
        this.tecdocSearchStructure = tecdocSearchStructure;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public AllocationOfGenArtToSearchStructureId getId() {
        return id;
    }

    public void setId(AllocationOfGenArtToSearchStructureId id) {
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
