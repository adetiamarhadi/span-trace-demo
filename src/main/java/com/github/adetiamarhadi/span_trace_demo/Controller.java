package com.github.adetiamarhadi.span_trace_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> save() {
        LOGGER.info("controller for saving request triggered...");
        service.save();
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public String get() {
        LOGGER.info("controller for get data request triggered...");
        return service.get();
    }
}
