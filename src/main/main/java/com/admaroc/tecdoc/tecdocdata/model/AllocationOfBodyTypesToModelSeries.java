package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfBodyTypesToModelSeriesId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="143_allocation_of_body_types_to_model_series")
public class AllocationOfBodyTypesToModelSeries {


    @EmbeddedId
    AllocationOfBodyTypesToModelSeriesId id;
    int dLNr;
    int sA;
    int sortNr;
    int loschFlag;

    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("kModNr")
    @ManyToOne
    @JoinColumn(name = "kModNr",
                referencedColumnName = "kModNr")
    private VehicleModelSeries vehicleModelSeries;

    public AllocationOfBodyTypesToModelSeries() {
    }

    public AllocationOfBodyTypesToModelSeries(Map<String,String> datas) {
        this.id = new AllocationOfBodyTypesToModelSeriesId(Integer.valueOf(datas.get("KmodNr")),datas.get("LKZ"),datas.get("Muster"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.sortNr = Integer.valueOf(datas.get("SortNr"));
        this.loschFlag = 0;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public VehicleModelSeries getVehicleModelSeries() {
        return vehicleModelSeries;
    }

    public void setVehicleModelSeries(VehicleModelSeries vehicleModelSeries) {
        this.vehicleModelSeries = vehicleModelSeries;
    }

    public AllocationOfBodyTypesToModelSeriesId getId() {
        return id;
    }

    public void setId(AllocationOfBodyTypesToModelSeriesId id) {
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
