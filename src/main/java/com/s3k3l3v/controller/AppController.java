package com.s3k3l3v.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @RequestMapping(value = {"/","helloworld"}, method = RequestMethod.GET)
    public ModelAndView helloPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", "Spring Security");
        modelAndView.addObject("message", "Welcome br");
        modelAndView.setViewName("helloworld");
        return modelAndView;
    }

    @RequestMapping(value = "/protected", method = RequestMethod.GET)
    public ModelAndView protectedPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", "Spring Security Prtd");
        modelAndView.addObject("message", "This is protected page!");
        modelAndView.setViewName("protected");
        return modelAndView;
    }

    @RequestMapping(value = "/confid", method = RequestMethod.GET)
    public ModelAndView adminPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", "Spring Security Adm");
        modelAndView.addObject("message", "This is admin page!");
        modelAndView.setViewName("protected");
        return modelAndView;
    }
}
