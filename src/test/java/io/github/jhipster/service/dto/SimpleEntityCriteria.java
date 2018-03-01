package io.github.jhipster.service.dto;

import io.github.jhipster.service.filter.BigDecimalFilter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.InstantFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import io.github.jhipster.service.filter.ZonedDateTimeFilter;

import java.io.Serializable;

/**
 * <p>Created on 2018/3/1.</p>
 *
 * @author Yoann CAPLAIN
 */
public class SimpleEntityCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter aString;

    private BigDecimalFilter aBigDecimal;

    private InstantFilter anInstant;

    private ZonedDateTimeFilter aZonedDateTime;

    private FloatFilter aFloat;

    public SimpleEntityCriteria(){}

    public LongFilter getId() {
        return id;
    }

    public void setId(final LongFilter id) {
        this.id = id;
    }

    public StringFilter getaString() {
        return aString;
    }

    public void setaString(final StringFilter aString) {
        this.aString = aString;
    }

    public BigDecimalFilter getaBigDecimal() {
        return aBigDecimal;
    }

    public void setaBigDecimal(final BigDecimalFilter aBigDecimal) {
        this.aBigDecimal = aBigDecimal;
    }

    public InstantFilter getAnInstant() {
        return anInstant;
    }

    public void setAnInstant(final InstantFilter anInstant) {
        this.anInstant = anInstant;
    }

    public ZonedDateTimeFilter getaZonedDateTime() {
        return aZonedDateTime;
    }

    public void setaZonedDateTime(final ZonedDateTimeFilter aZonedDateTime) {
        this.aZonedDateTime = aZonedDateTime;
    }

    public FloatFilter getaFloat() {
        return aFloat;
    }

    public void setaFloat(final FloatFilter aFloat) {
        this.aFloat = aFloat;
    }
}
