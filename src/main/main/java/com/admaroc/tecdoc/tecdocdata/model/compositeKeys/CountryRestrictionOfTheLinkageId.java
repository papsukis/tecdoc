package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryRestrictionOfTheLinkageId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="genArtNr")
    int genArtNr;
    @Column(name="vknZielArt")
    int vknZielArt;
    @Column(name="vknZieldNr")
    int vknZieldNr;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="lKZ")
    String lKZ;

    public CountryRestrictionOfTheLinkageId() {
    }

    public CountryRestrictionOfTheLinkageId(String artNr, int genArtNr, int vknZielArt, int vknZieldNr, int lfdNr, String lKZ) {
        this.artNr = artNr;
        this.genArtNr = genArtNr;
        this.vknZielArt = vknZielArt;
        this.vknZieldNr = vknZieldNr;
        this.lfdNr = lfdNr;
        this.lKZ = lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryRestrictionOfTheLinkageId that = (CountryRestrictionOfTheLinkageId) o;
        return getGenArtNr() == that.getGenArtNr() &&
                getVknZielArt() == that.getVknZielArt() &&
                getVknZieldNr() == that.getVknZieldNr() &&
                getLfdNr() == that.getLfdNr() &&
                Objects.equals(getArtNr(), that.getArtNr()) &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getGenArtNr(), getVknZielArt(), getVknZieldNr(), getLfdNr(), getlKZ());
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

    public int getVknZieldNr() {
        return vknZieldNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    public String getlKZ() {
        return lKZ;
    }
}
