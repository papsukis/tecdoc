package com.admaroc.tecdoc.tecdocdata.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="324_assembly_groups")
public class AssemblyGroups {

    @Id
    int bgNr;
    int dLNr;
    int sA;
    int bezNr;
    int loschFlag;

    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "assemblyGroups")
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

    public AssemblyGroups() {
    }

    public AssemblyGroups(int bgNr, int dLNr, int sA, int bezNr, int loschFlag) {
        this.bgNr = bgNr;
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

    public int getBgNr() {
        return bgNr;
    }

    public void setBgNr(int bgNr) {
        this.bgNr = bgNr;
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
