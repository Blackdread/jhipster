package io.github.jhipster.service;

import io.github.jhipster.domain.SimpleEntity;
import io.github.jhipster.domain.SimpleEntity_;
import io.github.jhipster.repository.SimpleEntityRepository;
import io.github.jhipster.service.dto.SimpleEntityCriteria;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.RangeFilter;
import io.github.jhipster.service.filter.StringFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import java.util.List;

/**
 * <p>Created on 2018/3/1.</p>
 *
 * @author Yoann CAPLAIN
 */
@Service
@Transactional
public class SimpleEntityQueryService extends QueryService<SimpleEntity> {

    private static final Logger log = LoggerFactory.getLogger(SimpleEntityQueryService.class);

    private final SimpleEntityRepository simpleEntityRepository;

    public SimpleEntityQueryService(final SimpleEntityRepository simpleEntityRepository) {
        this.simpleEntityRepository = simpleEntityRepository;
        log.info("Instantiated");
    }

    public List<SimpleEntity> findAll(final SimpleEntityCriteria criteria) {
        return simpleEntityRepository.findAll(createSpecification(criteria));
    }

    private Specification<SimpleEntity> createSpecification(final SimpleEntityCriteria criteria) {
        Specification<SimpleEntity> specification = Specification.where(null);
        if (criteria != null) {
            if (criteria.getId() != null) {
                specification = specification.and(buildSpecificationWithSameName(criteria.getId(), SimpleEntity_.id));
            }
            if (criteria.getaBigDecimal() != null) {
                specification = specification.and(buildSpecificationWithSameName(criteria.getaBigDecimal(), SimpleEntity_.aBigDecimal));
            }
            if (criteria.getaFloat() != null) {
                specification = specification.and(buildSpecificationWithSameName(criteria.getaFloat(), SimpleEntity_.aFloat));
            }
            if (criteria.getAnInstant() != null) {
                specification = specification.and(buildSpecificationWithSameName(criteria.getAnInstant(), SimpleEntity_.anInstant));
            }
            if (criteria.getaZonedDateTime() != null) {
                specification = specification.and(buildSpecificationWithSameName(criteria.getaZonedDateTime(), SimpleEntity_.aZonedDateTime));
            }
            if (criteria.getaString() != null) {
                specification = specification.and(buildSpecificationWithSameName(criteria.getaString(), SimpleEntity_.aString));
            }
        }
        return specification;
    }

    // =====
    // Below is just to demonstrate that we could use same names for methods
    // =====
    public <X> Specification<SimpleEntity> buildSpecificationWithSameName(final Filter<X> filter, final SingularAttribute<? super SimpleEntity, X> field) {
        return super.buildSpecification(filter, field);
    }

    public Specification<SimpleEntity> buildSpecificationWithSameName(final StringFilter filter, final SingularAttribute<? super SimpleEntity, String> field) {
        return super.buildStringSpecification(filter, field);
    }

    public <X extends Comparable<? super X>> Specification<SimpleEntity> buildSpecificationWithSameName(final RangeFilter<X> filter, final SingularAttribute<? super SimpleEntity, X> field) {
        return super.buildRangeSpecification(filter, field);
    }

    public <OTHER, X> Specification<SimpleEntity> buildSpecificationWithSameName(final Filter<X> filter, final SingularAttribute<? super SimpleEntity, OTHER> reference, final SingularAttribute<OTHER, X> valueField) {
        return super.buildReferringEntitySpecification(filter, reference, valueField);
    }

    public <OTHER, X> Specification<SimpleEntity> buildSpecificationWithSameName(final Filter<X> filter, final SetAttribute<SimpleEntity, OTHER> reference, final SingularAttribute<OTHER, X> valueField) {
        return super.buildReferringEntitySpecification(filter, reference, valueField);
    }


    // =====
    // Below is just to make the methods public in tests (but not used for now)
    // =====

    @Override
    public <X> Specification<SimpleEntity> buildSpecification(final Filter<X> filter, final SingularAttribute<? super SimpleEntity, X> field) {
        return super.buildSpecification(filter, field);
    }

    @Override
    public Specification<SimpleEntity> buildStringSpecification(final StringFilter filter, final SingularAttribute<? super SimpleEntity, String> field) {
        return super.buildStringSpecification(filter, field);
    }

    @Override
    public <X extends Comparable<? super X>> Specification<SimpleEntity> buildRangeSpecification(final RangeFilter<X> filter, final SingularAttribute<? super SimpleEntity, X> field) {
        return super.buildRangeSpecification(filter, field);
    }

    @Override
    public <OTHER, X> Specification<SimpleEntity> buildReferringEntitySpecification(final Filter<X> filter, final SingularAttribute<? super SimpleEntity, OTHER> reference, final SingularAttribute<OTHER, X> valueField) {
        return super.buildReferringEntitySpecification(filter, reference, valueField);
    }

    @Override
    public <OTHER, X> Specification<SimpleEntity> buildReferringEntitySpecification(final Filter<X> filter, final SetAttribute<SimpleEntity, OTHER> reference, final SingularAttribute<OTHER, X> valueField) {
        return super.buildReferringEntitySpecification(filter, reference, valueField);
    }
}
