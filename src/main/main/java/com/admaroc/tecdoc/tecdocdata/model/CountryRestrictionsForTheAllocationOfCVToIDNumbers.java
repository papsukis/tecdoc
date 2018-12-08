package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountryRestrictionsForTheAllocationOfCVToIDNumbersId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="539_country_restrictions_for_the_allocation_of_cv_to_id_numbers")
public class CountryRestrictionsForTheAllocationOfCVToIDNumbers {

    @EmbeddedId
    CountryRestrictionsForTheAllocationOfCVToIDNumbersId id;
    int dLNr;
    int sA;
    int exclude;
    int loschFlag;

    @MapsId("AllocationOfCVToCVIDNumbersId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "nTypNr",
                    referencedColumnName = "nTypNr"),
            @JoinColumn(
                    name = "nTypSubNr",
                    referencedColumnName = "nTypSubNr"),
            @JoinColumn(
                    name = "herlDnr",
                    referencedColumnName = "herlDnr")})
    private AllocationOfCVToCVIDNumbers allocationOfCVToCVIDNumbers;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;
    @MapsId("CVSecondaryTypesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "nTypNr",
                    referencedColumnName = "nTypNr"),
            @JoinColumn(
                    name = "nTypSubNr",
                    referencedColumnName = "nTypSubNr")})
    private CVSecondaryTypes cvSecondaryTypes;
    @MapsId("nTypeNr")
    @ManyToOne
    @JoinColumn(name = "nTypeNr",
                referencedColumnName = "nTypeNr")
    private CVTypes cvTypes;
    @MapsId("herlDNr")
    @ManyToOne
    @JoinColumn(name = "herlDNr",
                referencedColumnName = "herlDNr")
    private CVProducerIDs cvProducerIDs;

    public CountryRestrictionsForTheAllocationOfCVToIDNumbers() {
    }

    public CountryRestrictionsForTheAllocationOfCVToIDNumbers(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.exclude = exclude;
        this.loschFlag = loschFlag;
    }

    public AllocationOfCVToCVIDNumbers getAllocationOfCVToCVIDNumbers() {
        return allocationOfCVToCVIDNumbers;
    }

    public void setAllocationOfCVToCVIDNumbers(AllocationOfCVToCVIDNumbers allocationOfCVToCVIDNumbers) {
        this.allocationOfCVToCVIDNumbers = allocationOfCVToCVIDNumbers;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public CVSecondaryTypes getCvSecondaryTypes() {
        return cvSecondaryTypes;
    }

    public void setCvSecondaryTypes(CVSecondaryTypes cvSecondaryTypes) {
        this.cvSecondaryTypes = cvSecondaryTypes;
    }

    public CVTypes getCvTypes() {
        return cvTypes;
    }

    public void setCvTypes(CVTypes cvTypes) {
        this.cvTypes = cvTypes;
    }

    public CVProducerIDs getCvProducerIDs() {
        return cvProducerIDs;
    }

    public void setCvProducerIDs(CVProducerIDs cvProducerIDs) {
        this.cvProducerIDs = cvProducerIDs;
    }

    public CountryRestrictionsForTheAllocationOfCVToIDNumbersId getId() {
        return id;
    }

    public void setId(CountryRestrictionsForTheAllocationOfCVToIDNumbersId id) {
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


    public int getExclude() {
        return exclude;
    }

    public void setExclude(int exclude) {
        this.exclude = exclude;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
