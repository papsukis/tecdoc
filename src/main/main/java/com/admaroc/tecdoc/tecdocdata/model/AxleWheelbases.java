package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AxleWheelbasesId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="162_axle_wheelbases")
public class AxleWheelbases {

    @EmbeddedId
    AxleWheelbasesId id;
    int dLNr;
    int sA;
    String achsPos;
    int radstand;
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

    public AxleWheelbases() {
    }

    public AxleWheelbases(Map<String,String> datas) {
        this.id = new AxleWheelbasesId(Integer.valueOf(datas.get("AtypNr")),Integer.valueOf(datas.get("LfdNr")),Integer.valueOf(datas.get("SortNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.achsPos = datas.get("AchsPos");
        this.radstand = Integer.valueOf(datas.get("Radstand"));
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

    public AxleWheelbasesId getId() {
        return id;
    }

    public void setId(AxleWheelbasesId id) {
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


    public String getAchsPos() {
        return achsPos;
    }

    public void setAchsPos(String achsPos) {
        this.achsPos = achsPos;
    }

    public int getRadstand() {
        return radstand;
    }

    public void setRadstand(int radstand) {
        this.radstand = radstand;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
