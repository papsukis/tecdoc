package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TextModulesId implements Serializable {

    @Column(name="tBSNr")
    String tBSNr;
    @Column(name="sprachNr")
    int sprachNr;
    @Column(name="lfdNr")
    int lfdNr;

    public TextModulesId() {
    }

    public TextModulesId(String tBSNr, int sprachNr, int lfdNr) {
        this.tBSNr = tBSNr;
        this.sprachNr = sprachNr;
        this.lfdNr = lfdNr;
    }

    public String gettBSNr() {
        return tBSNr;
    }

    public int getSprachNr() {
        return sprachNr;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextModulesId that = (TextModulesId) o;
        return getSprachNr() == that.getSprachNr() &&
                getLfdNr() == that.getLfdNr() &&
                Objects.equals(gettBSNr(), that.gettBSNr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(gettBSNr(), getSprachNr(), getLfdNr());
    }
}
