package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AccessoryListsId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="sortNr")
    int sortNr;

    public AccessoryListsId() {
    }

    public AccessoryListsId(String artNr, int lfdNr, int sortNr) {
        this.artNr = artNr;
        this.lfdNr = lfdNr;
        this.sortNr = sortNr;
    }

    public String getArtNr() {
        return artNr;
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
        AccessoryListsId that = (AccessoryListsId) o;
        return getLfdNr() == that.getLfdNr() &&
                getSortNr() == that.getSortNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getLfdNr(), getSortNr());
    }
}
