package org.silaichev.springdeployfromgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/get")
    public String defaultGet(){

        return "defGetPage";
    }
}
