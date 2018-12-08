package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GraphicsDocumentsId implements Serializable {

    @Column(name="bildNr")
    int bildNr;
    @Column(name="dokumentenArt")
    int dokumentenArt;
    @Column(name="sprachNr")
    int sprachNr;

    public GraphicsDocumentsId() {
    }

    public GraphicsDocumentsId(int bildNr, int dokumentenArt, int sprachNr) {
        this.bildNr = bildNr;
        this.dokumentenArt = dokumentenArt;
        this.sprachNr = sprachNr;
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
        GraphicsDocumentsId that = (GraphicsDocumentsId) o;
        return getBildNr() == that.getBildNr() &&
                getDokumentenArt() == that.getDokumentenArt() &&
                getSprachNr() == that.getSprachNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBildNr(), getDokumentenArt(), getSprachNr());
    }
}
