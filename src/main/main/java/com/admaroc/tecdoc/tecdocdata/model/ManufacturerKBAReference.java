package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ManufacturerKbaReferenceId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="103_manufacturer_kba_reference")
public class ManufacturerKBAReference {

    @EmbeddedId
    ManufacturerKbaReferenceId id;
    int dLNr;
    int sA;

    @MapsId("herNr")
    @ManyToOne
    @JoinColumn(name = "herNr",
                referencedColumnName = "herNr")
    private Manufacturer manufacturer;

    public ManufacturerKBAReference() {
    }

    public ManufacturerKBAReference(Map<String,String> datas) {
        this.id = new ManufacturerKbaReferenceId(Integer.valueOf(datas.get("kBANr")),Integer.valueOf(datas.get("HerNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ManufacturerKbaReferenceId getId() {
        return id;
    }

    public void setId(ManufacturerKbaReferenceId id) {
        this.id = id;
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

}
