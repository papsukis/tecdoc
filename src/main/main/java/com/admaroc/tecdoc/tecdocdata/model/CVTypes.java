package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="532_cv_types")
public class CVTypes {

    @Id
    int nTypeNr;
    int dLNr;
    int sA;
    int kModNr;
    int sort;
    int lbezNr;
    int bjvon;
    int bjbis;
    int bauart;
    int motart;
    int kwvon;
    int kwbis;
    int psvon;
    int psbis;
    int ccmTech;
    int tonnage;
    int achsconfig;
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
    private CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;
    @MapsId("kModNr")
    @ManyToOne
    @JoinColumn(name = "kModNr",
                referencedColumnName = "kModNr")
    private VehicleModelSeries vehicleModelSeries;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "cvTypes")
    private List<AllocationOfAxleTypesToCVTypes > allocationOfAxleTypesToCVTypes;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVWheelbase> cvWheelbases;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<AllocationOfATransmissionToACV> allocationOfATransmissionToACVS;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVSuspension> cvSuspensions;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVTyres> cvTyres;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVChassis> cvChassis;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<AllocationOfDriverCabsToCVs> allocationOfDriverCabsToCVs;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVSecondaryTypes> cvSecondaryTypes;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVCountrySpecificDeviations> cvCountrySpecificDeviations;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVTypesVoltages> cvTypesVoltages;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CountryRestrictionsForTheAllocationOfCVToIDNumbers> countryRestrictionsForTheAllocationOfCVToIDNumbers;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<AllocationOfCVToCVIDNumbers> allocationOfCVToCVIDNumbers;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVTypesAndEngineAllocation> cvTypesAndEngineAllocations;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvTypes")
    private List<CVSecondaryTypesCountryRestrictions> cvSecondaryTypesCountryRestrictions;

    public CVTypes(Map<String,String> datas) {
        this.nTypeNr = nTypeNr;
        this.dLNr = dLNr;
        this.sA = sA;
        this.kModNr = kModNr;
        this.sort = sort;
        this.lbezNr = lbezNr;
        this.bjvon = bjvon;
        this.bjbis = bjbis;
        this.bauart = bauart;
        this.motart = motart;
        this.kwvon = kwvon;
        this.kwbis = kwbis;
        this.psvon = psvon;
        this.psbis = psbis;
        this.ccmTech = ccmTech;
        this.tonnage = tonnage;
        this.achsconfig = achsconfig;
        this.delet = delet;
        this.loschFlag = loschFlag;
    }

    public List<CVTypesVoltages> getCvTypesVoltages() {
        return cvTypesVoltages;
    }

    public void setCvTypesVoltages(List<CVTypesVoltages> cvTypesVoltages) {
        this.cvTypesVoltages = cvTypesVoltages;
    }

    public List<CountryRestrictionsForTheAllocationOfCVToIDNumbers> getCountryRestrictionsForTheAllocationOfCVToIDNumbers() {
        return countryRestrictionsForTheAllocationOfCVToIDNumbers;
    }

    public void setCountryRestrictionsForTheAllocationOfCVToIDNumbers(List<CountryRestrictionsForTheAllocationOfCVToIDNumbers> countryRestrictionsForTheAllocationOfCVToIDNumbers) {
        this.countryRestrictionsForTheAllocationOfCVToIDNumbers = countryRestrictionsForTheAllocationOfCVToIDNumbers;
    }

    public List<AllocationOfCVToCVIDNumbers> getAllocationOfCVToCVIDNumbers() {
        return allocationOfCVToCVIDNumbers;
    }

    public void setAllocationOfCVToCVIDNumbers(List<AllocationOfCVToCVIDNumbers> allocationOfCVToCVIDNumbers) {
        this.allocationOfCVToCVIDNumbers = allocationOfCVToCVIDNumbers;
    }

    public List<CVTypesAndEngineAllocation> getCvTypesAndEngineAllocations() {
        return cvTypesAndEngineAllocations;
    }

    public void setCvTypesAndEngineAllocations(List<CVTypesAndEngineAllocation> cvTypesAndEngineAllocations) {
        this.cvTypesAndEngineAllocations = cvTypesAndEngineAllocations;
    }

    public List<CVSecondaryTypesCountryRestrictions> getCvSecondaryTypesCountryRestrictions() {
        return cvSecondaryTypesCountryRestrictions;
    }

    public void setCvSecondaryTypesCountryRestrictions(List<CVSecondaryTypesCountryRestrictions> cvSecondaryTypesCountryRestrictions) {
        this.cvSecondaryTypesCountryRestrictions = cvSecondaryTypesCountryRestrictions;
    }

    public CountryAndLanguageDependentDescriptions getCountryAndLanguageDependentDescriptions() {
        return countryAndLanguageDependentDescriptions;
    }

    public void setCountryAndLanguageDependentDescriptions(CountryAndLanguageDependentDescriptions countryAndLanguageDependentDescriptions) {
        this.countryAndLanguageDependentDescriptions = countryAndLanguageDependentDescriptions;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public VehicleModelSeries getVehicleModelSeries() {
        return vehicleModelSeries;
    }

    public void setVehicleModelSeries(VehicleModelSeries vehicleModelSeries) {
        this.vehicleModelSeries = vehicleModelSeries;
    }

    public List<AllocationOfAxleTypesToCVTypes> getAllocationOfAxleTypesToCVTypes() {
        return allocationOfAxleTypesToCVTypes;
    }

    public void setAllocationOfAxleTypesToCVTypes(List<AllocationOfAxleTypesToCVTypes> allocationOfAxleTypesToCVTypes) {
        this.allocationOfAxleTypesToCVTypes = allocationOfAxleTypesToCVTypes;
    }

    public List<CVWheelbase> getCvWheelbases() {
        return cvWheelbases;
    }

    public void setCvWheelbases(List<CVWheelbase> cvWheelbases) {
        this.cvWheelbases = cvWheelbases;
    }

    public List<AllocationOfATransmissionToACV> getAllocationOfATransmissionToACVS() {
        return allocationOfATransmissionToACVS;
    }

    public void setAllocationOfATransmissionToACVS(List<AllocationOfATransmissionToACV> allocationOfATransmissionToACVS) {
        this.allocationOfATransmissionToACVS = allocationOfATransmissionToACVS;
    }

    public List<CVSuspension> getCvSuspensions() {
        return cvSuspensions;
    }

    public void setCvSuspensions(List<CVSuspension> cvSuspensions) {
        this.cvSuspensions = cvSuspensions;
    }

    public List<CVTyres> getCvTyres() {
        return cvTyres;
    }

    public void setCvTyres(List<CVTyres> cvTyres) {
        this.cvTyres = cvTyres;
    }

    public List<CVChassis> getCvChassis() {
        return cvChassis;
    }

    public void setCvChassis(List<CVChassis> cvChassis) {
        this.cvChassis = cvChassis;
    }

    public List<AllocationOfDriverCabsToCVs> getAllocationOfDriverCabsToCVs() {
        return allocationOfDriverCabsToCVs;
    }

    public void setAllocationOfDriverCabsToCVs(List<AllocationOfDriverCabsToCVs> allocationOfDriverCabsToCVs) {
        this.allocationOfDriverCabsToCVs = allocationOfDriverCabsToCVs;
    }

    public List<CVSecondaryTypes> getCvSecondaryTypes() {
        return cvSecondaryTypes;
    }

    public void setCvSecondaryTypes(List<CVSecondaryTypes> cvSecondaryTypes) {
        this.cvSecondaryTypes = cvSecondaryTypes;
    }

    public List<CVCountrySpecificDeviations> getCvCountrySpecificDeviations() {
        return cvCountrySpecificDeviations;
    }

    public void setCvCountrySpecificDeviations(List<CVCountrySpecificDeviations> cvCountrySpecificDeviations) {
        this.cvCountrySpecificDeviations = cvCountrySpecificDeviations;
    }

    public int getnTypeNr() {
        return nTypeNr;
    }

    public void setnTypeNr(int nTypeNr) {
        this.nTypeNr = nTypeNr;
    }

    public int getDelet() {
        return delet;
    }

    public void setDelet(int delet) {
        this.delet = delet;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getLbezNr() {
        return lbezNr;
    }

    public void setLbezNr(int lbezNr) {
        this.lbezNr = lbezNr;
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

    public int getBauart() {
        return bauart;
    }

    public void setBauart(int bauart) {
        this.bauart = bauart;
    }

    public int getMotart() {
        return motart;
    }

    public void setMotart(int motart) {
        this.motart = motart;
    }

    public int getKwvon() {
        return kwvon;
    }

    public void setKwvon(int kwvon) {
        this.kwvon = kwvon;
    }

    public int getKwbis() {
        return kwbis;
    }

    public void setKwbis(int kwbis) {
        this.kwbis = kwbis;
    }

    public int getPsvon() {
        return psvon;
    }

    public void setPsvon(int psvon) {
        this.psvon = psvon;
    }

    public int getPsbis() {
        return psbis;
    }

    public void setPsbis(int psbis) {
        this.psbis = psbis;
    }

    public int getCcmTech() {
        return ccmTech;
    }

    public void setCcmTech(int ccmTech) {
        this.ccmTech = ccmTech;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getAchsconfig() {
        return achsconfig;
    }

    public void setAchsconfig(int achsconfig) {
        this.achsconfig = achsconfig;
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
