package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DataSupplierAdressesId implements Serializable {

    @Column(name="dLNr")
    int dLNr;
    @Column(name="adressart")
    int adressart;
    @Column(name="lKZ")
    String lKZ;

    public DataSupplierAdressesId() {
    }

    public DataSupplierAdressesId(int dLNr, int adressart, String lKZ) {
        this.dLNr = dLNr;
        this.adressart = adressart;
        this.lKZ = lKZ;
    }

    public int getdLNr() {
        return dLNr;
    }

    public int getAdressart() {
        return adressart;
    }

    public String getlKZ() {
        return lKZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataSupplierAdressesId that = (DataSupplierAdressesId) o;
        return getdLNr() == that.getdLNr() &&
                getAdressart() == that.getAdressart() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getdLNr(), getAdressart(), getlKZ());
    }
}
