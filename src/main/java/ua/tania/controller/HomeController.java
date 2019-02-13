package ua.tania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Tania Nebesna on 13.02.2019.
 */
@Controller
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }
}
