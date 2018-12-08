package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountrySpecificArticleDataId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="lKZ")
    String lKZ;

    public CountrySpecificArticleDataId() {
    }

    public CountrySpecificArticleDataId(String artNr, String lKZ) {
        this.artNr = artNr;
        this.lKZ = lKZ;
    }

    public String getArtNr() {
        return artNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountrySpecificArticleDataId that = (CountrySpecificArticleDataId) o;
        return Objects.equals(getArtNr(), that.getArtNr()) &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getlKZ());
    }
}
