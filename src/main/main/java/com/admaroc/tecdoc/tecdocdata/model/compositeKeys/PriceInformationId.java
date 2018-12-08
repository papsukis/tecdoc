package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Index;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PriceInformationId implements Serializable{

    @Column(name="artNr",length = 100 )
    String artNr;
    @Column(name="prArt",length = 100)
    int prArt;
    @Column(name="lKZ",length = 100)
    String lKZ;
    @Column(name="wKZ",length = 100)
    String wKZ;
    @Column(name="datvon",length = 100)
    int datvon;
    @Column(name="pENr",length = 100)
    int pENr;
    @Column(name="mENr",length = 100)
    String mENr;

    public PriceInformationId() {
    }

    public PriceInformationId(String artNr, int prArt, String lKZ, String wKZ, int datvon, int pENr, String mENr) {
        this.artNr = artNr;
        this.prArt = prArt;
        this.lKZ = lKZ;
        this.wKZ = wKZ;
        this.datvon = datvon;
        this.pENr = pENr;
        this.mENr = mENr;
    }

    public String getArtNr() {
        return artNr;
    }

    public int getPrArt() {
        return prArt;
    }

    public String getlKZ() {
        return lKZ;
    }

    public String getwKZ() {
        return wKZ;
    }

    public int getDatvon() {
        return datvon;
    }

    public int getpENr() {
        return pENr;
    }

    public String getmENr() {
        return mENr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceInformationId that = (PriceInformationId) o;
        return getPrArt() == that.getPrArt() &&
                getDatvon() == that.getDatvon() &&
                getpENr() == that.getpENr() &&
                Objects.equals(getArtNr(), that.getArtNr()) &&
                Objects.equals(getlKZ(), that.getlKZ()) &&
                Objects.equals(getwKZ(), that.getwKZ()) &&
                Objects.equals(getmENr(), that.getmENr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArtNr(), getPrArt(), getlKZ(), getwKZ(), getDatvon(), getpENr(), getmENr());
    }
}
