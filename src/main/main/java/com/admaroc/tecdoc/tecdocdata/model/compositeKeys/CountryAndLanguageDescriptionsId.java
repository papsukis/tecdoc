package com.admaroc.tecdoc.tecdocdata.model.compositeKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryAndLanguageDescriptionsId  implements Serializable {

    @Column(name="lBezNr")
    int lBezNr;
    @Column(name="lKZ")
    String lKZ;
    @Column(name="sprachNr")
    int sprachNr;

    public CountryAndLanguageDescriptionsId() {
    }

    public CountryAndLanguageDescriptionsId(int lBezNr, String lKZ, int sprachNr) {
        this.lBezNr = lBezNr;
        this.lKZ = lKZ;
        this.sprachNr = sprachNr;
    }

    public int getlBezNr() {
        return lBezNr;
    }

    public String getlKZ() {
        return lKZ;
    }

    public int getSprachNr() {
        return sprachNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryAndLanguageDescriptionsId that = (CountryAndLanguageDescriptionsId) o;
        return getlBezNr() == that.getlBezNr() &&
                getSprachNr() == that.getSprachNr() &&
                Objects.equals(getlKZ(), that.getlKZ());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getlBezNr(), getlKZ(), getSprachNr());
    }
}
