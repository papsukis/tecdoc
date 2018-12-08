package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DataSupplierMainAddressId implements Serializable{

    @Column(name="dLNr")
    int dLNr;
    @Column(name="adressart")
    int adressart;

    public DataSupplierMainAddressId() {
    }

    public DataSupplierMainAddressId(int dLNr, int adressart) {
        this.dLNr = dLNr;
        this.adressart = adressart;
    }

    public int getdLNr() {
        return dLNr;
    }

    public int getAdressart() {
        return adressart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataSupplierMainAddressId that = (DataSupplierMainAddressId) o;
        return getdLNr() == that.getdLNr() &&
                getAdressart() == that.getAdressart();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getdLNr(), getAdressart());
    }
}
