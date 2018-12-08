package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AxleBrakeSizeId implements Serializable {

    @Column(name="atypNr")
    int atypNr;
    @Column(name="lfdNr")
    int lfdNr;

    public AxleBrakeSizeId() {
    }

    public AxleBrakeSizeId(int atypNr, int lfdNr) {
        this.atypNr = atypNr;
        this.lfdNr = lfdNr;
    }

    public int getAtypNr() {
        return atypNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AxleBrakeSizeId that = (AxleBrakeSizeId) o;
        return getAtypNr() == that.getAtypNr() &&
                getLfdNr() == that.getLfdNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAtypNr(), getLfdNr());
    }
}
