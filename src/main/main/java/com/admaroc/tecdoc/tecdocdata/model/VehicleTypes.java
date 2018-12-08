package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="120_vehicle_types")
public class VehicleTypes {

    @Id
    int kTypNr;
    int dLNr;
    int sA;
    int lbezNr;
    int kModNr;
    int sortNr;
    int bjvon;
    int bjbis;
    int kW;
    int pS;
    int ccmSteuer;
    int ccmTech;
    int lit;
    int zyl;
    int tueren;
    int tanklnhalt;
    int spannung;
    int aBS;
    int aSR;
    int motArt;
    int kraftstoffaufBereitungspriNzip;
    int antrArt;
    int bremsArt;
    int bremsSys;
    int ventileBrennraum;
    int krStoffArt;
    int katArt;
    int getrArt;
    int aufbauArt;
    int delet;
    int loschFlag;

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
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleTypes")
    private List<EngineNumberAllocationtoVehicleTypes> engineNumberAllocationtoVehicleTypes;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleTypes")
    private List<AdditionalVehicleTypeDescriptions> additionalVehicleTypeDescriptions;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleTypes")
    private List<BodyType> bodyTypes;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleTypes")
    private List<DriveTypeSynonyms> driveTypeSynonyms;
    @MapsId("AllocationOfSwedishNumberPlatesToVehicleTypesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "sTyp",
                    referencedColumnName = "sTyp"),
            @JoinColumn(
                    name = "kTypNr",
                    referencedColumnName = "kTypNr")})
    private AllocationOfSwedishNumberPlatesToVehicleTypes allocationOfSwedishNumberPlatesToVehicleTypes;
    @MapsId("NetherlandsNumberPlateToVehicleTypeAllocationId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "nLTyp",
                    referencedColumnName = "nLTyp"),
            @JoinColumn(
                    name = "kTypNr",
                    referencedColumnName = "kTypNr")})
    private NetherlandsNumberPlateToVehicleTypeAllocation netherlandsNumberPlateToVehicleTypeAllocation;
    @MapsId("AllocationOfTypeMineNumbersToVehicleTypesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "typMine",
                    referencedColumnName = "typMine"),
            @JoinColumn(
                    name = "kTypNr",
                    referencedColumnName = "kTypNr")})
    private AllocationOfTypeMineNumbersToVehicleTypes allocationOfTypeMineNumbersToVehicleTypes;
    @MapsId("AustrianNatCodesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "natCode",
                    referencedColumnName = "natCode"),
            @JoinColumn(
                    name = "kTypNr",
                    referencedColumnName = "kTypNr")})
    private AustrianNatCodes austrianNatCodes;
    @MapsId("SwissTypeNumberAllocationToVehicleTypesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "chTyp",
                    referencedColumnName = "chTyp"),
            @JoinColumn(
                    name = "kTypNr",
                    referencedColumnName = "kTypNr")})
    private SwissTypeNumberAllocationToVehicleTypes swissTypeNumberAllocationToVehicleTypes;
    @MapsId("VehicleCountrySpecificationsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "kTypNr",
                    referencedColumnName = "kTypNr"),
            @JoinColumn(
                    name = "lKZ",
                    referencedColumnName = "lKZ")})
    private VehicleCountrySpecifications vehicleCountrySpecifications;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleTypes")
    private List<VehicleCountryRestriction> vehicleCountryRestrictions;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "vehicleTypes")
    private List<KBATypeAllocation> kbaTypeAllocations;

    public VehicleTypes() {
    }

    public VehicleTypes(Map<String,String> datas) {
        this.kTypNr = Integer.valueOf(datas.get("KTypNr"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.lbezNr = Integer.valueOf(datas.get("LbezNr"));
        this.kModNr = Integer.valueOf(datas.get("KModNr"));
        this.sortNr = Integer.valueOf(datas.get("SortNr"));
        this.bjvon = Integer.valueOf(datas.get("Bjvon"));
        this.bjbis = Integer.valueOf(datas.get("Bjbis"));
        this.kW = Integer.valueOf(datas.get("Bjbis"));
        this.pS = Integer.valueOf(datas.get("PS"));
        this.ccmSteuer = Integer.valueOf(datas.get("ccmSteuer"));
        this.ccmTech = Integer.valueOf(datas.get("ccmTech"));
        this.lit = Integer.valueOf(datas.get("Lit"));
        this.zyl = Integer.valueOf(datas.get("Zyl"));
        this.tueren = Integer.valueOf(datas.get("Tueren"));
        this.tanklnhalt = Integer.valueOf(datas.get("TankInhalt"));
        this.spannung = Integer.valueOf(datas.get("Spannung"));
        this.aBS = Integer.valueOf(datas.get("ABS"));
        this.aSR = Integer.valueOf(datas.get("ABS"));
        this.motArt = Integer.valueOf(datas.get("MotArt"));
        this.kraftstoffaufBereitungspriNzip = Integer.valueOf(datas.get("Kraftstoffaufbereitungsprinzip"));
        this.antrArt = Integer.valueOf(datas.get("AntrArt"));
        this.bremsArt = Integer.valueOf(datas.get("BremsArt"));
        this.bremsSys = Integer.valueOf(datas.get("BremsSys"));
        this.ventileBrennraum = Integer.valueOf(datas.get("Ventile/Brennraum"));
        this.krStoffArt = Integer.valueOf(datas.get("KrStoffArt"));
        this.katArt = Integer.valueOf(datas.get("KatArt"));
        this.getrArt = Integer.valueOf(datas.get("GetrArt"));
        this.aufbauArt = Integer.valueOf(datas.get("AufbauArt"));
        this.delet = Integer.valueOf(datas.get("Delete"));
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

    public List<EngineNumberAllocationtoVehicleTypes> getEngineNumberAllocationtoVehicleTypes() {
        return engineNumberAllocationtoVehicleTypes;
    }

    public void setEngineNumberAllocationtoVehicleTypes(List<EngineNumberAllocationtoVehicleTypes> engineNumberAllocationtoVehicleTypes) {
        this.engineNumberAllocationtoVehicleTypes = engineNumberAllocationtoVehicleTypes;
    }

    public List<AdditionalVehicleTypeDescriptions> getAdditionalVehicleTypeDescriptions() {
        return additionalVehicleTypeDescriptions;
    }

    public void setAdditionalVehicleTypeDescriptions(List<AdditionalVehicleTypeDescriptions> additionalVehicleTypeDescriptions) {
        this.additionalVehicleTypeDescriptions = additionalVehicleTypeDescriptions;
    }

    public List<BodyType> getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(List<BodyType> bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    public List<DriveTypeSynonyms> getDriveTypeSynonyms() {
        return driveTypeSynonyms;
    }

    public void setDriveTypeSynonyms(List<DriveTypeSynonyms> driveTypeSynonyms) {
        this.driveTypeSynonyms = driveTypeSynonyms;
    }

    public AllocationOfSwedishNumberPlatesToVehicleTypes getAllocationOfSwedishNumberPlatesToVehicleTypes() {
        return allocationOfSwedishNumberPlatesToVehicleTypes;
    }

    public void setAllocationOfSwedishNumberPlatesToVehicleTypes(AllocationOfSwedishNumberPlatesToVehicleTypes allocationOfSwedishNumberPlatesToVehicleTypes) {
        this.allocationOfSwedishNumberPlatesToVehicleTypes = allocationOfSwedishNumberPlatesToVehicleTypes;
    }

    public NetherlandsNumberPlateToVehicleTypeAllocation getNetherlandsNumberPlateToVehicleTypeAllocation() {
        return netherlandsNumberPlateToVehicleTypeAllocation;
    }

    public void setNetherlandsNumberPlateToVehicleTypeAllocation(NetherlandsNumberPlateToVehicleTypeAllocation netherlandsNumberPlateToVehicleTypeAllocation) {
        this.netherlandsNumberPlateToVehicleTypeAllocation = netherlandsNumberPlateToVehicleTypeAllocation;
    }

    public AllocationOfTypeMineNumbersToVehicleTypes getAllocationOfTypeMineNumbersToVehicleTypes() {
        return allocationOfTypeMineNumbersToVehicleTypes;
    }

    public void setAllocationOfTypeMineNumbersToVehicleTypes(AllocationOfTypeMineNumbersToVehicleTypes allocationOfTypeMineNumbersToVehicleTypes) {
        this.allocationOfTypeMineNumbersToVehicleTypes = allocationOfTypeMineNumbersToVehicleTypes;
    }

    public AustrianNatCodes getAustrianNatCodes() {
        return austrianNatCodes;
    }

    public void setAustrianNatCodes(AustrianNatCodes austrianNatCodes) {
        this.austrianNatCodes = austrianNatCodes;
    }

    public SwissTypeNumberAllocationToVehicleTypes getSwissTypeNumberAllocationToVehicleTypes() {
        return swissTypeNumberAllocationToVehicleTypes;
    }

    public void setSwissTypeNumberAllocationToVehicleTypes(SwissTypeNumberAllocationToVehicleTypes swissTypeNumberAllocationToVehicleTypes) {
        this.swissTypeNumberAllocationToVehicleTypes = swissTypeNumberAllocationToVehicleTypes;
    }

    public VehicleCountrySpecifications getVehicleCountrySpecifications() {
        return vehicleCountrySpecifications;
    }

    public void setVehicleCountrySpecifications(VehicleCountrySpecifications vehicleCountrySpecifications) {
        this.vehicleCountrySpecifications = vehicleCountrySpecifications;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public List<VehicleCountryRestriction> getVehicleCountryRestrictions() {
        return vehicleCountryRestrictions;
    }

    public void setVehicleCountryRestrictions(List<VehicleCountryRestriction> vehicleCountryRestrictions) {
        this.vehicleCountryRestrictions = vehicleCountryRestrictions;
    }

    public List<KBATypeAllocation> getKbaTypeAllocations() {
        return kbaTypeAllocations;
    }

    public void setKbaTypeAllocations(List<KBATypeAllocation> kbaTypeAllocations) {
        this.kbaTypeAllocations = kbaTypeAllocations;
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

    public int getLbezNr() {
        return lbezNr;
    }

    public void setLbezNr(int lbezNr) {
        this.lbezNr = lbezNr;
    }

    public int getkModNr() {
        return kModNr;
    }

    public void setkModNr(int kModNr) {
        this.kModNr = kModNr;
    }

    public int getSortNr() {
        return sortNr;
    }

    public void setSortNr(int sortNr) {
        this.sortNr = sortNr;
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

    public int getkW() {
        return kW;
    }

    public void setkW(int kW) {
        this.kW = kW;
    }

    public int getpS() {
        return pS;
    }

    public void setpS(int pS) {
        this.pS = pS;
    }

    public int getCcmSteuer() {
        return ccmSteuer;
    }

    public void setCcmSteuer(int ccmSteuer) {
        this.ccmSteuer = ccmSteuer;
    }

    public int getCcmTech() {
        return ccmTech;
    }

    public void setCcmTech(int ccmTech) {
        this.ccmTech = ccmTech;
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

    public int getMotArt() {
        return motArt;
    }

    public void setMotArt(int motArt) {
        this.motArt = motArt;
    }

    public int getKraftstoffaufBereitungspriNzip() {
        return kraftstoffaufBereitungspriNzip;
    }

    public void setKraftstoffaufBereitungspriNzip(int kraftstoffaufBereitungspriNzip) {
        this.kraftstoffaufBereitungspriNzip = kraftstoffaufBereitungspriNzip;
    }

    public int getAntrArt() {
        return antrArt;
    }

    public void setAntrArt(int antrArt) {
        this.antrArt = antrArt;
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

    public int getVentileBrennraum() {
        return ventileBrennraum;
    }

    public void setVentileBrennraum(int ventileBrennraum) {
        this.ventileBrennraum = ventileBrennraum;
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

    public int getAufbauArt() {
        return aufbauArt;
    }

    public void setAufbauArt(int aufbauArt) {
        this.aufbauArt = aufbauArt;
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
