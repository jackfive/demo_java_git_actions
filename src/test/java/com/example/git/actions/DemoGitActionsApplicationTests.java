package com.example.git.actions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class DemoGitActionsApplicationTests {

    @Autowired
    private MockMvc mvc;

	@Test
	void testHelloWorld() throws Exception {
		mvc.perform(get("/hello?nome=Felipe")
      		.contentType(MediaType.APPLICATION_JSON))
      	.andExpect(status().isOk())
      	.andExpect(content().string("hello world: Felipe"));
	}

}
