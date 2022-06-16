package com.AmonKibet.BankingApp.transaction;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class Transaction {
    /*-----ATTRIBUTES-----*/
    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;
}
