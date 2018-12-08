package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfSwedishNumberPlatesToVehicleTypesId implements Serializable {

    @Column(name="sTyp")
    String sTyp;
    @Column(name="kTypNr")
    int kTypNr;

    public AllocationOfSwedishNumberPlatesToVehicleTypesId() {
    }

    public AllocationOfSwedishNumberPlatesToVehicleTypesId(String sTyp, int kTypNr) {
        this.sTyp = sTyp;
        this.kTypNr = kTypNr;
    }

    public String getsTyp() {
        return sTyp;
    }

    public int getkTypNr() {
        return kTypNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfSwedishNumberPlatesToVehicleTypesId that = (AllocationOfSwedishNumberPlatesToVehicleTypesId) o;
        return getkTypNr() == that.getkTypNr() &&
                Objects.equals(getsTyp(), that.getsTyp());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getsTyp(), getkTypNr());
    }
}
