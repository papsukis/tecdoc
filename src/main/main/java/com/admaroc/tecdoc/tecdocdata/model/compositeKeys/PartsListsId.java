package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PartsListsId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="lfdNr")
    int lfdNr;

    public PartsListsId() {
    }

    public PartsListsId(String artNr, int lfdNr) {
        this.artNr = artNr;
        this.lfdNr = lfdNr;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartsListsId that = (PartsListsId) o;
        return getLfdNr() == that.getLfdNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getLfdNr());
    }
}
