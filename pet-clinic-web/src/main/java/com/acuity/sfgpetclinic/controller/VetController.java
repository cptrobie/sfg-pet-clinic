package com.acuity.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
