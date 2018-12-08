package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ArticleLinkageId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="genArtNr")
    int genArtNr;
    @Column(name="vknZielArt")
    int vknZielArt;
    @Column(name="vknZielNr")
    int vknZielNr;
    @Column(name="lfdNr")
    int lfdNr;

    public ArticleLinkageId() {
    }

    public ArticleLinkageId(String artNr, int genArtNr, int vknZielArt, int vknZielNr, int lfdNr) {
        this.artNr = artNr;
        this.genArtNr = genArtNr;
        this.vknZielArt = vknZielArt;
        this.vknZielNr = vknZielNr;
        this.lfdNr = lfdNr;
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

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleLinkageId that = (ArticleLinkageId) o;
        return getGenArtNr() == that.getGenArtNr() &&
                getVknZielArt() == that.getVknZielArt() &&
                getVknZielNr() == that.getVknZielNr() &&
                getLfdNr() == that.getLfdNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getGenArtNr(), getVknZielArt(), getVknZielNr(), getLfdNr());
    }
}
