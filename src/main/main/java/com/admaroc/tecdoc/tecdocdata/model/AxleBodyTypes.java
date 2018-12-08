package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AxleBodyTypesId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="161_axle_body_types")
public class AxleBodyTypes {

    @EmbeddedId
    AxleBodyTypesId id;
    int dLNr;
    int sA;
    int sortNr;
    int loschFlag;

    @MapsId("aTypNr")
    @ManyToOne
    @JoinColumn(name = "aTypNr",
                referencedColumnName = "aTypNr")
    private Axle axle;

    public AxleBodyTypes() {
    }

    public AxleBodyTypes(Map<String,String> datas) {
        this.id = new AxleBodyTypesId(Integer.valueOf(datas.get("AtypNr")),datas.get("SortNr"),datas.get("Muster"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.sortNr = Integer.valueOf(datas.get("SortNr"));
        this.loschFlag = loschFlag;
    }

    public Axle getAxle() {
        return axle;
    }

    public void setAxle(Axle axle) {
        this.axle = axle;
    }

    public AxleBodyTypesId getId() {
        return id;
    }

    public void setId(AxleBodyTypesId id) {
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

    public int getSortNr() {
        return sortNr;
    }

    public void setSortNr(int sortNr) {
        this.sortNr = sortNr;
    }


    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
