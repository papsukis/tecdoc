package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ContextSensitiveGraphicsId implements Serializable {

    @Column(name="bildNr")
    int bildNr;
    @Column(name="dokumentenArt")
    int dokumentenArt;
    @Column(name="koordintenNr")
    int koordintenNr;
    @Column(name="lfdNr")
    int lfdNr;

    public ContextSensitiveGraphicsId() {
    }

    public ContextSensitiveGraphicsId(int bildNr, int dokumentenArt, int koordintenNr, int lfdNr) {
        this.bildNr = bildNr;
        this.dokumentenArt = dokumentenArt;
        this.koordintenNr = koordintenNr;
        this.lfdNr = lfdNr;
    }

    public int getBildNr() {
        return bildNr;
    }

    public int getDokumentenArt() {
        return dokumentenArt;
    }

    public int getKoordintenNr() {
        return koordintenNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContextSensitiveGraphicsId that = (ContextSensitiveGraphicsId) o;
        return getBildNr() == that.getBildNr() &&
                getDokumentenArt() == that.getDokumentenArt() &&
                getKoordintenNr() == that.getKoordintenNr() &&
                getLfdNr() == that.getLfdNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBildNr(), getDokumentenArt(), getKoordintenNr(), getLfdNr());
    }
}
