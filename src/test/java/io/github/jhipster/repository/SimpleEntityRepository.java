package io.github.jhipster.repository;

import io.github.jhipster.domain.SimpleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * <p>Created on 2018/3/1.</p>
 *
 * @author Yoann CAPLAIN
 */
@Repository
public interface SimpleEntityRepository extends JpaRepository<SimpleEntity, Long>, JpaSpecificationExecutor<SimpleEntity> {
}
