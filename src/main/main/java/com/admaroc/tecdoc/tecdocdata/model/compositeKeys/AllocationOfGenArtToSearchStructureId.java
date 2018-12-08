package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfGenArtToSearchStructureId implements Serializable {

    @Column(name="nodeId")
    int nodeId;
    @Column(name="genArtNr")
    int genArtNr;

    public AllocationOfGenArtToSearchStructureId() {
    }

    public AllocationOfGenArtToSearchStructureId(int nodeId, int genArtNr) {
        this.nodeId = nodeId;
        this.genArtNr = genArtNr;
    }

    public int getNodeId() {
        return nodeId;
    }

    public int getGenArtNr() {
        return genArtNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfGenArtToSearchStructureId that = (AllocationOfGenArtToSearchStructureId) o;
        return getNodeId() == that.getNodeId() &&
                getGenArtNr() == that.getGenArtNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNodeId(), getGenArtNr());
    }
}
