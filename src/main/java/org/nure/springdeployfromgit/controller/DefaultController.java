package org.nure.springdeployfromgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    private String get(){
        return "defGetPage";
    }
}
