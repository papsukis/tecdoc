package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="100_manufacturer")
public class Manufacturer {

    @Id
    int herNr;
    int dLNr;
    int sA;
    String hKZ;
    int lBezNr;
    int pKW;
    int nKW;
    int vGL;
    int achse;
    int motor;
    int getriebe;
    int transporter;
    int delet;
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
    private CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescription;
    @MapsId("dLNr")
    @ManyToOne
    @JoinColumn(name = "dLNr",
            referencedColumnName = "dLNr")
    private Header header;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "manufacturer")
    private List<ManufacturerKBAReference >manufacturerKBAReference;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "manufacturer")
    private List<VehicleModelSeries> vehicleModelSeries;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "manufacturer")
    private List<ReferenceNumbers> referenceNumbers;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "manufacturer")
    private List<Transmission> transmissions;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "manufacturer")
    private List<CVDriverCabs> cvDriverCabs;

    public Manufacturer() {
    }

    public Manufacturer(Map<String,String> datas) {
        this.herNr =Integer.valueOf(datas.get("HerNr"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.hKZ = datas.get("HKZ");
        this.lBezNr = Integer.valueOf(datas.get("LBezNr"));
        this.pKW = Integer.valueOf(datas.get("PKW"));
        this.nKW = Integer.valueOf(datas.get("NKW"));
        this.vGL = Integer.valueOf(datas.get("VGL"));
        this.achse = Integer.valueOf(datas.get("Achse"));
        this.motor = Integer.valueOf(datas.get("Motor"));
        this.getriebe = Integer.valueOf(datas.get("Getriebe"));
        this.transporter = Integer.valueOf(datas.get("Transporter"));
        this.delet = Integer.valueOf(datas.get("Delete"));
        this.loschFlag = 0;//Integer.valueOf(datas.get("Lösch-Flag"));
    }

    public CountryAndLanguageDependentDescriptions getCountryAndLanguageDependentDescription() {
        return countryAndLanguageDependentDescription;
    }

    public void setCountryAndLanguageDependentDescription(CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescription) {
        this.countryAndLanguageDependentDescription = countryAndLanguageDependentDescription;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<ManufacturerKBAReference> getManufacturerKBAReference() {
        return manufacturerKBAReference;
    }

    public void setManufacturerKBAReference(List<ManufacturerKBAReference> manufacturerKBAReference) {
        this.manufacturerKBAReference = manufacturerKBAReference;
    }

    public List<VehicleModelSeries> getVehicleModelSeries() {
        return vehicleModelSeries;
    }

    public void setVehicleModelSeries(List<VehicleModelSeries> vehicleModelSeries) {
        this.vehicleModelSeries = vehicleModelSeries;
    }

    public List<ReferenceNumbers> getReferenceNumbers() {
        return referenceNumbers;
    }

    public void setReferenceNumbers(List<ReferenceNumbers> referenceNumbers) {
        this.referenceNumbers = referenceNumbers;
    }

    public List<Transmission> getTransmissions() {
        return transmissions;
    }

    public void setTransmissions(List<Transmission> transmissions) {
        this.transmissions = transmissions;
    }

    public List<CVDriverCabs> getCvDriverCabs() {
        return cvDriverCabs;
    }

    public void setCvDriverCabs(List<CVDriverCabs> cvDriverCabs) {
        this.cvDriverCabs = cvDriverCabs;
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

    public int getHerNr() {
        return herNr;
    }

    public void setHerNr(int herNr) {
        this.herNr = herNr;
    }

    public String gethKZ() {
        return hKZ;
    }

    public void sethKZ(String hKZ) {
        this.hKZ = hKZ;
    }

    public int getlBezNr() {
        return lBezNr;
    }

    public void setlBezNr(int lBezNr) {
        this.lBezNr = lBezNr;
    }

    public int getpKW() {
        return pKW;
    }

    public void setpKW(int pKW) {
        this.pKW = pKW;
    }

    public int getnKW() {
        return nKW;
    }

    public void setnKW(int nKW) {
        this.nKW = nKW;
    }

    public int getvGL() {
        return vGL;
    }

    public void setvGL(int vGL) {
        this.vGL = vGL;
    }

    public int getAchse() {
        return achse;
    }

    public void setAchse(int achse) {
        this.achse = achse;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getGetriebe() {
        return getriebe;
    }

    public void setGetriebe(int getriebe) {
        this.getriebe = getriebe;
    }

    public int getTransporter() {
        return transporter;
    }

    public void setTransporter(int transporter) {
        this.transporter = transporter;
    }

    public int getDelete() {
        return delet;
    }

    public void setDelete(int delet) {
        this.delet = delet;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
