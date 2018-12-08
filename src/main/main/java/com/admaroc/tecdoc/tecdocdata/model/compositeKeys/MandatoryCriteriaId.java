package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MandatoryCriteriaId implements Serializable {

    @Column(name="genArtNr")
    int genArtNr;
    @Column(name="lfdNr")
    int lfdNr;

    public MandatoryCriteriaId() {
    }

    public MandatoryCriteriaId(int genArtNr, int lfdNr) {
        this.genArtNr = genArtNr;
        this.lfdNr = lfdNr;
    }

    public int getGenArtNr() {
        return genArtNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MandatoryCriteriaId that = (MandatoryCriteriaId) o;
        return getGenArtNr() == that.getGenArtNr() &&
                getLfdNr() == that.getLfdNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getGenArtNr(), getLfdNr());
    }
}
