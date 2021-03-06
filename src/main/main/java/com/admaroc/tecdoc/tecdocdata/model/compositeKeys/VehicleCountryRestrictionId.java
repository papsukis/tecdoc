package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VehicleCountryRestrictionId implements Serializable {

    @Column(name="kTypNr")
    int kTypNr;
    @Column(name="lKZ")
    String lKZ;

    public VehicleCountryRestrictionId() {
    }

    public VehicleCountryRestrictionId(int kTypNr, String lKZ) {
        this.kTypNr = kTypNr;
        this.lKZ = lKZ;
    }

    public int getkTypNr() {
        return kTypNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleCountryRestrictionId that = (VehicleCountryRestrictionId) o;
        return getkTypNr() == that.getkTypNr() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getkTypNr(), getlKZ());
    }
}
