package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ArticleCriteriaId implements Serializable{

    @Column(name="artNr")
    String artNr;
    @Column(name="sortNr")
    int sortNr;

    public ArticleCriteriaId() {
    }

    public ArticleCriteriaId(String artNr, int sortNr) {
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
        ArticleCriteriaId that = (ArticleCriteriaId) o;
        return getSortNr() == that.getSortNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getSortNr());
    }
}
