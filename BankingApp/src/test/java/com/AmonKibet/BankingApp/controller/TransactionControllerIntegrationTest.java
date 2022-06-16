/*
TransactionControllerIntegrationTest.java
This class will be used to check that the REST controller and the supporting service
 are working together.Implemented using MockMvc.
*/

package com.AmonKibet.BankingApp.controller;

/*---IMPORTS AND PACKAGES---*/
import com.AmonKibet.BankingApp.BankingAppApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {BankingAppApplication.class})
@AutoConfigureMockMvc // Enable and configure auto-configuration of MockMvc
public class TransactionControllerIntegrationTest {

    @Test
    public void testTransactions() throws Exception{
        mockMvc.perform(
                get("/api/v1/transactions/28282828"))
                .andExpect(status().isOk());
    }
    @Autowired
    private MockMvc mockMvc;
}
