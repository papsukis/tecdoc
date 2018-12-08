package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.DataSupplierMainAddressId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="040_data_supplier_main_address")
public class DataSupplierMainAddress {

@EmbeddedId
    DataSupplierMainAddressId id;
    int sA;
    String lKZ;
    String bez;
    String bez2;
    String strabe;
    String strasse;
    String postfach;
    String pLZKZ;
    String pLZOrt;
    String pLZPf;
    String pLZGr;
    String ort;
    String ort2;
    String telefon;
    String fax;
    String email;
    String web;
    int loschFlag;


    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})

    private KeyTablesEntries keyTablesEntries;

    public DataSupplierMainAddress() {
    }

    public DataSupplierMainAddress(Map<String,String> datas) {
        this.id = new DataSupplierMainAddressId(Integer.valueOf(datas.get("DLNr")),Integer.valueOf(datas.get("Adressart")));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.lKZ = datas.get("LKZ");
        this.bez = datas.get("Bez");
        this.bez2 = datas.get("Bez2");
        this.strabe = datas.get("Straße");
        this.strasse = datas.get("Strasse2");
        this.postfach = datas.get("Postfach");
        this.pLZKZ = datas.get("PLZLKZ");
        this.pLZOrt = datas.get("PLZOrt");
        this.pLZPf = datas.get("PLZPf");
        this.pLZGr = datas.get("PLZGr");
        this.ort = datas.get("Ort");
        this.ort2 = datas.get("Ort2");
        this.telefon = datas.get("Telefon");
        this.fax = datas.get("Fax");
        this.email = datas.get("Email");
        this.web = datas.get("Web");
        this.loschFlag = 0;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public DataSupplierMainAddressId getId() {
        return id;
    }

    public void setId(DataSupplierMainAddressId id) {
        this.id = id;
    }

    public int getsA() {
        return sA;
    }

    public void setsA(int sA) {
        this.sA = sA;
    }


    public String getlKZ() {
        return lKZ;
    }

    public void setlKZ(String lKZ) {
        this.lKZ = lKZ;
    }

    public String getBez() {
        return bez;
    }

    public void setBez(String bez) {
        this.bez = bez;
    }

    public String getBez2() {
        return bez2;
    }

    public void setBez2(String bez2) {
        this.bez2 = bez2;
    }

    public String getStrabe() {
        return strabe;
    }

    public void setStrabe(String strabe) {
        this.strabe = strabe;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPostfach() {
        return postfach;
    }

    public void setPostfach(String postfach) {
        this.postfach = postfach;
    }

    public String getpLZKZ() {
        return pLZKZ;
    }

    public void setpLZKZ(String pLZKZ) {
        this.pLZKZ = pLZKZ;
    }

    public String getpLZOrt() {
        return pLZOrt;
    }

    public void setpLZOrt(String pLZOrt) {
        this.pLZOrt = pLZOrt;
    }

    public String getpLZPf() {
        return pLZPf;
    }

    public void setpLZPf(String pLZPf) {
        this.pLZPf = pLZPf;
    }

    public String getpLZGr() {
        return pLZGr;
    }

    public void setpLZGr(String pLZGr) {
        this.pLZGr = pLZGr;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getOrt2() {
        return ort2;
    }

    public void setOrt2(String ort2) {
        this.ort2 = ort2;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
