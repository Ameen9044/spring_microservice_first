package com.example.app;


import com.example.controllers.myController;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void controllerTestCase(){
		long testId = 12;
		String name = "Ameen";
		myController myControlless = new myController();

		myControlless.myGreeting(name);
	}

}
