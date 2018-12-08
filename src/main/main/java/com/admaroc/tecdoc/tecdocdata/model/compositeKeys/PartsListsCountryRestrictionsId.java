package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PartsListsCountryRestrictionsId implements Serializable {

    @Column(name="artNr")
    String artNr;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="lKZ")
    String lKZ;

    public PartsListsCountryRestrictionsId() {
    }

    public PartsListsCountryRestrictionsId(String artNr, int lfdNr, String lKZ) {
        this.artNr = artNr;
        this.lfdNr = lfdNr;
        this.lKZ = lKZ;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartsListsCountryRestrictionsId that = (PartsListsCountryRestrictionsId) o;
        return getLfdNr() == that.getLfdNr() &&
                Objects.equals(getArtNr(), that.getArtNr()) &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getLfdNr(), getlKZ());
    }
}
