package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfCVToCVIDNumbersId implements Serializable {

    @Column(name="nTypNr")
    int nTypNr;
    @Column(name="nTypSubNr")
    int nTypSubNr;
    @Column(name="herlDnr")
    int herlDnr;

    public AllocationOfCVToCVIDNumbersId() {
    }

    public AllocationOfCVToCVIDNumbersId(int nTypNr, int nTypSubNr, int herlDnr) {
        this.nTypNr = nTypNr;
        this.nTypSubNr = nTypSubNr;
        this.herlDnr = herlDnr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfCVToCVIDNumbersId that = (AllocationOfCVToCVIDNumbersId) o;
        return getnTypNr() == that.getnTypNr() &&
                getnTypSubNr() == that.getnTypSubNr() &&
                getHerlDnr() == that.getHerlDnr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getnTypNr(), getnTypSubNr(), getHerlDnr());
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
}
