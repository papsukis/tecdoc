package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfAxleTypesToCVTypesId implements Serializable {

    @Column(name="ntypNr")
    int ntypNr;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="atypNr")
    int atypNr;

    public AllocationOfAxleTypesToCVTypesId() {
    }

    public AllocationOfAxleTypesToCVTypesId(int ntypNr, int lfdNr, int atypNr) {
        this.ntypNr = ntypNr;
        this.lfdNr = lfdNr;
        this.atypNr = atypNr;
    }

    public int getNtypNr() {
        return ntypNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    public int getAtypNr() {
        return atypNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfAxleTypesToCVTypesId that = (AllocationOfAxleTypesToCVTypesId) o;
        return getNtypNr() == that.getNtypNr() &&
                getLfdNr() == that.getLfdNr() &&
                getAtypNr() == that.getAtypNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNtypNr(), getLfdNr(), getAtypNr());
    }
}
