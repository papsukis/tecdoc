package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfCriteriaToTheSearchStructureId implements Serializable {

    @Column(name="nodeId")
    int nodeId;
    @Column(name="genArtNr")
    int genArtNr;
    @Column(name="kritNr",
            insertable = false,
            updatable = false)
    int kritNr;
    @Column(name="kritWert")
    int kritWert;

    public AllocationOfCriteriaToTheSearchStructureId() {
    }

    public AllocationOfCriteriaToTheSearchStructureId(int nodeId, int genArtNr, int kritNr, int kritWert) {
        this.nodeId = nodeId;
        this.genArtNr = genArtNr;
        this.kritNr = kritNr;
        this.kritWert = kritWert;
    }

    public int getNodeId() {
        return nodeId;
    }

    public int getGenArtNr() {
        return genArtNr;
    }

    public int getKritNr() {
        return kritNr;
    }

    public int getKritWert() {
        return kritWert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfCriteriaToTheSearchStructureId that = (AllocationOfCriteriaToTheSearchStructureId) o;
        return getNodeId() == that.getNodeId() &&
                getGenArtNr() == that.getGenArtNr() &&
                getKritNr() == that.getKritNr() &&
                getKritWert() == that.getKritWert();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNodeId(), getGenArtNr(), getKritNr(), getKritWert());
    }
}
