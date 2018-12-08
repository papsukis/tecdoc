package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="301_tecdoc_search_structure")
public class TecdocSearchStructure {


    int dLNr;
    int sA;
    @Id
    int nodeId;
    int treeTypNr;
    int stufe;
    int nodeParentId;
    int sortNr;
    int bezNr;
    int wertOk;
    @MapsId("LanguageDescriptionsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "bezNr",
                    referencedColumnName = "bezNr"),
            @JoinColumn(
                    name = "sprachNr",
                    referencedColumnName = "sprachNr")})
    private LanguageDescriptions languageDescriptions;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "tecdocSearchStructure")
    private List<AllocationOfGenArtToSearchStructure > allocationOfGenArtToSearchStructure;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "tecdocSearchStructure")
    private List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> theAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "tecdocSearchStructure")
    private List<AllocationOfCriteriaToTheSearchStructure> allocationOfCriteriaToTheSearchStructures;


    public TecdocSearchStructure() {
    }

    public TecdocSearchStructure(Map<String,String> datas) {
        this.dLNr = dLNr;
        this.sA = sA;
        this.nodeId = nodeId;
        this.treeTypNr = treeTypNr;
        this.stufe = stufe;
        this.nodeParentId = nodeParentId;
        this.sortNr = sortNr;
        this.bezNr = bezNr;
        this.wertOk = wertOk;
    }

    public LanguageDescriptions getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(LanguageDescriptions languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public List<AllocationOfGenArtToSearchStructure> getAllocationOfGenArtToSearchStructure() {
        return allocationOfGenArtToSearchStructure;
    }

    public void setAllocationOfGenArtToSearchStructure(List<AllocationOfGenArtToSearchStructure> allocationOfGenArtToSearchStructure) {
        this.allocationOfGenArtToSearchStructure = allocationOfGenArtToSearchStructure;
    }

    public List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> getTheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas() {
        return theAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;
    }

    public void setTheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas(List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> theAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas) {
        this.theAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas = theAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;
    }

    public List<AllocationOfCriteriaToTheSearchStructure> getAllocationOfCriteriaToTheSearchStructures() {
        return allocationOfCriteriaToTheSearchStructures;
    }

    public void setAllocationOfCriteriaToTheSearchStructures(List<AllocationOfCriteriaToTheSearchStructure> allocationOfCriteriaToTheSearchStructures) {
        this.allocationOfCriteriaToTheSearchStructures = allocationOfCriteriaToTheSearchStructures;
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

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public int getTreeTypNr() {
        return treeTypNr;
    }

    public void setTreeTypNr(int treeTypNr) {
        this.treeTypNr = treeTypNr;
    }

    public int getStufe() {
        return stufe;
    }

    public void setStufe(int stufe) {
        this.stufe = stufe;
    }

    public int getNodeParentId() {
        return nodeParentId;
    }

    public void setNodeParentId(int nodeParentId) {
        this.nodeParentId = nodeParentId;
    }

    public int getSortNr() {
        return sortNr;
    }

    public void setSortNr(int sortNr) {
        this.sortNr = sortNr;
    }

    public int getBezNr() {
        return bezNr;
    }

    public void setBezNr(int bezNr) {
        this.bezNr = bezNr;
    }

    public int getWertOk() {
        return wertOk;
    }

    public void setWertOk(int wertOk) {
        this.wertOk = wertOk;
    }
}
