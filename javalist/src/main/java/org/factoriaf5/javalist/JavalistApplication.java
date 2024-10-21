package org.factoriaf5.javalist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavalistApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavalistApplication.class, args);

	}

	public static void crearDias (){
		List<String> dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add("Miercoles");
		dias.add("Jueves");
		dias.add("Viernes");
		dias.add("Sabado");
		dias.add("Domingo");
	}

	public static List<String> verDias(){
		List<String> dias = List.of("Lunes", "Martes", "Miércoles", "Jueves",  "Viernes", "Sábado", "Domingo");
		return dias;
	}

	public int largoSemana (List<String> verDias){
		int largoSemana  = verDias.size();
		return largoSemana;
	}

	public static void eliminaDia (List<String> verDias){
		verDias.remove(0);
	}

	public String dia (List<String> verDias, int dia){
		String diaSemana = verDias.get(dia);
		return diaSemana;
	}

	public boolean diaExiste (List<String> verDias, int dia){
		if (verDias.contains(dia)){
			return true;
		} else {
			return false;
		}
	}

	




}
