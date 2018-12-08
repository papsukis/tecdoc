package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfBodyTypesToModelSeriesId implements Serializable {

    @Column(name="kmodNr")
    int kmodNr;
    @Column(name="lKZ")
    String lKZ;
    @Column(name="muster")
    String muster;

    public AllocationOfBodyTypesToModelSeriesId() {
    }

    public AllocationOfBodyTypesToModelSeriesId(int kmodNr, String lKZ, String muster) {
        this.kmodNr = kmodNr;
        this.lKZ = lKZ;
        this.muster = muster;
    }

    public int getKmodNr() {
        return kmodNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    public String getMuster() {
        return muster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfBodyTypesToModelSeriesId that = (AllocationOfBodyTypesToModelSeriesId) o;
        return getKmodNr() == that.getKmodNr() &&
                Objects.equals(getlKZ(), that.getlKZ()) &&
                Objects.equals(getMuster(), that.getMuster());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getKmodNr(), getlKZ(), getMuster());
    }
}
