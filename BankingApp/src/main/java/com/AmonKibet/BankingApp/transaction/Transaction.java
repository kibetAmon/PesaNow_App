package com.AmonKibet.BankingApp.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


/*-You need a default constructor in entities(Without any arguments)
Because JPA uses the default constructor method to create a bean class.

Adding a constructor with parameters(@AllArgsConstructor), then we need to add
a no args constructor as well for JPA to work. This is because
Java will generate a default constructor only if there are no constructors defined for the class.
*/
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
/*----Annotations to enable JPA----*/
@Entity //It's a JPA entity
@Table(name = "transactions") //table that will be used to persist the entity in the database.
public class Transaction {
    /*-----ATTRIBUTES-----*/

    @Id //JPA recognize it as the object's id
    @GeneratedValue(strategy = GenerationType.AUTO) //Id should be generated automatically
    private Long id;
    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;
}
