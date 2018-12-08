package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfQuickStartIconsToProductAreasId implements Serializable {

    @Column(name="TreeTypNr")
    int treeTypNr;
    @Column(name="qsId")
    int qsId;

    public AllocationOfQuickStartIconsToProductAreasId() {
    }

    public AllocationOfQuickStartIconsToProductAreasId(int treeTypNr, int qsId) {
        this.treeTypNr = treeTypNr;
        this.qsId = qsId;
    }

    public int getTreeTypNr() {
        return treeTypNr;
    }

    public int getQsId() {
        return qsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfQuickStartIconsToProductAreasId that = (AllocationOfQuickStartIconsToProductAreasId) o;
        return getTreeTypNr() == that.getTreeTypNr() &&
                getQsId() == that.getQsId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTreeTypNr(), getQsId());
    }
}
