package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="051_key_tables")
public class KeyTables {

    @Id
    int tabNr;
    int dLNr;
    int sA;
    int bezNr;
    String tabTyp;
    int delet;
    int loschFlag;

    @OneToMany(
            fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "keyTables")
    private List<KeyTablesEntries >keyTablesEntries;
    @MapsId("LanguageDescriptionsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "bezNr",
                    referencedColumnName = "bezNr"),
            @JoinColumn(
                    name = "sprachNr",
                    referencedColumnName = "sprachNr")})
    private LanguageDescriptions languageDescriptions;

    public KeyTables() {
    }

    public KeyTables(Map<String,String> datas) {
        this.tabNr = Integer.valueOf(datas.get("TabNr"));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.bezNr = Integer.valueOf(datas.get("BezNr"));
        this.tabTyp = datas.get("TabTyp");
        this.delet = Integer.valueOf(datas.get("Delete"));
        this.loschFlag = 0;
    }

    public List<KeyTablesEntries> getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(List<KeyTablesEntries> keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public LanguageDescriptions getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(LanguageDescriptions languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
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

    public int getTabNr() {
        return tabNr;
    }

    public void setTabNr(int tabNr) {
        this.tabNr = tabNr;
    }

    public int getBezNr() {
        return bezNr;
    }

    public void setBezNr(int bezNr) {
        this.bezNr = bezNr;
    }

    public String getTabTyp() {
        return tabTyp;
    }

    public void setTabTyp(String tabTyp) {
        this.tabTyp = tabTyp;
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
