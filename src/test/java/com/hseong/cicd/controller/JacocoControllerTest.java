package com.hseong.cicd.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.GetMapping;

@WebMvcTest(JacocoController.class)
class JacocoControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void jacoco() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/api/jacoco"));

        resultActions.andExpect(status().isOk())
            .andDo(print());
    }

    @Test
    void codeCoverage() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/api/code-coverage"));

        resultActions.andExpect(status().isOk())
            .andDo(print());
    }
}