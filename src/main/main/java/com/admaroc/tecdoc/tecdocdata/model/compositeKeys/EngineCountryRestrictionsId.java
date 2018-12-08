package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EngineCountryRestrictionsId implements Serializable{

    @Column(name="motNr")
    int motNr;
    @Column(name="lKZ")
    String lKZ;

    public EngineCountryRestrictionsId() {
    }

    public EngineCountryRestrictionsId(int motNr, String lKZ) {
        this.motNr = motNr;
        this.lKZ = lKZ;
    }

    public int getMotNr() {
        return motNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineCountryRestrictionsId that = (EngineCountryRestrictionsId) o;
        return motNr == that.motNr &&
                Objects.equals(lKZ, that.lKZ);
    }

    @Override
    public int hashCode() {

        return Objects.hash(motNr, lKZ);
    }
}
