package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AllocationOfCriteriaValuesToGAMandatoryCriteriaId implements Serializable {

    @Column(name="genArtNr")
    int genArtNr;
    @Column(name="lfdNr")
    int lfdNr;
    @Column(name="kritWert")
    int kritWert;

    public AllocationOfCriteriaValuesToGAMandatoryCriteriaId() {
    }

    public AllocationOfCriteriaValuesToGAMandatoryCriteriaId(int genArtNr, int lfdNr, int kritWert) {
        this.genArtNr = genArtNr;
        this.lfdNr = lfdNr;
        this.kritWert = kritWert;
    }

    public int getGenArtNr() {
        return genArtNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    public int getKritWert() {
        return kritWert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationOfCriteriaValuesToGAMandatoryCriteriaId that = (AllocationOfCriteriaValuesToGAMandatoryCriteriaId) o;
        return getGenArtNr() == that.getGenArtNr() &&
                getLfdNr() == that.getLfdNr() &&
                getKritWert() == that.getKritWert();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getGenArtNr(), getLfdNr(), getKritWert());
    }
}
