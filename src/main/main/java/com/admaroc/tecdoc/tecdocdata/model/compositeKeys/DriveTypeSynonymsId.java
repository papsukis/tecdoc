package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DriveTypeSynonymsId implements Serializable {

    @Column(name="antrArt")
    int antrArt;
    @Column(name="kTypNr")
    int kTypNr;

    public DriveTypeSynonymsId() {
    }

    public DriveTypeSynonymsId(int antrArt, int kTypNr) {
        this.antrArt = antrArt;
        this.kTypNr = kTypNr;
    }

    public int getAntrArt() {
        return antrArt;
    }

    public int getkTypNr() {
        return kTypNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriveTypeSynonymsId that = (DriveTypeSynonymsId) o;
        return getAntrArt() == that.getAntrArt() &&
                getkTypNr() == that.getkTypNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAntrArt(), getkTypNr());
    }
}
