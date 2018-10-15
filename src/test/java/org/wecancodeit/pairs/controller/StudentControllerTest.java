package org.wecancodeit.pairs.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.pairs.repository.StudentRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private StudentRepository repo;

	@Test
	public void shouldGetWebsite() throws Exception {
		mockMvc.perform(get("/hippo")).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnPairTemplate() throws Exception {
		mockMvc.perform(get("/hippo")).andExpect(view().name("hippo"));
	}
}
