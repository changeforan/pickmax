package com.bosscang.pickmax.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    @RequestMapping(value = "/pickmax", method = RequestMethod.GET)
    public String home() {
        return "Pick The Maximum!";
    }
}
