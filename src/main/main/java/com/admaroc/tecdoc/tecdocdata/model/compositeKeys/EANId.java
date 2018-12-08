package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EANId implements Serializable{

    @Column(name="artNr")
    String artNr;
    @Column(name="lKZ")
    String lKZ;
    @Column(name="eANNr")
    int eANNr;

    public EANId() {
    }

    public EANId(String artNr, String lKZ, int eANNr) {
        this.artNr = artNr;
        this.lKZ = lKZ;
        this.eANNr = eANNr;
    }

    public String getArtNr() {
        return artNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    public int geteANNr() {
        return eANNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EANId eanId = (EANId) o;
        return geteANNr() == eanId.geteANNr() &&
                Objects.equals(getArtNr(), eanId.getArtNr()) &&
                Objects.equals(getlKZ(), eanId.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getlKZ(), geteANNr());
    }
}
