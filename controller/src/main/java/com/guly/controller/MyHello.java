package com.guly.controller;

import com.guly.pojo.User;
import com.guly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyHello {

    @Autowired
    private UserService us;

    @RequestMapping(value = "hello.action")
    public ModelAndView hello() {
//        User u1 = us.find(1);
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("user", u1);
//        mv.setViewName("/hello.jsp");
//
//        return mv;
//    }
        System.out.println("sssssssssssssssssssssssssssssssssssss");
        return null;
    }

}
