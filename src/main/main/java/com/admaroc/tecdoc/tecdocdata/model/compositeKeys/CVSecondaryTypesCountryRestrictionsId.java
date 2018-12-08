package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CVSecondaryTypesCountryRestrictionsId implements Serializable {

    @Column(name="nTypNr")
    int nTypNr;
    @Column(name="nTypSubNr")
    int nTypSubNr;
    @Column(name="lKZ")
    String lKZ;

    public CVSecondaryTypesCountryRestrictionsId() {
    }

    public CVSecondaryTypesCountryRestrictionsId(int nTypNr, int nTypSubNr, String lKZ) {
        this.nTypNr = nTypNr;
        this.nTypSubNr = nTypSubNr;
        this.lKZ = lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CVSecondaryTypesCountryRestrictionsId that = (CVSecondaryTypesCountryRestrictionsId) o;
        return getnTypNr() == that.getnTypNr() &&
                getnTypSubNr() == that.getnTypSubNr() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getnTypNr(), getnTypSubNr(), getlKZ());
    }

    public int getnTypNr() {
        return nTypNr;
    }

    public int getnTypSubNr() {
        return nTypSubNr;
    }

    public String getlKZ() {
        return lKZ;
    }
}
