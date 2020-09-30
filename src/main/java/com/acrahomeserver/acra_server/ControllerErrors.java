package com.acrahomeserver.acra_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("errors")
public class ControllerErrors {

    private static Logger logger = LoggerFactory.getLogger(ControllerErrors.class);

    @PostMapping
    public String putErrorMessage(@RequestBody String s){
        logger.info(s);
        return s;
    }
}
