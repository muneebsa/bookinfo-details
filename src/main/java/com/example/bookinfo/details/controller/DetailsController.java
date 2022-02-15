package com.example.bookinfo.details.controller;

import com.example.bookinfo.details.model.Details;
import com.example.bookinfo.details.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class DetailsController {

    @Autowired
    DetailsRepository repository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/bookinfo-details/{id}")
    public Details getDetails(@PathVariable("id") int id) {
        logger.info("getDetails() - id: " + id);
        return repository.findById(id);
    }
}
