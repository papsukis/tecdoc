package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.VehicleCountrySpecificationsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="124_vehicle_country_specifications")
public class VehicleCountrySpecifications {

    @EmbeddedId
    VehicleCountrySpecificationsId id;
    int dLNr;
    int sA;
    int bjvon;
    int bjbis;
    int ccmSteuer;
    int lit;
    int zyl;
    int tueren;
    int tanklnhalt;
    int spannung;
    int aBS;
    int aSR;
    int krStoffArt;
    int katArt;
    int getrArt;
    int bremsArt;
    int bremsSys;
    int loschFlag;

    @MapsId("kTypNr")
    @ManyToOne
    @JoinColumn(name = "kTypNr",
                referencedColumnName = "kTypNr")
    private VehicleTypes vehicleTypes;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;

    public VehicleCountrySpecifications() {
    }

    public VehicleCountrySpecifications(Map<String,String> datas) {
        this.id = new VehicleCountrySpecificationsId(Integer.valueOf(datas.get("KTypNr")),datas.get("LKZ"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.bjvon = Integer.valueOf(datas.get("Bjvon"));
        this.bjbis = Integer.valueOf(datas.get("Bjbis"));
        this.ccmSteuer = Integer.valueOf(datas.get("ccmSteuer"));
        this.lit = Integer.valueOf(datas.get("Lit"));
        this.zyl = Integer.valueOf(datas.get("Zyl"));
        this.tueren = Integer.valueOf(datas.get("Tueren"));
        this.tanklnhalt = Integer.valueOf(datas.get("TankInhalt"));
        this.spannung = Integer.valueOf(datas.get("Spannung"));
        this.aBS = Integer.valueOf(datas.get("ABS"));
        this.aSR = Integer.valueOf(datas.get("ASR"));
        this.krStoffArt = Integer.valueOf(datas.get("KrStoffArt"));
        this.katArt = Integer.valueOf(datas.get("KatArt"));
        this.getrArt = Integer.valueOf(datas.get("GetrArt"));
        this.bremsArt = Integer.valueOf(datas.get("BremsArt"));
        this.bremsSys = Integer.valueOf(datas.get("BremsSys"));
        this.loschFlag = 0;
    }

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(VehicleTypes vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public VehicleCountrySpecificationsId getId() {
        return id;
    }

    public void setId(VehicleCountrySpecificationsId id) {
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


    public int getBjvon() {
        return bjvon;
    }

    public void setBjvon(int bjvon) {
        this.bjvon = bjvon;
    }

    public int getBjbis() {
        return bjbis;
    }

    public void setBjbis(int bjbis) {
        this.bjbis = bjbis;
    }

    public int getCcmSteuer() {
        return ccmSteuer;
    }

    public void setCcmSteuer(int ccmSteuer) {
        this.ccmSteuer = ccmSteuer;
    }

    public int getLit() {
        return lit;
    }

    public void setLit(int lit) {
        this.lit = lit;
    }

    public int getZyl() {
        return zyl;
    }

    public void setZyl(int zyl) {
        this.zyl = zyl;
    }

    public int getTueren() {
        return tueren;
    }

    public void setTueren(int tueren) {
        this.tueren = tueren;
    }

    public int getTanklnhalt() {
        return tanklnhalt;
    }

    public void setTanklnhalt(int tanklnhalt) {
        this.tanklnhalt = tanklnhalt;
    }

    public int getSpannung() {
        return spannung;
    }

    public void setSpannung(int spannung) {
        this.spannung = spannung;
    }

    public int getaBS() {
        return aBS;
    }

    public void setaBS(int aBS) {
        this.aBS = aBS;
    }

    public int getaSR() {
        return aSR;
    }

    public void setaSR(int aSR) {
        this.aSR = aSR;
    }

    public int getKrStoffArt() {
        return krStoffArt;
    }

    public void setKrStoffArt(int krStoffArt) {
        this.krStoffArt = krStoffArt;
    }

    public int getKatArt() {
        return katArt;
    }

    public void setKatArt(int katArt) {
        this.katArt = katArt;
    }

    public int getGetrArt() {
        return getrArt;
    }

    public void setGetrArt(int getrArt) {
        this.getrArt = getrArt;
    }

    public int getBremsArt() {
        return bremsArt;
    }

    public void setBremsArt(int bremsArt) {
        this.bremsArt = bremsArt;
    }

    public int getBremsSys() {
        return bremsSys;
    }

    public void setBremsSys(int bremsSys) {
        this.bremsSys = bremsSys;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
