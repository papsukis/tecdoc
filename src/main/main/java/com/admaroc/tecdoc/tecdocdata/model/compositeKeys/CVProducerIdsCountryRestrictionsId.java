package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CVProducerIdsCountryRestrictionsId implements Serializable {

    @Column(name="herlDnr")
    int herlDNr;
    @Column(name="lKZ")
    String lKZ;

    public CVProducerIdsCountryRestrictionsId() {
    }

    public CVProducerIdsCountryRestrictionsId(int herlDNr, String lKZ) {
        this.herlDNr = herlDNr;
        this.lKZ = lKZ;
    }

    public int getHerlDNr() {
        return herlDNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CVProducerIdsCountryRestrictionsId that = (CVProducerIdsCountryRestrictionsId) o;
        return getHerlDNr() == that.getHerlDNr() &&
                getlKZ() == that.getlKZ();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getHerlDNr(), getlKZ());
    }
}
