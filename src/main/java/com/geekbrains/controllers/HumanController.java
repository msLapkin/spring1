package com.geekbrains.controllers;

import com.geekbrains.entites.Human;
import com.geekbrains.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/human")
public class HumanController {
    private HumanService humanService;

    @Autowired
    public void setHumanService(HumanService humanService) {
        this.humanService = humanService;
    }

    //пример запроса: http://localhost:8189/human/result?x=2&y=8
    @RequestMapping(path = "/result", method = RequestMethod.GET)
    public String result (Model model, @RequestParam int x, @RequestParam int y){
        int result = x+y;
        model.addAttribute("result",result);
        model.addAttribute("x",x);
        model.addAttribute("y",y);
        return "result";
    }

    //вывод всего списка
    @RequestMapping("/show")
    public String showAll (Model model){
        List<Human>humanList = humanService.getHumanList();
        model.addAttribute("humans", humanList);
        return "hw2";
    }
    @RequestMapping(path = "/humanForm")
    public String postHuman (Model model){
       Human human = new Human();
        model.addAttribute("human",human);
        return "human-form";
    }
//
    @RequestMapping(path = "/humanFormResult", method = RequestMethod.POST)
    public String postResult (@ModelAttribute("human")Human human){
        //model.addAttribute("human",human);
        return "human-form-result";
    }
}
