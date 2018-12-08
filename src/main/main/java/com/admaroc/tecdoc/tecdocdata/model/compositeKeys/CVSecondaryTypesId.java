package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CVSecondaryTypesId implements Serializable {

    @Column(name="nTypNr")
    int nTypNr;
    @Column(name="nTypSubNr")
    int nTypSubNr;

    public CVSecondaryTypesId() {
    }

    public CVSecondaryTypesId(int nTypNr, int nTypSubNr) {
        this.nTypNr = nTypNr;
        this.nTypSubNr = nTypSubNr;
    }

    public int getnTypNr() {
        return nTypNr;
    }

    public int getnTypSubNr() {
        return nTypSubNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CVSecondaryTypesId that = (CVSecondaryTypesId) o;
        return getnTypNr() == that.getnTypNr() &&
                getnTypSubNr() == that.getnTypSubNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getnTypNr(), getnTypSubNr());
    }
}
