package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfQuickStartIconsToProductAreasId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="306_allocation_of_qs_icons_to_product_areas")
public class AllocationOfQuickStartIconsToProductAreas {

@EmbeddedId
    AllocationOfQuickStartIconsToProductAreasId id;
    int dLNr;
    int sA;
    int sortNr;

    @MapsId("qsId")
    @ManyToOne
    @JoinColumn(name = "qsId",
                referencedColumnName = "qsId")
    private QuickStartIcons quickStartIcons;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "allocationOfQuickStartIconsToProductAreas")
    private List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;

    public AllocationOfQuickStartIconsToProductAreas() {
    }

    public AllocationOfQuickStartIconsToProductAreas(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.sortNr = sortNr;
    }

    public QuickStartIcons getQuickStartIcons() {
        return quickStartIcons;
    }

    public void setQuickStartIcons(QuickStartIcons quickStartIcons) {
        this.quickStartIcons = quickStartIcons;
    }

    public List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> getAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas() {
        return allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;
    }

    public void setAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas(List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas) {
        this.allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas = allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;
    }

    public AllocationOfQuickStartIconsToProductAreasId getId() {
        return id;
    }

    public void setId(AllocationOfQuickStartIconsToProductAreasId id) {
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
