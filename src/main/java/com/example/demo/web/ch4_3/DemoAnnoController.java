package com.example.demo.web.ch4_3;

import com.example.demo.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain")
    public @ResponseBody String index(HttpServletRequest request) {
        return request.getRequestURL().toString();
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return request.getRequestURL().toString() + " str = " + str;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request) {
        return request.getRequestURL().toString() + " id = " + id;
    }

    @RequestMapping(value = "/obj", produces = "text/plain")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request) {
        return request.getRequestURL().toString() + " obj = " + obj.toString();
    }

    @RequestMapping(value = {"/name1","/name2"}, produces = "text/plain")
    public @ResponseBody String remove(HttpServletRequest request) {
        return request.getRequestURL().toString();
    }

}
