package org.hcl.candidateAssessment.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class ApplicationController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Candidate Assessment Application Controller";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationController.class, args);
    }
}
