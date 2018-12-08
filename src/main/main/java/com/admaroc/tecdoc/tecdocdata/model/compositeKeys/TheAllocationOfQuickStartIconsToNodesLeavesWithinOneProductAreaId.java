package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId implements Serializable {

    @Column(name="treeTypNr")
    int treeTypNr;
    @Column(name="qsId")
    int qsId;
    @Column(name="nodeId")
    int nodeId;

    public TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId() {
    }

    public TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId(int treeTypNr, int qsId, int nodeId) {
        this.treeTypNr = treeTypNr;
        this.qsId = qsId;
        this.nodeId = nodeId;
    }

    public int getTreeTypNr() {
        return treeTypNr;
    }

    public int getQsId() {
        return qsId;
    }

    public int getNodeId() {
        return nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId that = (TheAllocationOfQuickStartIconsToNodesLeavesWithinOneProductAreaId) o;
        return getTreeTypNr() == that.getTreeTypNr() &&
                getQsId() == that.getQsId() &&
                getNodeId() == that.getNodeId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTreeTypNr(), getQsId(), getNodeId());
    }
}
