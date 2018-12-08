package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TransmissionCountryRestrictionsId implements Serializable {

    @Column(name="getrNr")
    int getrNr;
    @Column(name="lKZ")
    String lKZ;

    public TransmissionCountryRestrictionsId() {
    }

    public TransmissionCountryRestrictionsId(int getrNr, String lKZ) {
        this.getrNr = getrNr;
        this.lKZ = lKZ;
    }

    public int getGetrNr() {
        return getrNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransmissionCountryRestrictionsId that = (TransmissionCountryRestrictionsId) o;
        return getGetrNr() == that.getGetrNr() &&
                getlKZ() == that.getlKZ();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getGetrNr(), getlKZ());
    }
}
