package ej06;

import java.util.ArrayList;
import java.util.Hashtable;

public class CineApp {

	public static void main(String[] args) {

		// Creamos las películas
		Peliculas[] peliculas = new Peliculas[2];
		peliculas[0] = new Peliculas("Uncharted", 120, 5, "Eduard");
		peliculas[1] = new Peliculas("Ratonpolis", 200, 10, "Madaleno");

		// Creamos los Cines
		Cine[] cines = new Cine[2];
		cines[0] = new Cine(peliculas[0], 10.0);
		cines[1] = new Cine(peliculas[1], 40);

		// Creamos los espectadores
		ArrayList<Espectador> list_espectadores = new ArrayList<Espectador>();
		list_espectadores.add(new Espectador("Palacios", 6, 20.5));
		list_espectadores.add(new Espectador("Arnau", 10, 5.2));
		list_espectadores.add(new Espectador("Padrino", 40, 9.5));
		list_espectadores.add(new Espectador("Ester", 56, 46.2));
		list_espectadores.add(new Espectador("Enric", 21, 30.5));
		list_espectadores.add(new Espectador("Helen", 2, 25.0));
		list_espectadores.add(new Espectador("David", 9, 7));
		list_espectadores.add(new Espectador("Tete", 12, 35.2));
		list_espectadores.add(new Espectador("Roger", 80, 28.5));
		list_espectadores.add(new Espectador("Octavio", 23, 5.0));
		list_espectadores.add(new Espectador("Daniel", 2, 1.5));
		list_espectadores.add(new Espectador("Marina", 16, 8.9));
		list_espectadores.add(new Espectador("Mar", 65, 39.6));
		list_espectadores.add(new Espectador("Jose", 25, 95.2));
		list_espectadores.add(new Espectador("Yolanda", 50, 1.8));
		list_espectadores.add(new Espectador("Marc", 26, 49.2));

		// Creamos las Hashtables
		Hashtable<String, Boolean> hash_dinero = new Hashtable<String, Boolean>();
		Hashtable<String, Boolean> hash_edad = new Hashtable<String, Boolean>();
		Hashtable<String, String> hash_asiento = new Hashtable<String, String>();

		// Creamos los Asientos
		Asientos[] array_asientos = new Asientos[2];
		array_asientos[0] = new Asientos(8, 10, list_espectadores, hash_dinero, hash_edad, hash_asiento, cines[0]);
		array_asientos[1] = new Asientos(8, 10, list_espectadores, hash_dinero, hash_edad, hash_asiento, cines[1]);

		array_asientos[0].ponerBooleanDinero();
		array_asientos[0].ponerBooleanEdad();
		array_asientos[0].sentarGente();
		
		System.out.println("\nSALA 1");
		array_asientos[0].mostrarMatriz(array_asientos[0].crearTabla()); 
		array_asientos[0].mostrarEspectadores();
		array_asientos[0].mostrarDinero();
		array_asientos[0].mostrarEdad();

		array_asientos[1].ponerBooleanDinero();
		array_asientos[1].ponerBooleanEdad();
		array_asientos[1].sentarGente();
		
		System.out.println("\nSALA 2");
		array_asientos[0].mostrarMatriz(array_asientos[0].crearTabla()); 
		array_asientos[1].mostrarEspectadores();
		array_asientos[1].mostrarDinero();
		array_asientos[1].mostrarEdad();

	}

}
