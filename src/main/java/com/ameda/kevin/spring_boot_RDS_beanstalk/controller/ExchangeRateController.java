package com.ameda.kevin.spring_boot_RDS_beanstalk.controller;/*
*
@author ameda
@project spring-boot-RDS-beanstalk
*
*/

import com.ameda.kevin.spring_boot_RDS_beanstalk.model.ExchangeRate;

import com.ameda.kevin.spring_boot_RDS_beanstalk.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rates")
public class ExchangeRateController {
    @Autowired
    private ExchangeService service;

    @GetMapping("/getAmount")
    public double getAmount(@RequestParam String sourceCurrency,
                            @RequestParam String targetCurrency){
        return  service.getAmount(sourceCurrency,targetCurrency);
    }
    @PostMapping("/addExchangeRate")
    public ExchangeRate  addRate(@RequestBody ExchangeRate rate){
        return service.addExchangeRate(rate);
    }

    @GetMapping("/")
    public String getHealth(){
        return  "UP";
    }
}
