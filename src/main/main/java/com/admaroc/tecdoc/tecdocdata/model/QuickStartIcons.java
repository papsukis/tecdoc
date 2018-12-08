package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="305_quick_start_icons")
public class QuickStartIcons {


    int dLNr;
    int sA;
    @Id
    int qsId;
    int bezNr;
    String bildName;

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
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "quickStartIcons")
    private List<AllocationOfQuickStartIconsToProductAreas> allocationOfQuickStartIconsToProductAreas;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "quickStartIcons")
    private List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;

    public QuickStartIcons() {
    }

    public QuickStartIcons(Map<String,String> datas) {
        this.dLNr = dLNr;
        this.sA = sA;
        this.qsId = qsId;
        this.bezNr = bezNr;
        this.bildName = bildName;
    }

    public LanguageDescriptions getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(LanguageDescriptions languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
    }

    public List<AllocationOfQuickStartIconsToProductAreas> getAllocationOfQuickStartIconsToProductAreas() {
        return allocationOfQuickStartIconsToProductAreas;
    }

    public void setAllocationOfQuickStartIconsToProductAreas(List<AllocationOfQuickStartIconsToProductAreas> allocationOfQuickStartIconsToProductAreas) {
        this.allocationOfQuickStartIconsToProductAreas = allocationOfQuickStartIconsToProductAreas;
    }

    public List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> getAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas() {
        return allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;
    }

    public void setAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas(List<TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductArea> allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas) {
        this.allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas = allocationOfQuickStartIconsToNodesLeavesWithinOneProductAreas;
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

    public int getQsId() {
        return qsId;
    }

    public void setQsId(int qsId) {
        this.qsId = qsId;
    }

    public int getBezNr() {
        return bezNr;
    }

    public void setBezNr(int bezNr) {
        this.bezNr = bezNr;
    }

    public String getBildName() {
        return bildName;
    }

    public void setBildName(String bildName) {
        this.bildName = bildName;
    }
}
