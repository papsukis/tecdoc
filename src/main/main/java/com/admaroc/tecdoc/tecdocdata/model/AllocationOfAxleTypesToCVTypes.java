package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfAxleTypesToCVTypesId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="164_allocation_of_axle_types_to_cv_types")
public class AllocationOfAxleTypesToCVTypes {

    @EmbeddedId
    AllocationOfAxleTypesToCVTypesId id;
    int dLNr;
    int sA;
    int sortNr;
    int achsPos;
    int bjvon;
    int bjbis;
    String lKZ;
    int exclude;
    int loschFlag;

    @MapsId("KeyTablesEntriesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;
    @MapsId("nTypeNr")
    @ManyToOne
    @JoinColumn(name = "nTypeNr",
                referencedColumnName = "nTypeNr")
    private CVTypes cvTypes;
    @MapsId("aTypNr")
    @ManyToOne
    @JoinColumn(name = "aTypNr",
                referencedColumnName = "aTypNr")
    private Axle axle;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;

    public AllocationOfAxleTypesToCVTypes() {
    }

    public AllocationOfAxleTypesToCVTypes(Map<String,String> datas) {
        this.id = new AllocationOfAxleTypesToCVTypesId( Integer.valueOf(datas.get("NTypNr")), Integer.valueOf(datas.get("LfdNr")), Integer.valueOf(datas.get("AtypNr")));
        this.dLNr =  Integer.valueOf(datas.get("DLNr"));
        this.sA =  Integer.valueOf(datas.get("SA"));
        this.sortNr =  Integer.valueOf(datas.get("SortNr"));
        this.achsPos =  Integer.valueOf(datas.get("AchsPos"));
        this.bjvon =  Integer.valueOf(datas.get("BJvon"));
        this.bjbis =  Integer.valueOf(datas.get("BJbis"));
        this.lKZ =  datas.get("LKZ");
        this.exclude =  Integer.valueOf(datas.get("Exclude"));
        this.loschFlag = loschFlag;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public CVTypes getCvTypes() {
        return cvTypes;
    }

    public void setCvTypes(CVTypes cvTypes) {
        this.cvTypes = cvTypes;
    }

    public Axle getAxle() {
        return axle;
    }

    public void setAxle(Axle axle) {
        this.axle = axle;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public AllocationOfAxleTypesToCVTypesId getId() {
        return id;
    }

    public void setId(AllocationOfAxleTypesToCVTypesId id) {
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

    public int getAchsPos() {
        return achsPos;
    }

    public void setAchsPos(int achsPos) {
        this.achsPos = achsPos;
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

    public String getlKZ() {
        return lKZ;
    }

    public void setlKZ(String lKZ) {
        this.lKZ = lKZ;
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
