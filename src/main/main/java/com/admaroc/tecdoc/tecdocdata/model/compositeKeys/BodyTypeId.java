package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BodyTypeId implements Serializable {

    @Column(name="kTypNr")
    int kTypNr;
    @Column(name="lKZ")
    String lKZ;
    @Column(name="muster")
    String muster;

    public BodyTypeId() {
    }

    public BodyTypeId(int kTypNr, String lKZ, String muster) {
        this.kTypNr = kTypNr;
        this.lKZ = lKZ;
        this.muster = muster;
    }

    public int getkTypNr() {
        return kTypNr;
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
        BodyTypeId that = (BodyTypeId) o;
        return getkTypNr() == that.getkTypNr() &&
                Objects.equals(getlKZ(), that.getlKZ()) &&
                Objects.equals(getMuster(), that.getMuster());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getkTypNr(), getlKZ(), getMuster());
    }
}
