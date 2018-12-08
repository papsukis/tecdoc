package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="155_engines")
public class Engines {

    @Id
    int motNr;
    int dLNr;
    int sA;
    int herNr;
    String mCode;
    int bjvon;
    int bjbis;
    int kWvon;
    int kWbis;
    int pSvon;
    int pSbis;
    int ventile;
    int zyl;
    int verdichtV;
    int verdichtB;
    int drehmV;
    int drehmB;
    int ccmSteuerV;
    int ccmSteuerB;
    int ccmTechV;
    int ccmTechB;
    int litSteuerV;
    int litSteuerB;
    int litTechV;
    int litTechB;
    int motVerw;
    int motBauForm;
    int krStoffArt;
    int krStoffAuf;
    int motBeatm;
    int uminKwV;
    int uminKwb;
    int uminDrehmV;
    int uminDrehmB;
    int kurbel;
    int bohrung;
    int hub;
    int motorart;
    int abgasnorm;
    int zylBauForm;
    int motSteur;
    int ventilSteur;
    int kuehlArt;
    String vkBez;
    int exclude;
    int delet;
    int loschFlag;

    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "engines")
    private List<EngineNumberAllocationtoVehicleTypes> engineNumberAllocationtoVehicleTypes;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "engines")
    private List<EngineCountryRestrictions> engineCountryRestrictions;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "engines")
    private List<CVTypesAndEngineAllocation> cvTypesAndEngineAllocations;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;

    public Engines() {
    }

    public Engines(Map<String,String> datas) {
        this.motNr = Integer.valueOf(datas.get("MotNr"));
        this.dLNr = Integer.valueOf(datas.get("MotNr"));
        this.sA = Integer.valueOf(datas.get("MotNr"));
        this.herNr = Integer.valueOf(datas.get("HerNr"));
        this.mCode = datas.get("MCode");
        this.bjvon = Integer.valueOf(datas.get("BJvon"));
        this.bjbis = Integer.valueOf(datas.get("BJvon"));
        this.kWvon = Integer.valueOf(datas.get("kWvon"));
        this.kWbis = Integer.valueOf(datas.get("kWvon"));
        this.pSvon = Integer.valueOf(datas.get("PSvon"));
        this.pSbis = Integer.valueOf(datas.get("PSbis"));
        this.ventile = Integer.valueOf(datas.get("Ventile"));
        this.zyl = Integer.valueOf(datas.get("Zyl"));
        this.verdichtV = Integer.valueOf(datas.get("VerdichtV"));
        this.verdichtB = Integer.valueOf(datas.get("VerdichtB"));
        this.drehmV = Integer.valueOf(datas.get("DrehmV"));
        this.drehmB = Integer.valueOf(datas.get("DrehmB"));
        this.ccmSteuerV = Integer.valueOf(datas.get("ccmSteuerV"));
        this.ccmSteuerB = Integer.valueOf(datas.get("ccmSteuerB"));
        this.ccmTechV = Integer.valueOf(datas.get("ccmTechV"));
        this.ccmTechB = Integer.valueOf(datas.get("ccmTechB"));
        this.litSteuerV = Integer.valueOf(datas.get("LitSteuerV"));
        this.litSteuerB = Integer.valueOf(datas.get("LitSteuerB"));
        this.litTechV = Integer.valueOf(datas.get("LitTechV"));
        this.litTechB = Integer.valueOf(datas.get("LitTechB"));
        this.motVerw = Integer.valueOf(datas.get("MotVerw"));
        this.motBauForm = Integer.valueOf(datas.get("MotBauForm"));
        this.krStoffArt = Integer.valueOf(datas.get("KrStoffArt"));
        this.krStoffAuf = Integer.valueOf(datas.get("KrStoffAuf"));
        this.motBeatm = Integer.valueOf(datas.get("MotBeatm"));
        this.uminKwV = Integer.valueOf(datas.get("UminKwV"));
        this.uminKwb = Integer.valueOf(datas.get("UminKwB"));
        this.uminDrehmV = Integer.valueOf(datas.get("UminDrehmV"));
        this.uminDrehmB = Integer.valueOf(datas.get("UminDrehmB"));
        this.kurbel = Integer.valueOf(datas.get("Kurbel"));
        this.bohrung = Integer.valueOf(datas.get("Bohrung"));
        this.hub = Integer.valueOf(datas.get("Hub"));
        this.motorart = Integer.valueOf(datas.get("Motorart"));
        this.abgasnorm = Integer.valueOf(datas.get("Abgasnorm"));
        this.zylBauForm = Integer.valueOf(datas.get("ZylBauForm"));
        this.motSteur = Integer.valueOf(datas.get("MotSteuer"));
        this.ventilSteur = Integer.valueOf(datas.get("VentilSteuer"));
        this.kuehlArt = Integer.valueOf(datas.get("KuehlArt"));
        this.vkBez = datas.get("VkBez");
        this.exclude = Integer.valueOf(datas.get("Exclude"));
        this.delet = Integer.valueOf(datas.get("Delete"));
        this.loschFlag = 0;
    }

    public int getDelet() {
        return delet;
    }

    public void setDelet(int delet) {
        this.delet = delet;
    }

    public List<EngineNumberAllocationtoVehicleTypes> getEngineNumberAllocationtoVehicleTypes() {
        return engineNumberAllocationtoVehicleTypes;
    }

    public void setEngineNumberAllocationtoVehicleTypes(List<EngineNumberAllocationtoVehicleTypes> engineNumberAllocationtoVehicleTypes) {
        this.engineNumberAllocationtoVehicleTypes = engineNumberAllocationtoVehicleTypes;
    }

    public List<EngineCountryRestrictions> getEngineCountryRestrictions() {
        return engineCountryRestrictions;
    }

    public void setEngineCountryRestrictions(List<EngineCountryRestrictions> engineCountryRestrictions) {
        this.engineCountryRestrictions = engineCountryRestrictions;
    }

    public List<CVTypesAndEngineAllocation> getCvTypesAndEngineAllocations() {
        return cvTypesAndEngineAllocations;
    }

    public void setCvTypesAndEngineAllocations(List<CVTypesAndEngineAllocation> cvTypesAndEngineAllocations) {
        this.cvTypesAndEngineAllocations = cvTypesAndEngineAllocations;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
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

    public int getMotNr() {
        return motNr;
    }

    public void setMotNr(int motNr) {
        this.motNr = motNr;
    }

    public String getmCode() {
        return mCode;
    }

    public void setmCode(String mCode) {
        this.mCode = mCode;
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

    public int getkWvon() {
        return kWvon;
    }

    public void setkWvon(int kWvon) {
        this.kWvon = kWvon;
    }

    public int getkWbis() {
        return kWbis;
    }

    public void setkWbis(int kWbis) {
        this.kWbis = kWbis;
    }

    public int getpSvon() {
        return pSvon;
    }

    public void setpSvon(int pSvon) {
        this.pSvon = pSvon;
    }

    public int getpSbis() {
        return pSbis;
    }

    public void setpSbis(int pSbis) {
        this.pSbis = pSbis;
    }

    public int getVentile() {
        return ventile;
    }

    public void setVentile(int ventile) {
        this.ventile = ventile;
    }

    public int getZyl() {
        return zyl;
    }

    public void setZyl(int zyl) {
        this.zyl = zyl;
    }

    public int getVerdichtV() {
        return verdichtV;
    }

    public void setVerdichtV(int verdichtV) {
        this.verdichtV = verdichtV;
    }

    public int getVerdichtB() {
        return verdichtB;
    }

    public void setVerdichtB(int verdichtB) {
        this.verdichtB = verdichtB;
    }

    public int getDrehmV() {
        return drehmV;
    }

    public void setDrehmV(int drehmV) {
        this.drehmV = drehmV;
    }

    public int getDrehmB() {
        return drehmB;
    }

    public void setDrehmB(int drehmB) {
        this.drehmB = drehmB;
    }

    public int getCcmSteuerV() {
        return ccmSteuerV;
    }

    public void setCcmSteuerV(int ccmSteuerV) {
        this.ccmSteuerV = ccmSteuerV;
    }

    public int getCcmSteuerB() {
        return ccmSteuerB;
    }

    public void setCcmSteuerB(int ccmSteuerB) {
        this.ccmSteuerB = ccmSteuerB;
    }

    public int getCcmTechV() {
        return ccmTechV;
    }

    public void setCcmTechV(int ccmTechV) {
        this.ccmTechV = ccmTechV;
    }

    public int getCcmTechB() {
        return ccmTechB;
    }

    public void setCcmTechB(int ccmTechB) {
        this.ccmTechB = ccmTechB;
    }

    public int getLitSteuerV() {
        return litSteuerV;
    }

    public void setLitSteuerV(int litSteuerV) {
        this.litSteuerV = litSteuerV;
    }

    public int getLitSteuerB() {
        return litSteuerB;
    }

    public void setLitSteuerB(int litSteuerB) {
        this.litSteuerB = litSteuerB;
    }

    public int getLitTechV() {
        return litTechV;
    }

    public void setLitTechV(int litTechV) {
        this.litTechV = litTechV;
    }

    public int getLitTechB() {
        return litTechB;
    }

    public void setLitTechB(int litTechB) {
        this.litTechB = litTechB;
    }

    public int getMotVerw() {
        return motVerw;
    }

    public void setMotVerw(int motVerw) {
        this.motVerw = motVerw;
    }

    public int getMotBauForm() {
        return motBauForm;
    }

    public void setMotBauForm(int motBauForm) {
        this.motBauForm = motBauForm;
    }

    public int getKrStoffArt() {
        return krStoffArt;
    }

    public void setKrStoffArt(int krStoffArt) {
        this.krStoffArt = krStoffArt;
    }

    public int getKrStoffAuf() {
        return krStoffAuf;
    }

    public void setKrStoffAuf(int krStoffAuf) {
        this.krStoffAuf = krStoffAuf;
    }

    public int getMotBeatm() {
        return motBeatm;
    }

    public void setMotBeatm(int motBeatm) {
        this.motBeatm = motBeatm;
    }

    public int getUminKwV() {
        return uminKwV;
    }

    public void setUminKwV(int uminKwV) {
        this.uminKwV = uminKwV;
    }

    public int getUminKwb() {
        return uminKwb;
    }

    public void setUminKwb(int uminKwb) {
        this.uminKwb = uminKwb;
    }

    public int getUminDrehmV() {
        return uminDrehmV;
    }

    public void setUminDrehmV(int uminDrehmV) {
        this.uminDrehmV = uminDrehmV;
    }

    public int getUminDrehmB() {
        return uminDrehmB;
    }

    public void setUminDrehmB(int uminDrehmB) {
        this.uminDrehmB = uminDrehmB;
    }

    public int getKurbel() {
        return kurbel;
    }

    public void setKurbel(int kurbel) {
        this.kurbel = kurbel;
    }

    public int getBohrung() {
        return bohrung;
    }

    public void setBohrung(int bohrung) {
        this.bohrung = bohrung;
    }

    public int getHub() {
        return hub;
    }

    public void setHub(int hub) {
        this.hub = hub;
    }

    public int getMotorart() {
        return motorart;
    }

    public void setMotorart(int motorart) {
        this.motorart = motorart;
    }

    public int getAbgasnorm() {
        return abgasnorm;
    }

    public void setAbgasnorm(int abgasnorm) {
        this.abgasnorm = abgasnorm;
    }

    public int getZylBauForm() {
        return zylBauForm;
    }

    public void setZylBauForm(int zylBauForm) {
        this.zylBauForm = zylBauForm;
    }

    public int getMotSteur() {
        return motSteur;
    }

    public void setMotSteur(int motSteur) {
        this.motSteur = motSteur;
    }

    public int getVentilSteur() {
        return ventilSteur;
    }

    public void setVentilSteur(int ventilSteur) {
        this.ventilSteur = ventilSteur;
    }

    public int getKuehlArt() {
        return kuehlArt;
    }

    public void setKuehlArt(int kuehlArt) {
        this.kuehlArt = kuehlArt;
    }

    public String getVkBez() {
        return vkBez;
    }

    public void setVkBez(String vkBez) {
        this.vkBez = vkBez;
    }

    public int getExclude() {
        return exclude;
    }

    public void setExclude(int exclude) {
        this.exclude = exclude;
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
