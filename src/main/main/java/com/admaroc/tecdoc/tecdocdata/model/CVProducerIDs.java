package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="554_cv_producer_id")
public class CVProducerIDs {

    @Id
    int herlDNr;
    int dLNr;
    int sA;
    int herNr;
    int herID;
    int delet;
    int loschFlag;

    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "cvProducerIDs")
    private List<AllocationOfCVToCVIDNumbers> allocationOfCVToCVIDNumbers;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvProducerIDs")
    private List<CountryRestrictionsForTheAllocationOfCVToIDNumbers> countryRestrictionsForTheAllocationOfCVToIDNumbers;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "cvProducerIDs")
    private List<CVProducerIdsCountryRestrictions> cvProducerIdsCountryRestrictions;


    public CVProducerIDs() {
    }

    public CVProducerIDs(Map<String,String> datas) {
        this.herlDNr = herlDNr;
        this.dLNr = dLNr;
        this.sA = sA;
        this.herNr = herNr;
        this.herID = herID;
        this.delet = delet;
        this.loschFlag = loschFlag;
    }

    public List<AllocationOfCVToCVIDNumbers> getAllocationOfCVToCVIDNumbers() {
        return allocationOfCVToCVIDNumbers;
    }

    public void setAllocationOfCVToCVIDNumbers(List<AllocationOfCVToCVIDNumbers> allocationOfCVToCVIDNumbers) {
        this.allocationOfCVToCVIDNumbers = allocationOfCVToCVIDNumbers;
    }

    public List<CountryRestrictionsForTheAllocationOfCVToIDNumbers> getCountryRestrictionsForTheAllocationOfCVToIDNumbers() {
        return countryRestrictionsForTheAllocationOfCVToIDNumbers;
    }

    public void setCountryRestrictionsForTheAllocationOfCVToIDNumbers(List<CountryRestrictionsForTheAllocationOfCVToIDNumbers> countryRestrictionsForTheAllocationOfCVToIDNumbers) {
        this.countryRestrictionsForTheAllocationOfCVToIDNumbers = countryRestrictionsForTheAllocationOfCVToIDNumbers;
    }

    public List<CVProducerIdsCountryRestrictions> getCvProducerIdsCountryRestrictions() {
        return cvProducerIdsCountryRestrictions;
    }

    public void setCvProducerIdsCountryRestrictions(List<CVProducerIdsCountryRestrictions> cvProducerIdsCountryRestrictions) {
        this.cvProducerIdsCountryRestrictions = cvProducerIdsCountryRestrictions;
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

    public int getHerlDNr() {
        return herlDNr;
    }

    public void setHerlDNr(int herlDNr) {
        this.herlDNr = herlDNr;
    }

    public int getHerNr() {
        return herNr;
    }

    public void setHerNr(int herNr) {
        this.herNr = herNr;
    }

    public int getHerID() {
        return herID;
    }

    public void setHerID(int herID) {
        this.herID = herID;
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
