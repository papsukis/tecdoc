package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class KBATypeAllocationId implements Serializable {

    @Column(name="kBANr")
    String kBANr;
    @Column(name="kTypNr")
    int kTypNr;

    public KBATypeAllocationId(String kBANr, int kTypNr) {
        this.kBANr = kBANr;
        this.kTypNr = kTypNr;
    }

    public KBATypeAllocationId() {

    }

    public String getkBANr() {
        return kBANr;
    }

    public int getkTypNr() {
        return kTypNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KBATypeAllocationId that = (KBATypeAllocationId) o;
        return getkTypNr() == that.getkTypNr() &&
                Objects.equals(getkBANr(), that.getkBANr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getkBANr(), getkTypNr());
    }
}
