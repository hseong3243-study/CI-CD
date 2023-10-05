package com.hseong.cicd.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void helloWorld() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/api/hello"));

        resultActions.andExpect(status().isOk())
            .andDo(print());
    }

    @Test
    void helloSonarCloud() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/api/sonar-cloud"));

        resultActions.andExpect(status().isOk())
            .andDo(print());
    }
}