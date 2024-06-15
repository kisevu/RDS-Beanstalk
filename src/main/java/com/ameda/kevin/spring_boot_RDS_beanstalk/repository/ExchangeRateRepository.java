package com.ameda.kevin.spring_boot_RDS_beanstalk.repository;/*
*
@author ameda
@project spring-boot-RDS-beanstalk
*
*/

import com.ameda.kevin.spring_boot_RDS_beanstalk.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate,Integer> {
    ExchangeRate findBySourceCurrencyAndTargetCurrency(String sourceCurrency,
                                                       String targetCurrency);
}
