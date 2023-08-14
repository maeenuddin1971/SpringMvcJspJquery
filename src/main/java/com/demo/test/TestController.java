package com.demo.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.log4j.Logger;

@Controller
@RequestMapping
public class TestController {

    private static final Logger logger = Logger.getLogger(TestController.class);

    @GetMapping("/testMvcProject")
    @ResponseBody
    public ResponseEntity<?> testIfItOk() {
        return new ResponseEntity<>("everything is working fine", HttpStatus.OK);
    }

    @GetMapping("/testJsp")
    public String testJsp() {
        return "practiceJspPage";
    }
}
