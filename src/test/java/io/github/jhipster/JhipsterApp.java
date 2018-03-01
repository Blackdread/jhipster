package io.github.jhipster;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * <p>Created on 2018/3/1.</p>
 *
 * @author Yoann CAPLAIN
 */
@ComponentScan
@EnableAutoConfiguration
@SpringBootConfiguration
public class JhipsterApp {

    private static final Logger log = LoggerFactory.getLogger(JhipsterApp.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JhipsterApp.class);
        Environment env = app.run(args).getEnvironment();

        log.info("\n----------------------------------------------------------\n\t" +
                "Application '{}' was launched\n\t" +
                "Profile(s): \t{}\n----------------------------------------------------------",
            env.getProperty("spring.application.name"),
            env.getActiveProfiles());
    }
}
