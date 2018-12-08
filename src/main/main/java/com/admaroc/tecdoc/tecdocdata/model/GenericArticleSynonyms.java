package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.GenericArticleSynonymsId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="327_generic_article_synonyms")
public class GenericArticleSynonyms {

    @EmbeddedId
    GenericArticleSynonymsId id;
    int dLNr;
    int sA;
    String bez;
    int loschFlag;

    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;
    @MapsId("sprachNr")
    @ManyToOne
    @JoinColumn(name = "sprachNr",
                referencedColumnName = "sprachNr")
    private Language language;

    public GenericArticleSynonyms() {
    }

    public GenericArticleSynonyms(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.bez = bez;
        this.loschFlag = loschFlag;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public GenericArticleSynonymsId getId() {
        return id;
    }

    public void setId(GenericArticleSynonymsId id) {
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


    public String getBez() {
        return bez;
    }

    public void setBez(String bez) {
        this.bez = bez;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
