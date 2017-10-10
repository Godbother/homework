package com.shop.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shopcar")
public class ShopcarController {

    @RequestMapping("/getlist")
    public ModelAndView getlist(){
        ModelAndView modelAndView = new ModelAndView();
        return null;
    }
}
