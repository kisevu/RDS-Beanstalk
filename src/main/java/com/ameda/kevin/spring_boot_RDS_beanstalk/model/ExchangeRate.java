package com.ameda.kevin.spring_boot_RDS_beanstalk.model;/*
*
@author ameda
@project spring-boot-RDS-beanstalk
*
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_exchange_rate")
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionId;
    private String sourceCurrency;
    private String targetCurrency;
    private double amount;
    private Date lastUpdated;
}
