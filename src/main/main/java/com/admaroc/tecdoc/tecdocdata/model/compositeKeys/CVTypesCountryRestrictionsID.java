package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CVTypesCountryRestrictionsID implements Serializable {

    @Column(name="nTypNr")
    int nTypNr;
    @Column(name="lKZ")
    String lKZ;

    public CVTypesCountryRestrictionsID() {
    }

    public CVTypesCountryRestrictionsID(int nTypNr, String lKZ) {
        this.nTypNr = nTypNr;
        this.lKZ = lKZ;
    }

    public int getnTypNr() {
        return nTypNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CVTypesCountryRestrictionsID that = (CVTypesCountryRestrictionsID) o;
        return getnTypNr() == that.getnTypNr() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getnTypNr(), getlKZ());
    }
}
