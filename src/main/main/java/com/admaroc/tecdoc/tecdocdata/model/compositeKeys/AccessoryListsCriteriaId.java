package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AccessoryListsCriteriaId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="lfdNr1")
    int lfdNr1;
    @Column(name="sortNr1")
    int sortNr1;
    @Column(name="lfdNr")
    int lfdNr;

    public AccessoryListsCriteriaId() {
    }

    public AccessoryListsCriteriaId(String artNr, int lfdNr1, int sortNr1, int lfdNr) {
        this.artNr = artNr;
        this.lfdNr1 = lfdNr1;
        this.sortNr1 = sortNr1;
        this.lfdNr = lfdNr;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getLfdNr1() {
        return lfdNr1;
    }

    public int getSortNr1() {
        return sortNr1;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessoryListsCriteriaId that = (AccessoryListsCriteriaId) o;
        return getLfdNr1() == that.getLfdNr1() &&
                getSortNr1() == that.getSortNr1() &&
                getLfdNr() == that.getLfdNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getLfdNr1(), getSortNr1(), getLfdNr());
    }
}
