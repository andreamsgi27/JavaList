package org.factoriaf5.javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavalistApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavalistApplication.class, args);
		
	}

	public List<String> crearDias (String dia){
		List<String> dias = new ArrayList<>();
		dias.add(dia);
		return dias;
	}

	public static void verDias(List<String> dias){
		System.out.println(dias);
	}

	public int largoSemana (List<String> verDias){
		int largoSemana = verDias.size();
		return largoSemana;
	}

	public static void eliminaDia (List<String> verDias){
		verDias.remove(0);
	}

	public String dia (List<String> verDias, int dia){
		String diaSemana = verDias.get(dia);
		return diaSemana;
	}

	public boolean diaExiste (List<String> verDias, String dia){
		if (verDias.contains(dia)){
			return true;
		} else {
			return false;
		}
	}

	public List<String> ordenarDias (List<String> dias){
		Collections.sort(dias);
		return dias;
	}

}
