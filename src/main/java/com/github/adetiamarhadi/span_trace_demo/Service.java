package com.github.adetiamarhadi.span_trace_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void save() {
        LOGGER.info("inserting data...");
        repository.insert();
    }

    public String get() {
        LOGGER.info("getting data from db");
        return repository.select();
    }
}
