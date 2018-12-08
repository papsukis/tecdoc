package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="144_additional_vehicle_type_descriptions")
public class AdditionalVehicleTypeDescriptions {

    @Id
    int kTypNr;
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
                    referencedColumnName = "sprachNr")})
    private CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions;
    @MapsId("kTypNr")
    @ManyToOne
    @JoinColumn(name = "kTypNr",
                referencedColumnName = "kTypNr")
    private VehicleTypes vehicleTypes;

    public AdditionalVehicleTypeDescriptions() {
    }

    public AdditionalVehicleTypeDescriptions(Map<String,String> datas) {
        this.kTypNr = Integer.valueOf(datas.get("KTypNr"));
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

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(VehicleTypes vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
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

    public int getkTypNr() {
        return kTypNr;
    }

    public void setkTypNr(int kTypNr) {
        this.kTypNr = kTypNr;
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
