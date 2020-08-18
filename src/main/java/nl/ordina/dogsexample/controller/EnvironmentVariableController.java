package nl.ordina.dogsexample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(path = "/EV")
public class EnvironmentVariableController {
    @GetMapping
    public Map<String, String> giveEnvironmentVariables() {
        return System.getenv();
    }

    @GetMapping(path = "/test")
    public String giveTestEnvironmentVariables() {
        return System.getenv("test_valueee");
    }
}
