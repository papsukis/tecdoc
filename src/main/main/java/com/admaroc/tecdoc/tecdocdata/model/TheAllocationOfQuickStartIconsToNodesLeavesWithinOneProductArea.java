package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="307_the_allocation_of_qs_icons_to_nodes_within_one_product_area")
public class TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea {

    @EmbeddedId
    TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId id;
    int dLNr;
    int sA;
    int sortNr;

    @MapsId("AllocationOfQuickStartIconsToProductAreasId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "TreeTypNr",
                    referencedColumnName = "TreeTypNr"),
            @JoinColumn(
                    name = "qsId",
                    referencedColumnName = "qsId")})
    private AllocationOfQuickStartIconsToProductAreas allocationOfQuickStartIconsToProductAreas;
    @MapsId("qsId")
    @ManyToOne
    @JoinColumn(name = "qsId",
                referencedColumnName = "qsId")
    private QuickStartIcons quickStartIcons;
    @MapsId("nodeId")
    @ManyToOne
    @JoinColumn(name = "nodeId",
                referencedColumnName = "nodeId")
    private TecdocSearchStructure tecdocSearchStructure;

    public TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea() {
    }

    public TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.sortNr = sortNr;
    }

    public AllocationOfQuickStartIconsToProductAreas getAllocationOfQuickStartIconsToProductAreas() {
        return allocationOfQuickStartIconsToProductAreas;
    }

    public void setAllocationOfQuickStartIconsToProductAreas(AllocationOfQuickStartIconsToProductAreas allocationOfQuickStartIconsToProductAreas) {
        this.allocationOfQuickStartIconsToProductAreas = allocationOfQuickStartIconsToProductAreas;
    }

    public QuickStartIcons getQuickStartIcons() {
        return quickStartIcons;
    }

    public void setQuickStartIcons(QuickStartIcons quickStartIcons) {
        this.quickStartIcons = quickStartIcons;
    }

    public TecdocSearchStructure getTecdocSearchStructure() {
        return tecdocSearchStructure;
    }

    public void setTecdocSearchStructure(TecdocSearchStructure tecdocSearchStructure) {
        this.tecdocSearchStructure = tecdocSearchStructure;
    }

    public TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId getId() {
        return id;
    }

    public void setId(TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId id) {
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
}
