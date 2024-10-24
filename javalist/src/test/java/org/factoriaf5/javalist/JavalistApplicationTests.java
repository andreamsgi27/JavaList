package org.factoriaf5.javalist;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavalistApplicationTests {
	private JavalistApplication javalist;

	@BeforeEach
	public void init(){
		this.javalist = new JavalistApplication();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testCrearDias() {
    String dia = "Jueves";

    List<String> result = javalist.crearDias(dia);
    // Assert
    assertEquals(Arrays.asList("Jueves"), result);
	}

	@Test
	void verDias(){
		manager.verDias("Lunes");
		//manager es algo que se usa para testear voids
		assert
	}

	@Test
	void testLargoSemana(){
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		int result =  javalist.largoSemana(dias);
		// Assert
		assertEquals(2, result);
	}






		


}
