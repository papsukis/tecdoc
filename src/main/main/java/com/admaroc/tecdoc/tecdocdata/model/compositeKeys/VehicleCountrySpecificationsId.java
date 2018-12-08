package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VehicleCountrySpecificationsId implements Serializable {

    @Column(name="kTypNr")
    int kTypNr;
    @Column(name="lKZ")
    String lKZ;

    public VehicleCountrySpecificationsId() {
    }

    public VehicleCountrySpecificationsId(int kTypNr, String lKZ) {
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
        VehicleCountrySpecificationsId that = (VehicleCountrySpecificationsId) o;
        return getkTypNr() == that.getkTypNr() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getkTypNr(), getlKZ());
    }
}
