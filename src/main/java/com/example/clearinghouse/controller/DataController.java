package com.example.clearinghouse.controller;

import com.example.clearinghouse.model.Portfolio;
import com.example.clearinghouse.service.PortfolioDataLoader;
import com.example.clearinghouse.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {

    @Autowired
    SearchService searchService;

    @GetMapping(value = "/")
    public String getFormData(Model model){
        model.addAttribute("cities", PortfolioDataLoader.getCities());
        model.addAttribute("states", PortfolioDataLoader.getSates());
        model.addAttribute("bankNames", PortfolioDataLoader.getBankNames());
        model.addAttribute("bankTypes", PortfolioDataLoader.getBankTypes());
        model.addAttribute("zipCodes", PortfolioDataLoader.getZipCodes());
        return "portfolio-form";

    }

    @PostMapping(value = "/portfoliosearch")
    public String searchPortfolio(Model model, @ModelAttribute("portfolio") Portfolio portfolio,
                                  @RequestParam("action") String action){

        if(action.equals("or")){
            model.addAttribute("portfolioList", searchService.getPortfolioOrForm(portfolio));
        } else{
            model.addAttribute("portfolioList", searchService.getPortfolioWithAndForm(portfolio));
        }
        return "portfolioSearch";

    }



}
