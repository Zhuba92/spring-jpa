package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CandleService;

@Controller
public class HomeController {
    private CandleService candleService;

    @Autowired
    public HomeController(CandleService cs){
        this.candleService = cs;
    }

    @RequestMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("candleList", candleService.getCandleList());
        return "index";
    }
}
