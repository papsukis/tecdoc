package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CVTyresId implements Serializable {

    @Column(name="nTypNr")
    int nTypNr;
    @Column(name="nTypSubNr")
    int nTypSubNr;
    @Column(name="lfdNr")
    int lfdNr;

    public CVTyresId() {
    }

    public CVTyresId(int nTypNr, int nTypSubNr, int lfdNr) {
        this.nTypNr = nTypNr;
        this.nTypSubNr = nTypSubNr;
        this.lfdNr = lfdNr;
    }

    public int getnTypNr() {
        return nTypNr;
    }

    public int getnTypSubNr() {
        return nTypSubNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CVTyresId cvTyresId = (CVTyresId) o;
        return getnTypNr() == cvTyresId.getnTypNr() &&
                getnTypSubNr() == cvTyresId.getnTypSubNr() &&
                getLfdNr() == cvTyresId.getLfdNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getnTypNr(), getnTypSubNr(), getLfdNr());
    }
}
