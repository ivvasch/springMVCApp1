package ru.ivan.spring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalcController {

    @GetMapping("/calc")
    public String calc(HttpServletRequest request, Model model) {
        Integer a = Integer.parseInt(request.getParameter("a"));
        Integer b = Integer.parseInt(request.getParameter("b"));
//        String multi = request.getParameter("multi");
//        String add = request.getParameter("add");
//        String sub = request.getParameter("sub");
//        String div = request.getParameter("div");
        String div2 = request.getLocalName();

        switch (div2) {
            case "multi":
                model.addAttribute("message", a * b);
                break;
            case "add":
                model.addAttribute("message", a + b);
                break;
            case "sub":
                model.addAttribute("message", a - b);
                break;
            case "div":
                model.addAttribute("message", a / b);
                break;
        }
        return "first/calc";
    }
}
