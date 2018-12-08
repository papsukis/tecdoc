package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AxleWheelbasesId implements Serializable {

    @Column(name="atypNr")
    int atypNr;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="sortNr")
    int sortNr;

    public AxleWheelbasesId() {
    }

    public AxleWheelbasesId(int atypNr, int lfdNr, int sortNr) {
        this.atypNr = atypNr;
        this.lfdNr = lfdNr;
        this.sortNr = sortNr;
    }

    public int getAtypNr() {
        return atypNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    public int getSortNr() {
        return sortNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AxleWheelbasesId that = (AxleWheelbasesId) o;
        return getAtypNr() == that.getAtypNr() &&
                getLfdNr() == that.getLfdNr() &&
                getSortNr() == that.getSortNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAtypNr(), getLfdNr(), getSortNr());
    }
}
