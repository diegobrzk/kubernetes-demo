package br.com.keyrus.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @Value("${node}")
    private String node;
    @Value("${valor}")
    private String valor;

    @GetMapping("/")
    public Map<String, Object> get() {
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("valor", valor);
        return map;
    }

}
