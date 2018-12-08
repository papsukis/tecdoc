package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ContextSensitiveGraphicsId;

import javax.persistence.*;

@Entity
@Table(name="233_context_sensitive_graphics")
public class ContextSensitiveGraphics {

    @EmbeddedId
    ContextSensitiveGraphicsId id;
    int dLNr;
    int sA;
    int sprachNr;
    int typ;
    int x1;
    int y1;
    int x2;
    int y2;
    int loschFlag;

    @MapsId("GraphicsDocumentsId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "bildnr",
                    referencedColumnName = "bildNr"),
            @JoinColumn(
                    name = "dokumentenart",
                    referencedColumnName = "dokumentenArt"),
            @JoinColumn(
                    name = "sprachnr",
                    referencedColumnName = "sprachNr")
    })
    private GraphicsDocuments graphicsDocuments;
    @MapsId("dokumentenArt")
    @ManyToOne
    @JoinColumn(name = "dokumentenArt",
                referencedColumnName = "dokumentenArt")
    private DocumentTypes documentTypes;
    @MapsId("sprachNr")
    @ManyToOne
    @JoinColumn(name = "sprachNr",
                referencedColumnName = "sprachNr")
    private Language language;

    public ContextSensitiveGraphics() {
    }

    public ContextSensitiveGraphics(ContextSensitiveGraphicsId id, int dLNr, int sA, int sprachNr, int typ, int x1, int y1, int x2, int y2, int loschFlag) {
        this.id = id;
        this.dLNr = dLNr;
        this.sA = sA;
        this.sprachNr = sprachNr;
        this.typ = typ;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.loschFlag = loschFlag;
    }

    public GraphicsDocuments getGraphicsDocuments() {
        return graphicsDocuments;
    }

    public void setGraphicsDocuments(GraphicsDocuments graphicsDocuments) {
        this.graphicsDocuments = graphicsDocuments;
    }

    public DocumentTypes getDocumentTypes() {
        return documentTypes;
    }

    public void setDocumentTypes(DocumentTypes documentTypes) {
        this.documentTypes = documentTypes;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public ContextSensitiveGraphicsId getId() {
        return id;
    }

    public void setId(ContextSensitiveGraphicsId id) {
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


    public int getSprachNr() {
        return sprachNr;
    }

    public void setSprachNr(int sprachNr) {
        this.sprachNr = sprachNr;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
