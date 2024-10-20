package org.factoriaf5.javalist;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavalistApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavalistApplication.class, args);
	}

	public List<String> crearDias() {
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves",  "Viernes", "Sábado", "Domingo"};
		return dias;
	}
	public void dias(){
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves",  "Viernes", "Sábado", "Domingo"};
	}

}
