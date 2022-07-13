package com.AmonKibet.BankingApp.controller.dto;

import com.AmonKibet.BankingApp.transaction.Transaction;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
/*The @Builder annotation produces complex builder APIs for the classes.
@Data annotation generate getters for all fields.
*/
@Data
@Builder
public class TransactionDto {
    private Long id;
    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;

    public static TransactionDto apply(final Transaction tr){
        var t = new TransactionDtoBuilder()
                .id(tr.getId())
                .type(tr.getType())
                .date(tr.getDate())
                .accountNumber(tr.getAccountNumber())
                .currency(tr.getCurrency())
                .amount(tr.getAmount())
                .merchantName(tr.getMerchantName())
                .merchantLogo(tr.getMerchantLogo())
                .build();
        return t;

    }
}
