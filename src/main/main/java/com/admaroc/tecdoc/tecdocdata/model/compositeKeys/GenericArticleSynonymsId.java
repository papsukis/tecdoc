package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GenericArticleSynonymsId implements Serializable {

    @Column(name="genArtNr")
    int genArtNr;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="sprachNr")
    int sprachNr;

    public GenericArticleSynonymsId() {
    }

    public GenericArticleSynonymsId(int genArtNr, int lfdNr, int sprachNr) {
        this.genArtNr = genArtNr;
        this.lfdNr = lfdNr;
        this.sprachNr = sprachNr;
    }

    public int getGenArtNr() {
        return genArtNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    public int getSprachNr() {
        return sprachNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericArticleSynonymsId that = (GenericArticleSynonymsId) o;
        return getGenArtNr() == that.getGenArtNr() &&
                getLfdNr() == that.getLfdNr() &&
                getSprachNr() == that.getSprachNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getGenArtNr(), getLfdNr(), getSprachNr());
    }
}
