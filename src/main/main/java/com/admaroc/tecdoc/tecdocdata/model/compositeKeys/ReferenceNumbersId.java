package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReferenceNumbersId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="herNr")
    int herNr;
    @Column(name="sort")
    int sort;
    @Column(name="lKZ")
    String lKZ;

    public ReferenceNumbersId() {
    }

    public ReferenceNumbersId(String artNr, int herNr, int sort, String lKZ) {
        this.artNr = artNr;
        this.herNr = herNr;
        this.sort = sort;
        this.lKZ = lKZ;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getHerNr() {
        return herNr;
    }

    public int getSort() {
        return sort;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferenceNumbersId that = (ReferenceNumbersId) o;
        return getHerNr() == that.getHerNr() &&
                getSort() == that.getSort() &&
                Objects.equals(getArtNr(), that.getArtNr()) &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getHerNr(), getSort(), getlKZ());
    }
}
