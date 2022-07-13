package com.AmonKibet.BankingApp.controller;
/*---TESTING THE APPLICATION END TO END---*/

import com.AmonKibet.BankingApp.repository.TransactionRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.web.server.LocalServerPort;
import com.AmonKibet.BankingApp.transactionservice.TransactionService;
import com.AmonKibet.BankingApp.controller.TransactionController;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class TransactionComponentTest {
    @LocalServerPort
    private int port;

    //Mockito testing
    @Mock
    TransactionRepository transactionRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAppEndToEnd(){
        given().standaloneSetup(new TransactionController(new TransactionService(transactionRepository)))
                .when()
                .get(String.format("http://localhost:%s/api/v1/transactions/28282828", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
