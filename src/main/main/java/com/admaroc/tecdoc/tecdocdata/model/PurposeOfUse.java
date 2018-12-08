package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="325_purpose_of_use")
public class PurposeOfUse {

    @Id
    int verwNr;
    int dLNr;
    int sA;
    int bezNr;
    int loschFlag;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "purposeOfUse")
    private List<GenericArticles> genericArticles;
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

    public PurposeOfUse() {
    }

    public PurposeOfUse(Map<String,String> datas) {
        this.verwNr = verwNr;
        this.dLNr = dLNr;
        this.sA = sA;
        this.bezNr = bezNr;
        this.loschFlag = loschFlag;
    }

    public List<GenericArticles> getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(List<GenericArticles> genericArticles) {
        this.genericArticles = genericArticles;
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

    public int getVerwNr() {
        return verwNr;
    }

    public void setVerwNr(int verwNr) {
        this.verwNr = verwNr;
    }

    public int getBezNr() {
        return bezNr;
    }

    public void setBezNr(int bezNr) {
        this.bezNr = bezNr;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
