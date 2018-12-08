package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryRestrictionsForTheAllocationOfCVToIDNumbersId implements Serializable {
    @Column(name="nTypNr")
    int nTypNr;
    @Column(name="nTypSubNr")
    int nTypSubNr;
    @Column(name="herlDnr")
    int herlDnr;
    @Column(name="lKZ")
    String lKZ;

    public CountryRestrictionsForTheAllocationOfCVToIDNumbersId() {
    }

    public CountryRestrictionsForTheAllocationOfCVToIDNumbersId(int nTypNr, int nTypSubNr, int herlDnr, String lKZ) {
        this.nTypNr = nTypNr;
        this.nTypSubNr = nTypSubNr;
        this.herlDnr = herlDnr;
        this.lKZ = lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryRestrictionsForTheAllocationOfCVToIDNumbersId that = (CountryRestrictionsForTheAllocationOfCVToIDNumbersId) o;
        return getnTypNr() == that.getnTypNr() &&
                getnTypSubNr() == that.getnTypSubNr() &&
                getHerlDnr() == that.getHerlDnr() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getnTypNr(), getnTypSubNr(), getHerlDnr(), getlKZ());
    }

    public int getnTypNr() {
        return nTypNr;
    }

    public int getnTypSubNr() {
        return nTypSubNr;
    }

    public int getHerlDnr() {
        return herlDnr;
    }

    public String getlKZ() {
        return lKZ;
    }
}
