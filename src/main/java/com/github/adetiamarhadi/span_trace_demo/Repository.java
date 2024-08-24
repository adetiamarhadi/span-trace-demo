package com.github.adetiamarhadi.span_trace_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Repository {

    private static final Logger LOGGER = LoggerFactory.getLogger(Repository.class);

    public void insert() {
        LOGGER.info("data successfully inserted");
        return;
    }

    public String select() {
        LOGGER.info("get data from db done");
        return "item";
    }
}
