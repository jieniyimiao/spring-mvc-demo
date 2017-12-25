package com.example.demo.web.ch4_3;

import com.example.demo.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = "application/json")
    public DemoObj getJson(DemoObj obj) {
        return new DemoObj(obj.getId(), obj.getName());
    }

    @RequestMapping(value = "/getxml", produces = "application/xml")
    public DemoObj getXml(DemoObj obj) {
        return new DemoObj(obj.getId(), obj.getName());
    }
 }
