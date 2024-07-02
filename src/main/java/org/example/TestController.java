package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Value("${test.value}")
    private String testValue;

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/api/module/test")
    public String test() {

        return "module test controller + " + testValue;
    }

    @GetMapping("/api/module/rep")
    public int testRepo() {
        List<Test> all =
                testRepository.findAll();

        return all.size();
    }
}
