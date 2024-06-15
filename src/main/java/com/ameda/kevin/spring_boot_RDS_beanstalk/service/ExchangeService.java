package com.ameda.kevin.spring_boot_RDS_beanstalk.service;/*
*
@author ameda
@project spring-boot-RDS-beanstalk
*
*/

import com.ameda.kevin.spring_boot_RDS_beanstalk.model.ExchangeRate;
import com.ameda.kevin.spring_boot_RDS_beanstalk.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {
    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

   public ExchangeRate addExchangeRate(ExchangeRate rate){
       return  exchangeRateRepository.save(rate);
   }

    public double getAmount(String sourceCurrency, String targetCurrency){
        ExchangeRate exchangeRate = exchangeRateRepository
                .findBySourceCurrencyAndTargetCurrency(sourceCurrency, targetCurrency);
        return  exchangeRate == null ? 0: exchangeRate.getAmount();
    }
}
