package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ManufacturerKbaReferenceId implements Serializable{

    @Column(name="kBANr")
    int kBANr;
    @Column(name="herNr")
    int herNr;

    public ManufacturerKbaReferenceId() {
    }

    public ManufacturerKbaReferenceId(int kBANr, int herNr) {
        this.kBANr = kBANr;
        this.herNr = herNr;
    }

    public int getkBANr() {
        return kBANr;
    }

    public int getHerNr() {
        return herNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManufacturerKbaReferenceId that = (ManufacturerKbaReferenceId) o;
        return getkBANr() == that.getkBANr() &&
                getHerNr() == that.getHerNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getkBANr(), getHerNr());
    }
}
