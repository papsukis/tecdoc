package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EngineNumberAllocationtoVehicleTypesId implements Serializable {

    @Column(name="kTypNr")
    int kTypNr;
    @Column(name="lfdNr")
    int lfdNr;

    public EngineNumberAllocationtoVehicleTypesId() {
    }

    public EngineNumberAllocationtoVehicleTypesId(int kTypNr, int lfdNr) {
        this.kTypNr = kTypNr;
        this.lfdNr = lfdNr;
    }

    public int getkTypNr() {
        return kTypNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineNumberAllocationtoVehicleTypesId that = (EngineNumberAllocationtoVehicleTypesId) o;
        return getkTypNr() == that.getkTypNr() &&
                getLfdNr() == that.getLfdNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getkTypNr(), getLfdNr());
    }
}
