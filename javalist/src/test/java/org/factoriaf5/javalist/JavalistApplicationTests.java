package org.factoriaf5.javalist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	void testCrearDiasVacio() {
    String dia = "";

    List<String> result = javalist.crearDias(dia);
    // Assert
    assertEquals(Arrays.asList(""), result);
	}

	@Test
	void testCrearDiasNulo() {
    String dia = null;
	IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            javalist.crearDias(dia);});
			assertEquals("El día es inválido", exception.getMessage());

	}

	/* @Test
	void verDias(){
		manager.verDias("Lunes");
		//manager es algo que se usa para testear voids
		assert
	} */

	@Test
	void testLargoSemana(){
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		int result =  javalist.largoSemana(dias);
		// Assert
		assertEquals(2, result);
	}

	@Test
	void testDia(){
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		int posicionDia = 0;
		String result = javalist.dia(dias, posicionDia);

		// Assert
		assertEquals("Lunes", result);
	}

	@Test
	void testDiaPosicionMal(){
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		int posicionDia = 5;
		String result = javalist.dia(dias, posicionDia);

		// Assert
		assertEquals("El día no existe en la lista", result);
	}

	@Test
	void testDiaExiste(){
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");

		String dia = "Lunes";

		boolean result  = javalist.diaExiste(dias, dia);
		// Assert
		assertEquals(result, true);
	}

	@Test
	void testDiaNoExiste(){
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");

		String dia = "Jueves";

		boolean result  = javalist.diaExiste(dias, dia);
		// Assert
		assertEquals(result, false);
	}

	@Test
	void testDiaEstaVacio(){
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");

		String dia = "";

		boolean result  = javalist.diaExiste(dias, dia);
		// Assert
		assertEquals(result, false);
	}

	@Test
	void testOrdenarDias(){
		List<String> dias = new ArrayList<>();
		dias.add("Martes");
		dias.add("Jueves");

		List<String> result = javalist.ordenarDias(dias);

		List<String> expected = Arrays.asList("Jueves", "Martes");
		assertEquals(expected, result);
	}









		


}
