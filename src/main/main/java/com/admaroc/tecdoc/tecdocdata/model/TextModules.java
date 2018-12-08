package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.TextModulesId;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="035_text_modules")
public class TextModules {

    @EmbeddedId
    TextModulesId id;
    int dLNr;
    int sA;
    int fixed;
    String text;
    int loschFlag;

    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "textModules")
    private List<SearchInformationTexts >searchInformationTexts;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "textModules")
    private List<ArticleInformation> articleInformation;
    @MapsId("sprachNr")
    @ManyToOne
    @JoinColumn(name = "sprachNr",
                referencedColumnName = "sprachNr")
    private Language language;

    public TextModules() {
    }

    public TextModules(Map<String,String> datas) {
        this.id = new TextModulesId(datas.get("TBSNr"),Integer.valueOf(datas.get("SprachNr")), Integer.valueOf(datas.get("LfdNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.fixed = Integer.valueOf(datas.get("Fixed"));
        this.text = datas.get("Text");
        this.loschFlag = 0;
    }

    public List<SearchInformationTexts> getSearchInformationTexts() {
        return searchInformationTexts;
    }

    public void setSearchInformationTexts(List<SearchInformationTexts> searchInformationTexts) {
        this.searchInformationTexts = searchInformationTexts;
    }

    public List<ArticleInformation> getArticleInformation() {
        return articleInformation;
    }

    public void setArticleInformation(List<ArticleInformation> articleInformation) {
        this.articleInformation = articleInformation;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public TextModulesId getId() {
        return id;
    }

    public void setId(TextModulesId id) {
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


    public int getFixed() {
        return fixed;
    }

    public void setFixed(int fixed) {
        this.fixed = fixed;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
