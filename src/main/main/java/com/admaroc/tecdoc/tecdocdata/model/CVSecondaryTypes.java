package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVSecondaryTypesId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="535_cv_secondary_types")
public class CVSecondaryTypes {

    @EmbeddedId
    CVSecondaryTypesId id;
    int dLNr;
    int sA;
    int sortNr;
    String bez;
    int bjvon;
    int bjbis;
    int loschFlag;

    @MapsId("nTypeNr")
    @ManyToOne
    @JoinColumn(name = "nTypeNr",
                referencedColumnName = "nTypeNr")
    private CVTypes cvTypes;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "cvSecondaryTypes")
    private List<CVSecondaryTypesCountryRestrictions> cvSecondaryTypesCountryRestrictions;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<CVWheelbase> cvWheelbases;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<CVSuspension> cvSuspensions;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<CVTyres> cvTyres;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<CVChassis> cvChasses;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<AllocationOfDriverCabsToCVs> driverCabsToCVs;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<CVTypesVoltages> cvTypesVoltages;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<CountryRestrictionsForTheAllocationOfCVToIDNumbers> countryRestrictionsForTheAllocationOfCVToIDNumbers;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<AllocationOfCVToCVIDNumbers> allocationOfCVToCVIDNumbers;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<CVTypesAndEngineAllocation> cvTypesAndEngineAllocations;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvSecondaryTypes")
    private List<AllocationOfATransmissionToACV> transmissionToACVS;

    public CVSecondaryTypes() {
    }

    public CVSecondaryTypes(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.sortNr = sortNr;
        this.bez = bez;
        this.bjvon = bjvon;
        this.bjbis = bjbis;
        this.loschFlag = loschFlag;
    }

    public List<CVWheelbase> getCvWheelbases() {
        return cvWheelbases;
    }

    public void setCvWheelbases(List<CVWheelbase> cvWheelbases) {
        this.cvWheelbases = cvWheelbases;
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

    public List<CVChassis> getCvChasses() {
        return cvChasses;
    }

    public void setCvChasses(List<CVChassis> cvChasses) {
        this.cvChasses = cvChasses;
    }

    public List<AllocationOfDriverCabsToCVs> getDriverCabsToCVs() {
        return driverCabsToCVs;
    }

    public void setDriverCabsToCVs(List<AllocationOfDriverCabsToCVs> driverCabsToCVs) {
        this.driverCabsToCVs = driverCabsToCVs;
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

    public List<AllocationOfATransmissionToACV> getTransmissionToACVS() {
        return transmissionToACVS;
    }

    public void setTransmissionToACVS(List<AllocationOfATransmissionToACV> transmissionToACVS) {
        this.transmissionToACVS = transmissionToACVS;
    }

    public CVTypes getCvTypes() {
        return cvTypes;
    }

    public void setCvTypes(CVTypes cvTypes) {
        this.cvTypes = cvTypes;
    }

    public List<CVSecondaryTypesCountryRestrictions> getCvSecondaryTypesCountryRestrictions() {
        return cvSecondaryTypesCountryRestrictions;
    }

    public void setCvSecondaryTypesCountryRestrictions(List<CVSecondaryTypesCountryRestrictions> cvSecondaryTypesCountryRestrictions) {
        this.cvSecondaryTypesCountryRestrictions = cvSecondaryTypesCountryRestrictions;
    }

    public CVSecondaryTypesId getId() {
        return id;
    }

    public void setId(CVSecondaryTypesId id) {
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

    public String getBez() {
        return bez;
    }

    public void setBez(String bez) {
        this.bez = bez;
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

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
