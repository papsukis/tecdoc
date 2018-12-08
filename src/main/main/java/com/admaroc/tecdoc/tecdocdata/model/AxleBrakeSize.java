package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AxleBrakeSizeId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="163_axle_brake_size")
public class AxleBrakeSize {

    @EmbeddedId
    AxleBrakeSizeId id;
    int dLNr;
    int sA;
    int bremsengrobe;
    String beeichnung;
    int loschFlag;

    @MapsId("aTypNr")
    @ManyToOne
    @JoinColumn(name = "aTypNr",
                referencedColumnName = "aTypNr")
    private Axle axle;
    @MapsId("KeyTablesEntriesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;

    public AxleBrakeSize() {
    }

    public AxleBrakeSize(Map<String,String> datas) {
        this.id = new AxleBrakeSizeId(Integer.valueOf(datas.get("AtypNr")),Integer.valueOf(datas.get("LfdNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.bremsengrobe = Integer.valueOf(datas.get("Bremsengröße"));
        this.beeichnung =datas.get("Bezeichnung");
        this.loschFlag = 0;
    }

    public Axle getAxle() {
        return axle;
    }

    public void setAxle(Axle axle) {
        this.axle = axle;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public AxleBrakeSizeId getId() {
        return id;
    }

    public void setId(AxleBrakeSizeId id) {
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


    public int getBremsengrobe() {
        return bremsengrobe;
    }

    public void setBremsengrobe(int bremsengrobe) {
        this.bremsengrobe = bremsengrobe;
    }

    public String getBeeichnung() {
        return beeichnung;
    }

    public void setBeeichnung(String beeichnung) {
        this.beeichnung = beeichnung;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
