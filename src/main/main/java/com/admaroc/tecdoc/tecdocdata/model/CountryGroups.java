package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountryGroupsId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="013_country_groups")
public class CountryGroups {

    @EmbeddedId
    CountryGroupsId id;
    int dlNR;
    int sA;
    int loschFlag;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;

    public CountryGroups() {
    }

    public CountryGroups(Map<String,String> datas) {
        this.id = new CountryGroupsId(datas.get("LKZGrp"),datas.get("LKZ"));
        this.dlNR = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.loschFlag = 0;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public CountryGroupsId getId() {
        return id;
    }

    public void setId(CountryGroupsId id) {
        this.id = id;
    }

    public int getDlNR() {
        return dlNR;
    }

    public void setDlNR(int dlNR) {
        this.dlNR = dlNR;
    }

    public int getsA() {
        return sA;
    }

    public void setsA(int sA) {
        this.sA = sA;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
