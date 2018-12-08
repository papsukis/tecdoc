package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AccessoryListsCountryRestrictionsId implements Serializable {

    @Column(name="artNr")
    private String artNr;
    @Column(name="lfdNrZub")
    private int lfdNrZub;
    @Column(name="sortNr")
    private int sortNr;
    @Column(name="lKZ")
    private String lKZ;

    public AccessoryListsCountryRestrictionsId() {
    }

    public AccessoryListsCountryRestrictionsId(String artNr, int lfdNrZub, int sortNr, String lKZ) {
        this.artNr = artNr;
        this.lfdNrZub = lfdNrZub;
        this.sortNr = sortNr;
        this.lKZ = lKZ;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getLfdNrZub() {
        return lfdNrZub;
    }

    public int getSortNr() {
        return sortNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessoryListsCountryRestrictionsId that = (AccessoryListsCountryRestrictionsId) o;
        return getLfdNrZub() == that.getLfdNrZub() &&
                getSortNr() == that.getSortNr() &&
                Objects.equals(getArtNr(), that.getArtNr()) &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getLfdNrZub(), getSortNr(), getlKZ());
    }
}
