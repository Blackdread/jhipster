package io.github.jhipster.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * <p>Created on 2018/3/1.</p>
 *
 * @author Yoann CAPLAIN
 */
@Entity
public class SimpleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String aString;

    private BigDecimal aBigDecimal;

    private Instant anInstant;

    private ZonedDateTime aZonedDateTime;

    private Float aFloat;

    public SimpleEntity() {
    }

    public SimpleEntity(final String aString, final BigDecimal aBigDecimal, final Instant anInstant, final ZonedDateTime aZonedDateTime, final Float aFloat) {
        this.aString = aString;
        this.aBigDecimal = aBigDecimal;
        this.anInstant = anInstant;
        this.aZonedDateTime = aZonedDateTime;
        this.aFloat = aFloat;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getaString() {
        return aString;
    }

    public BigDecimal getaBigDecimal() {
        return aBigDecimal;
    }

    public void setaBigDecimal(final BigDecimal aBigDecimal) {
        this.aBigDecimal = aBigDecimal;
    }

    public void setaString(final String aString) {
        this.aString = aString;
    }

    public Instant getAnInstant() {
        return anInstant;
    }

    public void setAnInstant(final Instant anInstant) {
        this.anInstant = anInstant;
    }

    public ZonedDateTime getaZonedDateTime() {
        return aZonedDateTime;
    }

    public void setaZonedDateTime(final ZonedDateTime aZonedDateTime) {
        this.aZonedDateTime = aZonedDateTime;
    }

    public Float getaFloat() {
        return aFloat;
    }

    public void setaFloat(final Float aFloat) {
        this.aFloat = aFloat;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final SimpleEntity that = (SimpleEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SimpleEntity{" +
            "id=" + id +
            ", aString='" + aString + '\'' +
            ", aBigDecimal=" + aBigDecimal +
            ", anInstant=" + anInstant +
            ", aZonedDateTime=" + aZonedDateTime +
            ", aFloat=" + aFloat +
            '}';
    }
}
