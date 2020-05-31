package com.herbtea.jenkins.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "test-test";
    }

    @GetMapping("/jenkins")
    public String test2() {
        return "slack notification Test";
    }

    @GetMapping("/deploy")
    public String test3() {
        return "CD Test";
    }
}
