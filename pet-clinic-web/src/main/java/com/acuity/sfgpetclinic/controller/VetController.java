package com.acuity.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vet", "/vets/index", "/vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
