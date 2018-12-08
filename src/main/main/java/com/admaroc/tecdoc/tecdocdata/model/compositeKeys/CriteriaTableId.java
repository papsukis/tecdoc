package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CriteriaTableId implements Serializable{

    @Column(name="dLNr")
    int dLNr;
    @Column(name="kritNr")
    int kritNr;

    public CriteriaTableId() {
    }

    public CriteriaTableId(int dLNr, int kritNr) {
        this.dLNr = dLNr;
        this.kritNr = kritNr;
    }

    public int getdLNr() {
        return dLNr;
    }

    public int getKritNr() {
        return kritNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriteriaTableId that = (CriteriaTableId) o;
        return getdLNr() == that.getdLNr() &&
                getKritNr() == that.getKritNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getdLNr(), getKritNr());
    }
}
