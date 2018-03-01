package io.github.jhipster.service;

import io.github.jhipster.JhipsterApp;
import io.github.jhipster.domain.SimpleEntity;
import io.github.jhipster.repository.SimpleEntityRepository;
import io.github.jhipster.service.dto.SimpleEntityCriteria;
import io.github.jhipster.service.filter.LongFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <p>Created on 2018/3/1.</p>
 *
 * @author Yoann CAPLAIN
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JhipsterApp.class)
@Transactional
public class QueryServiceTest {

    private static final Logger log = LoggerFactory.getLogger(QueryServiceTest.class);

    @Autowired
    private SimpleEntityQueryService simpleEntityQueryService;

    @Autowired
    private SimpleEntityRepository simpleEntityRepository;

    @Autowired
    private EntityManager em;

    private SimpleEntityCriteria criteria;

    private SimpleEntity entity1;
    private SimpleEntity entity2;
    private SimpleEntity entity3;

    @Before
    public void setup() {
        entity1 = new SimpleEntity("valueString", new BigDecimal(5), Instant.now(), ZonedDateTime.now(), 0.5f);
        entity2 = new SimpleEntity("valueString2", new BigDecimal(6), Instant.now(), ZonedDateTime.now(), 0.8f);
        entity3 = new SimpleEntity("valueString3", new BigDecimal(7), Instant.now(), ZonedDateTime.now(), 0.1f);
        em.persist(entity1);
        em.persist(entity2);
        em.persist(entity3);
        criteria = new SimpleEntityCriteria();
    }

    @Test
    public void assertEntitiesAreLoaded() {
        final List<SimpleEntity> all = simpleEntityQueryService.findAll(null);
        assertThat(all).isNotEmpty();
        assertThat(all).hasSize(3);
        log.info("Entities: {}", all);
    }

    @Test
    public void assertThatCanFilterByEquals() {
        criteria.setId(new LongFilter());
        criteria.getId().setEquals(entity2.getId());
        final List<SimpleEntity> all = simpleEntityQueryService.findAll(criteria);
        assertThat(all).isNotEmpty();
        assertThat(all).hasSize(1);
    }

    @Test
    public void assertThatCanFilterByIsSpecified() {
        criteria.setId(new LongFilter());
        criteria.getId().setSpecified(true);
        final List<SimpleEntity> all = simpleEntityQueryService.findAll(criteria);
        assertThat(all).isNotEmpty();
        assertThat(all).hasSize(3);
    }

    @Test
    public void assertThatCanFilterByGreaterThan() {
        criteria.setId(new LongFilter());
        criteria.getId().setGreaterThan(entity2.getId());
        final List<SimpleEntity> all = simpleEntityQueryService.findAll(criteria);
        assertThat(all).isNotEmpty();
        assertThat(all).hasSize(1);
    }

    @Test
    public void assertThatCanFilterByGreaterOrEqualThan() {
        criteria.setId(new LongFilter());
        criteria.getId().setGreaterOrEqualThan(entity2.getId());
        final List<SimpleEntity> all = simpleEntityQueryService.findAll(criteria);
        assertThat(all).isNotEmpty();
        assertThat(all).hasSize(2);
    }

    @Test
    public void assertThatCanFilterByLessThan() {
        criteria.setId(new LongFilter());
        criteria.getId().setLessThan(entity2.getId());
        final List<SimpleEntity> all = simpleEntityQueryService.findAll(criteria);
        assertThat(all).isNotEmpty();
        assertThat(all).hasSize(1);
    }

    @Test
    public void assertThatCanFilterByLessOrEqualThan() {
        criteria.setId(new LongFilter());
        criteria.getId().setLessOrEqualThan(entity2.getId());
        final List<SimpleEntity> all = simpleEntityQueryService.findAll(criteria);
        assertThat(all).isNotEmpty();
        assertThat(all).hasSize(2);
    }
}
