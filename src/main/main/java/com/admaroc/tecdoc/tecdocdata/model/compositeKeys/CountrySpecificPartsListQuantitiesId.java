package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountrySpecificPartsListQuantitiesId implements Serializable{

    @Column(name="artNr")
    private String artNr;
    @Column(name="lfdNrStk")
    private int lfdNrStk;
    @Column(name="lKZ")
    private String lKZ;

    public CountrySpecificPartsListQuantitiesId() {
    }

    public CountrySpecificPartsListQuantitiesId(String artNr, int lfdNrStk, String lKZ) {
        this.artNr = artNr;
        this.lfdNrStk = lfdNrStk;
        this.lKZ = lKZ;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getLfdNrStk() {
        return lfdNrStk;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountrySpecificPartsListQuantitiesId that = (CountrySpecificPartsListQuantitiesId) o;
        return getLfdNrStk() == that.getLfdNrStk() &&
                Objects.equals(getArtNr(), that.getArtNr()) &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getLfdNrStk(), getlKZ());
    }
}
