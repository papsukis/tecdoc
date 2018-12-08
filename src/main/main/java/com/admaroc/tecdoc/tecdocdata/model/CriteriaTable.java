package com.admaroc.tecdoc.tecdocdata.model;

import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CriteriaTableId;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="050_criteria_table")
public class CriteriaTable {


    @EmbeddedId
    CriteriaTableId id;
    int sA;
    int bezNr;
    String typ;
    int maxLen;
    int okArtikel;
    int tabNr;
    int oKNKW;
    int oKPKW;
    int oKMotor;
    int oKFahrerhaus;
    int stucklistenCriterion;
    int zubehorCriterion;
    int mehrfachVerwendung;
    int bezNrAbk;
    int bezNrEinheit;
    int intervallCriterion;
    int nachfolgeCriterion;
    int deletion;
    int oKAchse;
    int loschFlag;
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
    @MapsId("KeyTablesEntriesId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "tabNr",
                    referencedColumnName = "tabNr"),
            @JoinColumn(
                    name = "cle",
                    referencedColumnName = "cle")})
    private KeyTablesEntries keyTablesEntries;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "criteriaTable")
    private List<LinkageAttributes> linkageAttributes;
    @OneToMany(fetch=FetchType.LAZY,
               cascade=CascadeType.ALL,
               mappedBy = "criteriaTable")
    private List<AccessoryListsCriteria> accessoryListsCriteria;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "criteriaTable")
    private List<AllocationOfCriteriaToTheSearchStructure> allocationOfCriteriaToTheSearchStructures;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "criteriaTable")
    private List<ArticleCriteria> articleCriteria;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "criteriaTable")
    private List<ArticleLinkage> articleLinkages;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "criteriaTable")
    private List<MandatoryCriteria> mandatoryCriteria;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "criteriaTable")
    private List<PartsListCritera> partsListCriteras;
    @OneToMany(fetch=FetchType.LAZY,
            cascade=CascadeType.ALL,
            mappedBy = "criteriaTable")
    private List<ProposedCriteria> proposedCriteria;

    public CriteriaTable() {
    }

    public CriteriaTable(Map<String,String> datas) {
        this.id = new CriteriaTableId(Integer.valueOf(datas.get("DLNr")),Integer.valueOf(datas.get("KritNr")));
        this.sA = Integer.valueOf(datas.get("SA"));
        this.bezNr = Integer.valueOf(datas.get("BezNr"));
        this.typ = datas.get("Typ");
        this.maxLen = Integer.valueOf(datas.get("MaxLen"));
        this.okArtikel = Integer.valueOf(datas.get("OK-Artikel"));
        this.tabNr = Integer.valueOf(datas.get("TabNr"));
        this.oKNKW = Integer.valueOf(datas.get("OK-NKW"));
        this.oKPKW = Integer.valueOf(datas.get("OK-PKW"));
        this.oKMotor = Integer.valueOf(datas.get("OK-Motor"));
        this.oKFahrerhaus = Integer.valueOf(datas.get("OK-Fahrerhaus "));
        this.stucklistenCriterion = Integer.valueOf(datas.get("Stücklisten-Criterion"));
        this.zubehorCriterion = Integer.valueOf(datas.get("Zubehör-Criterion"));
        this.mehrfachVerwendung = Integer.valueOf(datas.get("Mehrfachverwendung"));
        this.bezNrAbk = Integer.valueOf(datas.get("BezNrAbk"));
        this.bezNrEinheit = Integer.valueOf(datas.get("BezNrEinheit"));
        this.intervallCriterion = Integer.valueOf(datas.get("IntervallCriterion"));
        this.nachfolgeCriterion = Integer.valueOf(datas.get("Nachfolge-Criterion"));
        this.deletion = Integer.valueOf(datas.get("Delete"));
        this.oKAchse = Integer.valueOf(datas.get("OK-Achse"));
        this.loschFlag = 0;
    }

    public List<AccessoryListsCriteria> getAccessoryListsCriteria() {
        return accessoryListsCriteria;
    }

    public List<LinkageAttributes> getLinkageAttributes() {
        return linkageAttributes;
    }

    public void setLinkageAttributes(List<LinkageAttributes> linkageAttributes) {
        this.linkageAttributes = linkageAttributes;
    }

    public void setAccessoryListsCriteria(List<AccessoryListsCriteria> accessoryListsCriteria) {
        this.accessoryListsCriteria = accessoryListsCriteria;
    }

    public List<AllocationOfCriteriaToTheSearchStructure> getAllocationOfCriteriaToTheSearchStructures() {
        return allocationOfCriteriaToTheSearchStructures;
    }

    public void setAllocationOfCriteriaToTheSearchStructures(List<AllocationOfCriteriaToTheSearchStructure> allocationOfCriteriaToTheSearchStructures) {
        this.allocationOfCriteriaToTheSearchStructures = allocationOfCriteriaToTheSearchStructures;
    }

    public List<ArticleCriteria> getArticleCriteria() {
        return articleCriteria;
    }

    public void setArticleCriteria(List<ArticleCriteria> articleCriteria) {
        this.articleCriteria = articleCriteria;
    }

    public List<ArticleLinkage> getArticleLinkages() {
        return articleLinkages;
    }

    public void setArticleLinkages(List<ArticleLinkage> articleLinkages) {
        this.articleLinkages = articleLinkages;
    }

    public List<MandatoryCriteria> getMandatoryCriteria() {
        return mandatoryCriteria;
    }

    public void setMandatoryCriteria(List<MandatoryCriteria> mandatoryCriteria) {
        this.mandatoryCriteria = mandatoryCriteria;
    }

    public List<PartsListCritera> getPartsListCriteras() {
        return partsListCriteras;
    }

    public void setPartsListCriteras(List<PartsListCritera> partsListCriteras) {
        this.partsListCriteras = partsListCriteras;
    }

    public List<ProposedCriteria> getProposedCriteria() {
        return proposedCriteria;
    }

    public void setProposedCriteria(List<ProposedCriteria> proposedCriteria) {
        this.proposedCriteria = proposedCriteria;
    }

    public LanguageDescriptions getLanguageDescriptions() {
        return languageDescriptions;
    }

    public void setLanguageDescriptions(LanguageDescriptions languageDescriptions) {
        this.languageDescriptions = languageDescriptions;
    }

    public KeyTablesEntries getKeyTablesEntries() {
        return keyTablesEntries;
    }

    public void setKeyTablesEntries(KeyTablesEntries keyTablesEntries) {
        this.keyTablesEntries = keyTablesEntries;
    }

    public CriteriaTableId getId() {
        return id;
    }

    public void setId(CriteriaTableId id) {
        this.id = id;
    }

    public int getDeletion() {
        return deletion;
    }

    public void setDeletion(int deletion) {
        this.deletion = deletion;
    }

    public int getsA() {
        return sA;
    }

    public void setsA(int sA) {
        this.sA = sA;
    }

    public int getBezNr() {
        return bezNr;
    }

    public void setBezNr(int bezNr) {
        this.bezNr = bezNr;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(int maxLen) {
        this.maxLen = maxLen;
    }

    public int getOkArtikel() {
        return okArtikel;
    }

    public void setOkArtikel(int okArtikel) {
        this.okArtikel = okArtikel;
    }

    public int getTabNr() {
        return tabNr;
    }

    public void setTabNr(int tabNr) {
        this.tabNr = tabNr;
    }

    public int getoKNKW() {
        return oKNKW;
    }

    public void setoKNKW(int oKNKW) {
        this.oKNKW = oKNKW;
    }

    public int getoKPKW() {
        return oKPKW;
    }

    public void setoKPKW(int oKPKW) {
        this.oKPKW = oKPKW;
    }

    public int getoKMotor() {
        return oKMotor;
    }

    public void setoKMotor(int oKMotor) {
        this.oKMotor = oKMotor;
    }

    public int getoKFahrerhaus() {
        return oKFahrerhaus;
    }

    public void setoKFahrerhaus(int oKFahrerhaus) {
        this.oKFahrerhaus = oKFahrerhaus;
    }

    public int getStucklistenCriterion() {
        return stucklistenCriterion;
    }

    public void setStucklistenCriterion(int stucklistenCriterion) {
        this.stucklistenCriterion = stucklistenCriterion;
    }

    public int getZubehorCriterion() {
        return zubehorCriterion;
    }

    public void setZubehorCriterion(int zubehorCriterion) {
        this.zubehorCriterion = zubehorCriterion;
    }

    public int getMehrfachVerwendung() {
        return mehrfachVerwendung;
    }

    public void setMehrfachVerwendung(int mehrfachVerwendung) {
        this.mehrfachVerwendung = mehrfachVerwendung;
    }

    public int getBezNrAbk() {
        return bezNrAbk;
    }

    public void setBezNrAbk(int bezNrAbk) {
        this.bezNrAbk = bezNrAbk;
    }

    public int getBezNrEinheit() {
        return bezNrEinheit;
    }

    public void setBezNrEinheit(int bezNrEinheit) {
        this.bezNrEinheit = bezNrEinheit;
    }

    public int getIntervallCriterion() {
        return intervallCriterion;
    }

    public void setIntervallCriterion(int intervallCriterion) {
        this.intervallCriterion = intervallCriterion;
    }

    public int getNachfolgeCriterion() {
        return nachfolgeCriterion;
    }

    public void setNachfolgeCriterion(int nachfolgeCriterion) {
        this.nachfolgeCriterion = nachfolgeCriterion;
    }

    public int getDelete() {
        return deletion;
    }

    public void setDelete(int delete) {
        this.deletion = delete;
    }

    public int getoKAchse() {
        return oKAchse;
    }

    public void setoKAchse(int oKAchse) {
        this.oKAchse = oKAchse;
    }

    public int getLoschFlag() {
        return loschFlag;
    }

    public void setLoschFlag(int loschFlag) {
        this.loschFlag = loschFlag;
    }
}
