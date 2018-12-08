package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LinkagesNotToBeDisplayedInCertainCountriesId implements Serializable {

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
    @Column(name="lKZ")
    String lKZ;

    public LinkagesNotToBeDisplayedInCertainCountriesId() {
    }

    public LinkagesNotToBeDisplayedInCertainCountriesId(String artNr, int genArtNr, int vknZielArt, int vknZielNr, int lfdNr, String lKZ) {
        this.artNr = artNr;
        this.genArtNr = genArtNr;
        this.vknZielArt = vknZielArt;
        this.vknZielNr = vknZielNr;
        this.lfdNr = lfdNr;
        this.lKZ = lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkagesNotToBeDisplayedInCertainCountriesId that = (LinkagesNotToBeDisplayedInCertainCountriesId) o;
        return getGenArtNr() == that.getGenArtNr() &&
                getVknZielArt() == that.getVknZielArt() &&
                getVknZielNr() == that.getVknZielNr() &&
                getLfdNr() == that.getLfdNr() &&
                Objects.equals(getArtNr(), that.getArtNr()) &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getGenArtNr(), getVknZielArt(), getVknZielNr(), getLfdNr(), getlKZ());
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

    public String getlKZ() {
        return lKZ;
    }
}
