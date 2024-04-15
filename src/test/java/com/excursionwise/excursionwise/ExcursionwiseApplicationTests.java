package com.excursionwise.excursionwise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExcursionwiseApplicationTests {

	private String successLabel = "not successful";

	@Test
	void contextLoads() {
	}

	@BeforeEach
	void setup(){

	}

	@Test
	public void should_returnSuccess_when_excursionAdded() {
		// successfully added
	}

	@Test
	public void should_returnTrue_when_excursionUpdated() {
		// exists
	}


	@Test
	public void should_returnTrue_when_excursionBooked(){

	}

	@Test
	public void should_returnTrue_when_excursionPaid(){

	}

	@Test
	public void should_returnFalse_whenBookingCancelled(){

	}

	@Test
	public void should_returnTrue_when_excursionDeleted() {
		
	}




}
