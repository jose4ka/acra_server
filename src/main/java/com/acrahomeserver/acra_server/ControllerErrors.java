package com.acrahomeserver.acra_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.Locale;

@RestController
@RequestMapping("logs")
public class ControllerErrors {

    private static Logger logger = LoggerFactory.getLogger(ControllerErrors.class);

    @PostMapping
    public String putErrorMessage(@RequestBody String s){
        logger.info(s);
        try {
            File file = new File("logMain.txt");
            if (!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append("\n"+s);
            fileWriter.flush();
        }
        catch (Exception e){

        }

        return s;
    }
}
