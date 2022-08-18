package com.AmonKibet.BankingApp.controller;
/*---TESTING THE APPLICATION END TO END---*/

import com.AmonKibet.BankingApp.BankingAppApplication;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

//This will allow Spring to automatically resolve
//the beans and inject them where they are needed.
@SpringBootTest(classes = {BankingAppApplication.class})
public class TransactionComponentTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TransactionController transactionController;

    @Test
    public void testAppEndToEnd(){
        given().standaloneSetup(transactionController)
                .when()
                .get(String.format("http://localhost:%s/api/v1/transactions/28282828", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
