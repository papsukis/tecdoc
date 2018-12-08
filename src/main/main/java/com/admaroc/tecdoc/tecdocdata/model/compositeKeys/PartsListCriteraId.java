package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PartsListCriteraId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="lfdNr1")
    int lfdNr1;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="sortNr")
    int sortNr;

    public PartsListCriteraId() {
    }

    public PartsListCriteraId(String artNr, int lfdNr1, int lfdNr, int sortNr) {
        this.artNr = artNr;
        this.lfdNr1 = lfdNr1;
        this.lfdNr = lfdNr;
        this.sortNr = sortNr;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getLfdNr1() {
        return lfdNr1;
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
        PartsListCriteraId that = (PartsListCriteraId) o;
        return getLfdNr1() == that.getLfdNr1() &&
                getLfdNr() == that.getLfdNr() &&
                getSortNr() == that.getSortNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getLfdNr1(), getLfdNr(), getSortNr());
    }
}
