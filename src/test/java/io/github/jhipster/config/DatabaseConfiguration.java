package io.github.jhipster.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>Created on 2018/3/1.</p>
 *
 * @author Yoann CAPLAIN
 */
@Configuration
@EnableJpaRepositories("io.github.jhipster.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {

    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);

}
