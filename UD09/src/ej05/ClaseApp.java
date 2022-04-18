package ej05;

import java.util.ArrayList;
import java.util.Hashtable;

public class ClaseApp {

	public static void main(String[] args) {

		// Creamos los profesores
		Profesores[] array_profes = new Profesores[3];
		array_profes[0] = new Profesores("Juanma", 50, "Masculino", "matematicas");
		array_profes[1] = new Profesores("Nuria", 40, "Femenino", "fisica");
		array_profes[2] = new Profesores("Nuria", 40, "Femenino", "filosofia");

		// Creamos los alumnos
		ArrayList<Alumnos> lista_alumnos = new ArrayList<Alumnos>();
		lista_alumnos.add(new Alumnos("Edu", 20, "Masculino", 6.5));
		lista_alumnos.add(new Alumnos("Arnau", 20, "Masculino", 6.7));
		lista_alumnos.add(new Alumnos("Marta", 18, "Femenino", 7.5));
		lista_alumnos.add(new Alumnos("Ari", 21, "Femenino", 9.5));
		lista_alumnos.add(new Alumnos("Enric", 21, "Masculino", 9.0));
		lista_alumnos.add(new Alumnos("Laia", 20, "Femenino", 8.3));
		lista_alumnos.add(new Alumnos("Marc", 20, "Masculino", 8.5));
		lista_alumnos.add(new Alumnos("David", 22, "Masculino", 6.1));
		lista_alumnos.add(new Alumnos("Carla", 19, "Femenino", 7.9));
		lista_alumnos.add(new Alumnos("Miriam", 23, "Femenino", 9.7));
		lista_alumnos.add(new Alumnos("Gerard", 21, "Masculino", 5.2));
		lista_alumnos.add(new Alumnos("Helena", 20, "Femenino", 8.2));

		// Creamos las Hashtables
		Hashtable<String, Boolean> hash_ausencia = new Hashtable<String, Boolean>();
		Hashtable<String, Double> hash_notas = new Hashtable<String, Double>();

		// Creamos dos aulas
		Aula[] array_aulas = new Aula[3];
		array_aulas[0] = new Aula(0, 20, "matematicas", array_profes[0], lista_alumnos, hash_notas, hash_ausencia);
		array_aulas[1] = new Aula(1, 30, "filosofia", array_profes[1], lista_alumnos, hash_notas, hash_ausencia);
		array_aulas[2] = new Aula(2, 40, "filosofia", array_profes[2], lista_alumnos, hash_notas, hash_ausencia);

		// Pruebas
		System.out.println("AULA 1");
		if (array_aulas[0].darClase()) {
			array_aulas[0].alumnosAprobados();
		}
		System.out.println("\nAULA 2");
		if (array_aulas[1].darClase()) {
			array_aulas[1].alumnosAprobados();
		}
		System.out.println("\nAULA 3");
		if (array_aulas[2].darClase()) {
			array_aulas[2].alumnosAprobados();
		}

	}

}
