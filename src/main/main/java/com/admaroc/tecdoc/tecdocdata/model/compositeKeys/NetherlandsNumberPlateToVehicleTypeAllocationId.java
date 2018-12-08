package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NetherlandsNumberPlateToVehicleTypeAllocationId implements Serializable {

    @Column(name="nLTyp")
    String nLTyp;
    @Column(name="kTypNr")
    int kTypNr;

    public NetherlandsNumberPlateToVehicleTypeAllocationId() {
    }

    public NetherlandsNumberPlateToVehicleTypeAllocationId(String nLTyp, int kTypNr) {
        this.nLTyp = nLTyp;
        this.kTypNr = kTypNr;
    }

    public String getnLTyp() {
        return nLTyp;
    }

    public int getkTypNr() {
        return kTypNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetherlandsNumberPlateToVehicleTypeAllocationId that = (NetherlandsNumberPlateToVehicleTypeAllocationId) o;
        return getkTypNr() == that.getkTypNr() &&
                Objects.equals(getnLTyp(), that.getnLTyp());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getnLTyp(), getkTypNr());
    }
}
