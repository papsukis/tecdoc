package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfTypeMineNumbersToVehicleTypesId implements Serializable{

    @Column(name="typMine")
    String typMine;
    @Column(name="kTypNr")
    int kTypNr;

    public AllocationOfTypeMineNumbersToVehicleTypesId() {
    }

    public AllocationOfTypeMineNumbersToVehicleTypesId(String typMine, int kTypNr) {
        this.typMine = typMine;
        this.kTypNr = kTypNr;
    }

    public String getTypMine() {
        return typMine;
    }

    public int getkTypNr() {
        return kTypNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfTypeMineNumbersToVehicleTypesId that = (AllocationOfTypeMineNumbersToVehicleTypesId) o;
        return getkTypNr() == that.getkTypNr() &&
                Objects.equals(getTypMine(), that.getTypMine());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTypMine(), getkTypNr());
    }
}
