package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleToGenericArticleAllocationId;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="211_article_to_generic_article_allocation")
public class ArticleToGenericArticleAllocation {

    @EmbeddedId
    ArticleToGenericArticleAllocationId id;
    int dLNr;
    int sA;
    int loschFlag;
    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr",
                referencedColumnName = "artNr")
    private ArticleTable articleTable;
    @MapsId("genArtNr")
    @ManyToOne
    @JoinColumn(name = "genArtNr",
                referencedColumnName = "genArtNr")
    private GenericArticles genericArticles;

    public ArticleToGenericArticleAllocation() {
    }

    public ArticleToGenericArticleAllocation(Map<String,String> datas) {
        this.id = new ArticleToGenericArticleAllocationId(datas.get("ArtNr"),Integer.valueOf(datas.get("GenArtNr")));
        this.dLNr = Integer.valueOf(datas.get("DLNr"));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.loschFlag = 0;
    }

    public ArticleTable getArticleTable() {
        return articleTable;
    }

    public void setArticleTable(ArticleTable articleTable) {
        this.articleTable = articleTable;
    }

    public GenericArticles getGenericArticles() {
        return genericArticles;
    }

    public void setGenericArticles(GenericArticles genericArticles) {
        this.genericArticles = genericArticles;
    }

    public ArticleToGenericArticleAllocationId getId() {
        return id;
    }

    public void setId(ArticleToGenericArticleAllocationId id) {
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


    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
