package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="140_additional_descriptions_to_vehicle_model_series")
public class AdditionalDescriptionsToVehicleModelSeries {

    @Id
    int kModNr;
    int dLNr;
    int sA;
    int lbezNr1;
    int lbezNr2;
    int loschFlag;

    @MapsId("CountryAndLanguageDependentDescriptionsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "lBezNr",
                    referencedColumnName = "lBezNr"),
            @JoinColumn(
                    name = "lKZ",
                    referencedColumnName = "lKZ"),
            @JoinColumn(
                    name = "sprachNr",
                    referencedColumnName = "sprachNr")
    })
    private CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions;
    @MapsId("kModNr")
    @ManyToOne
    @JoinColumn(name = "kModNr",
                referencedColumnName = "kModNr")
    private VehicleModelSeries vehicleModelSeries;

    public AdditionalDescriptionsToVehicleModelSeries() {
    }

    public AdditionalDescriptionsToVehicleModelSeries(Map<String,String> datas) {
        this.kModNr = Integer.valueOf(datas.get("KModNr"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.lbezNr1 = Integer.valueOf(datas.get("LbezNr1"));
        this.lbezNr2 = Integer.valueOf(datas.get("LbezNr2"));
        this.loschFlag = 0;
    }

    public CountryAndLanguageDependentDescriptions getCountryAndLanguageDependentDescriptions() {
        return countryAndLanguageDependentDescriptions;
    }

    public void setCountryAndLanguageDependentDescriptions(CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions) {
        this.countryAndLanguageDependentDescriptions = countryAndLanguageDependentDescriptions;
    }

    public VehicleModelSeries getVehicleModelSeries() {
        return vehicleModelSeries;
    }

    public void setVehicleModelSeries(VehicleModelSeries vehicleModelSeries) {
        this.vehicleModelSeries = vehicleModelSeries;
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

    public int getkModNr() {
        return kModNr;
    }

    public void setkModNr(int kModNr) {
        this.kModNr = kModNr;
    }

    public int getLbezNr1() {
        return lbezNr1;
    }

    public void setLbezNr1(int lbezNr1) {
        this.lbezNr1 = lbezNr1;
    }

    public int getLbezNr2() {
        return lbezNr2;
    }

    public void setLbezNr2(int lbezNr2) {
        this.lbezNr2 = lbezNr2;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
