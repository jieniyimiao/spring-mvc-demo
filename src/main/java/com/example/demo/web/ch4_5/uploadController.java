package com.example.demo.web.ch4_5;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class uploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("D:/upload/" + file.getOriginalFilename()), file.getBytes());
            return "upload success";
        } catch (IOException e) {
            return "error : " + e.getMessage();
        }
    }
}
