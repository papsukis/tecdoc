package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BodyTypeSynonymsId implements Serializable {

    @Column(name="aufbauArt")
    int aufbauArt;
    @Column(name="kmodNr")
    int kmodNr;

    public BodyTypeSynonymsId() {
    }

    public BodyTypeSynonymsId(int aufbauArt, int kmodNr) {
        this.aufbauArt = aufbauArt;
        this.kmodNr = kmodNr;
    }

    public int getAufbauArt() {
        return aufbauArt;
    }

    public int getKmodNr() {
        return kmodNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyTypeSynonymsId that = (BodyTypeSynonymsId) o;
        return getAufbauArt() == that.getAufbauArt() &&
                getKmodNr() == that.getKmodNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAufbauArt(), getKmodNr());
    }
}
