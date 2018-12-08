package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="217_allocation_of_pl_coordinates_to_csg")
public class AllocationOfPartsListCoordinatesToContextSensitiveGraphics {

    @EmbeddedId
    AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId id;
    int dLNr;
    int sA;
    int koordinatenNr;
    int loschFlag;

    @MapsId("artNr")
    @ManyToOne
    @JoinColumn(name = "artNr",
                referencedColumnName = "artNr")
    private ArticleTable articleTable;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "allocationOfPartsListCoordinatesToContextSensitiveGraphics")
    private List<PartsLists> partsLists;
    @MapsId("sprachNr")
    @ManyToOne
    @JoinColumn(name = "sprachNr",
                referencedColumnName = "sprachNr")
    private Language language;
    @MapsId("GraphicsDocumentsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "bildNr",
                    referencedColumnName = "bildNr"),
            @JoinColumn(
                    name = "dokumentenArt",
                    referencedColumnName = "dokumentenArt"),
            @JoinColumn(
                    name="sprachNr",
                    referencedColumnName = "sprachNr")})
    private GraphicsDocuments graphicsDocuments;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "allocationOfPartsListCoordinatesToContextSensitiveGraphics")
    private List<DocumentTypes> documentTypes;

    public AllocationOfPartsListCoordinatesToContextSensitiveGraphics() {
    }

    public AllocationOfPartsListCoordinatesToContextSensitiveGraphics(Map<String,String> datas) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.koordinatenNr = koordinatenNr;
        this.loschFlag = loschFlag;
    }

    public ArticleTable getArticleTable() {
        return articleTable;
    }

    public void setArticleTable(ArticleTable articleTable) {
        this.articleTable = articleTable;
    }

    public List<PartsLists> getPartsLists() {
        return partsLists;
    }

    public void setPartsLists(List<PartsLists> partsLists) {
        this.partsLists = partsLists;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public GraphicsDocuments getGraphicsDocuments() {
        return graphicsDocuments;
    }

    public void setGraphicsDocuments(GraphicsDocuments graphicsDocuments) {
        this.graphicsDocuments = graphicsDocuments;
    }

    public List<DocumentTypes> getDocumentTypes() {
        return documentTypes;
    }

    public void setDocumentTypes(List<DocumentTypes> documentTypes) {
        this.documentTypes = documentTypes;
    }

    public AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId getId() {
        return id;
    }

    public void setId(AllocationOfPartsListCoordinatesToContextSensitiveGraphicsId id) {
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


    public int getKoordinatenNr() {
        return koordinatenNr;
    }

    public void setKoordinatenNr(int koordinatenNr) {
        this.koordinatenNr = koordinatenNr;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
