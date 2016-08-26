package com.xaymaca.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vincent Stoessel on August 25, 2016.
 */
@Controller
public class HelloMotoController {

    @RequestMapping("/index")
    public String helloW(Model model) {
        model.addAttribute("name", "Moto");
        return "hello";
    }
}
