package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="bildNr")
    int bildNr;
    @Column(name="dokementenArt")
    int dokumentenArt;
    @Column(name="sprachNr")
    int sprachNr;

    public AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId() {
    }

    public AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId(String artNr, int lfdNr, int bildNr, int dokumentenArt, int sprachNr) {
        this.artNr = artNr;
        this.lfdNr = lfdNr;
        this.bildNr = bildNr;
        this.dokumentenArt = dokumentenArt;
        this.sprachNr = sprachNr;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    public int getBildNr() {
        return bildNr;
    }

    public int getDokumentenArt() {
        return dokumentenArt;
    }

    public int getSprachNr() {
        return sprachNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId that = (AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId) o;
        return getLfdNr() == that.getLfdNr() &&
                getBildNr() == that.getBildNr() &&
                getDokumentenArt() == that.getDokumentenArt() &&
                getSprachNr() == that.getSprachNr() &&
                Objects.equals(getArtNr(), that.getArtNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getLfdNr(), getBildNr(), getDokumentenArt(), getSprachNr());
    }
}
