package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SwissTypeNumberAllocationToVehicleTypesId implements Serializable{

    @Column(name="chTyp")
    String chTyp;
    @Column(name="ktypNr")
    int ktypNr;

    public SwissTypeNumberAllocationToVehicleTypesId() {
    }

    public SwissTypeNumberAllocationToVehicleTypesId(String chTyp, int ktypNr) {
        this.chTyp = chTyp;
        this.ktypNr = ktypNr;
    }

    public String getChTyp() {
        return chTyp;
    }

    public int getKtypNr() {
        return ktypNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SwissTypeNumberAllocationToVehicleTypesId that = (SwissTypeNumberAllocationToVehicleTypesId) o;
        return getKtypNr() == that.getKtypNr() &&
                Objects.equals(getChTyp(), that.getChTyp());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getChTyp(), getKtypNr());
    }
}
