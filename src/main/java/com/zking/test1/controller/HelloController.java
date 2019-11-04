package com.zking.test1.controller;

import com.zking.test1.model.Book;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloController {

    @RequestMapping("/add")
    public String add(){
        System.out.println("add");
        return "rs";
    }

    @RequestMapping("/toRs")
    public String toRs(){
        return "rs";
    }

//    @GetMapping
//    @PostMapping
    @RequestMapping(value = "/hello")
    public String  hello(String username, Book book, HttpServletRequest request){
        System.out.println("hello"+username);
        System.out.println(book);
        request.setAttribute("username",username);
        return "redirect:toRs";
    }

}
