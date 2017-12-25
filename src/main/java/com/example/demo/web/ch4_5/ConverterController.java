package com.example.demo.web.ch4_5;

import com.example.demo.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = "application/x-wisely")
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj obj) {
        System.out.println(obj);
        return obj;
    }
}
