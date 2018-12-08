package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="001_header")
public class Header {

    @Id
    private int dLNr;
    private int sA;
    private int dataRelease;
    private int datum;
    private int kZVoll;
    private int hernr;
    private String marke;
    private int referenzdaten;
    private int vorversion;
    private String format;
    private int loschFlag;
    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "header")
    private List<Manufacturer> manufacturer;

    public Header() {
    }

    public Header(Map<String,String> datas) {
        this.dLNr = dLNr;
        this.sA = sA;
        this.dataRelease = dataRelease;
        this.datum = datum;
        this.kZVoll = kZVoll;
        this.hernr = hernr;
        this.marke = marke;
        this.referenzdaten = referenzdaten;
        this.vorversion = vorversion;
        this.format = format;
        this.loschFlag = loschFlag;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(List<Manufacturer> manufacturer) {
        this.manufacturer = manufacturer;
    }


    public int getdLNr() {
        return dLNr;
    }

    public void setdLNr(int dLNr) {
        this.dLNr = dLNr;
    }

    public int getsA() {
        return sA;
    }

    public void setsA(int sA) {
        this.sA = sA;
    }

    public int getDataRelease() {
        return dataRelease;
    }

    public void setDataRelease(int dataRelease) {
        this.dataRelease = dataRelease;
    }

    public int getDatum() {
        return datum;
    }

    public void setDatum(int datum) {
        this.datum = datum;
    }

    public int getkZVoll() {
        return kZVoll;
    }

    public void setkZVoll(int kZVoll) {
        this.kZVoll = kZVoll;
    }

    public int getHernr() {
        return hernr;
    }

    public void setHernr(int hernr) {
        this.hernr = hernr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getReferenzdaten() {
        return referenzdaten;
    }

    public void setReferenzdaten(int referenzdaten) {
        this.referenzdaten = referenzdaten;
    }

    public int getVorversion() {
        return vorversion;
    }

    public void setVorversion(int vorversion) {
        this.vorversion = vorversion;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
