package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryGroupsId implements Serializable {

    @Column(name="lKZGrp")
    String lKZGrp;
    @Column(name="lKZ")
    String lKZ;

    public CountryGroupsId() {
    }

    public CountryGroupsId(String lKZGrp, String lKZ) {
        this.lKZGrp = lKZGrp;
        this.lKZ = lKZ;
    }

    public String getlKZGrp() {
        return lKZGrp;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryGroupsId that = (CountryGroupsId) o;
        return Objects.equals(getlKZGrp(), that.getlKZGrp()) &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getlKZGrp(), getlKZ());
    }
}
