package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AxleBodyTypesId implements Serializable {

    @Column(name="atypNr")
    int atypNr;
    @Column(name="lKZ")
    String lKZ;
    @Column(name="muster")
    String muster;

    public AxleBodyTypesId() {
    }

    public AxleBodyTypesId(int atypNr, String lKZ, String muster) {
        this.atypNr = atypNr;
        this.lKZ = lKZ;
        this.muster = muster;
    }

    public int getAtypNr() {
        return atypNr;
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
        AxleBodyTypesId that = (AxleBodyTypesId) o;
        return getAtypNr() == that.getAtypNr() &&
                Objects.equals(getlKZ(), that.getlKZ()) &&
                Objects.equals(getMuster(), that.getMuster());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAtypNr(), getlKZ(), getMuster());
    }
}
