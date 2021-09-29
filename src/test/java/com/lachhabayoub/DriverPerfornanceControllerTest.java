package com.lachhabayoub;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//SpringExtension integrates the Spring TestContext Framework into JUnit 5's Jupiter programming model.
@ExtendWith(SpringExtension.class) // Not Required

//MockMVC class is part of Spring MVC test framework which helps in
// testing the controllers explicitly starting a Servlet container.
@WebMvcTest

public class DriverPerfornanceControllerTest {
    //MockMvc is a Spring Boot test tool class that lets you test controllers without needing to start an HTTP server.

    @Autowired
    MockMvc mockMvc;

    @Test
    public void shouldReturnDriverPerformanceSummary() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/DP/DP1"))
                .andExpect(status().isOk());
    }
}
