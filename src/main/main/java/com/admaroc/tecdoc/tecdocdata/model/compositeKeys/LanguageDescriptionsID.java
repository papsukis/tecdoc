package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LanguageDescriptionsID implements Serializable {

    @Column(name="bezNr")
    int bezNr;
    @Column(name="sprachNr")
    int sprachNr;

    public LanguageDescriptionsID() {
    }

    public LanguageDescriptionsID(int bezNr, int sprachNr) {
        this.bezNr = bezNr;
        this.sprachNr = sprachNr;
    }

    public int getBezNr() {
        return bezNr;
    }

    public int getSprachNr() {
        return sprachNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageDescriptionsID that = (LanguageDescriptionsID) o;
        return getBezNr() == that.getBezNr() &&
                getSprachNr() == that.getSprachNr();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBezNr(), getSprachNr());
    }
}
