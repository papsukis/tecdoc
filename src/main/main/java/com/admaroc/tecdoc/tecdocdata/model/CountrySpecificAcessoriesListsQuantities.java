package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;

@Entity
@Table(name="226_country_specific_accessories_lists_quantities")
public class CountrySpecificAcessoriesListsQuantities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String artNr;
    private int dLNr;
    private int sA;
    private int lfdNrZub;
    private int sortNr;
    private int menge;
    private String lKZ;
    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr",
                referencedColumnName = "artNr")
    private ArticleTable articleTable;
    @MapsId("lKZ")
    @ManyToOne
    @JoinColumn(name = "lKZ",
                referencedColumnName = "lKZ")
    private CountryTable countryTable;

    public CountrySpecificAcessoriesListsQuantities() {
    }

    public CountrySpecificAcessoriesListsQuantities(int id, String artNr, int dLNr, int sA, int lfdNrZub, int sortNr, int menge, String lKZ) {
        this.id = id;
        this.artNr = artNr;
        this.dLNr = dLNr;
        this.sA = sA;
        this.lfdNrZub = lfdNrZub;
        this.sortNr = sortNr;
        this.menge = menge;
        this.lKZ = lKZ;
    }

    public ArticleTable getArticleTable() {
        return articleTable;
    }

    public void setArticleTable(ArticleTable articleTable) {
        this.articleTable = articleTable;
    }

    public CountryTable getCountryTable() {
        return countryTable;
    }

    public void setCountryTable(CountryTable countryTable) {
        this.countryTable = countryTable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtNr() {
        return artNr;
    }

    public void setArtNr(String artNr) {
        this.artNr = artNr;
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

    public int getLfdNrZub() {
        return lfdNrZub;
    }

    public void setLfdNrZub(int lfdNrZub) {
        this.lfdNrZub = lfdNrZub;
    }

    public int getSortNr() {
        return sortNr;
    }

    public void setSortNr(int sortNr) {
        this.sortNr = sortNr;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public String getlKZ() {
        return lKZ;
    }

    public void setlKZ(String lKZ) {
        this.lKZ = lKZ;
    }
}
