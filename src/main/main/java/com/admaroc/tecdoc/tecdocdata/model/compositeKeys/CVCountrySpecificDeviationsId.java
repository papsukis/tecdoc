package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CVCountrySpecificDeviationsId implements Serializable {

    @Column(name="nTypeNr")
    int nTypNr;
    @Column(name="lKZ")
    String lKZ;

    public CVCountrySpecificDeviationsId() {
    }

    public CVCountrySpecificDeviationsId(int nTypNr, String lKZ) {
        this.nTypNr = nTypNr;
        this.lKZ = lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CVCountrySpecificDeviationsId that = (CVCountrySpecificDeviationsId) o;
        return getnTypNr() == that.getnTypNr() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getnTypNr(), getlKZ());
    }

    public int getnTypNr() {
        return nTypNr;
    }

    public String getlKZ() {
        return lKZ;
    }
}
