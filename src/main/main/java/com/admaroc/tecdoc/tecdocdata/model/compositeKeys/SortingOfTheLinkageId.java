package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import com.admaroc.tecdoc.tecdocdata.model.ArticleTable;
import com.admaroc.tecdoc.tecdocdata.model.CountryTable;
import com.admaroc.tecdoc.tecdocdata.model.GenericArticles;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SortingOfTheLinkageId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="genArtNr")
    int genArtNr;
    @Column(name="vknZielArt")
    int vknZielArt;
    @Column(name="vknZielNr")
    int vknZielNr;

    public SortingOfTheLinkageId() {
    }

    public SortingOfTheLinkageId(String artNr, int genArtNr, int vknZielArt, int vknZielNr) {
        this.artNr = artNr;
        this.genArtNr = genArtNr;
        this.vknZielArt = vknZielArt;
        this.vknZielNr = vknZielNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortingOfTheLinkageId that = (SortingOfTheLinkageId) o;
        return getGenArtNr() == that.getGenArtNr() &&
                getVknZielArt() == that.getVknZielArt() &&
                getVknZielNr() == that.getVknZielNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getGenArtNr(), getVknZielArt(), getVknZielNr());
    }

    public String getArtNr() {
        return artNr;
    }

    public int getGenArtNr() {
        return genArtNr;
    }

    public int getVknZielArt() {
        return vknZielArt;
    }

    public int getVknZielNr() {
        return vknZielNr;
    }
}
