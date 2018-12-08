package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CVDriverCabCountryRestrictionsId implements Serializable {

    @Column(name="fHausNr")
    int fHausNr;
    @Column(name="lKZ")
    String lKZ;

    public CVDriverCabCountryRestrictionsId() {
    }

    public CVDriverCabCountryRestrictionsId(int fHausNr, String lKZ) {
        this.fHausNr = fHausNr;
        this.lKZ = lKZ;
    }

    public int getfHausNr() {
        return fHausNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CVDriverCabCountryRestrictionsId that = (CVDriverCabCountryRestrictionsId) o;
        return getfHausNr() == that.getfHausNr() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getfHausNr(), getlKZ());
    }
}
