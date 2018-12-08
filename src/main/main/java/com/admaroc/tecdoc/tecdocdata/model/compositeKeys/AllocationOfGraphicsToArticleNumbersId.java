package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfGraphicsToArticleNumbersId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="sortNr")
    int sortNr;

    public AllocationOfGraphicsToArticleNumbersId() {
    }

    public AllocationOfGraphicsToArticleNumbersId(String artNr, int sortNr) {
        this.artNr = artNr;
        this.sortNr = sortNr;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getSortNr() {
        return sortNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfGraphicsToArticleNumbersId that = (AllocationOfGraphicsToArticleNumbersId) o;
        return getSortNr() == that.getSortNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getSortNr());
    }
}
