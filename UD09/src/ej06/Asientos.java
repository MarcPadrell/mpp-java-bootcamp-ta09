package ej06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Asientos {

	private int filas;
	private int columnas;
	private ArrayList<Espectador> list_espectadores;
	private Hashtable<String, Boolean> hash_dinero;
	private Hashtable<String, Boolean> hash_edad;
	private Hashtable<String, String> hash_asiento;
	private Cine cine;

	public Asientos(int filas, int columnas, ArrayList<Espectador> list_espectadores,
			Hashtable<String, Boolean> hash_dinero, Hashtable<String, Boolean> hash_edad,
			Hashtable<String, String> hash_asiento, Cine cine) {
		this.filas = filas;
		this.columnas = columnas;
		this.list_espectadores = list_espectadores;
		this.hash_dinero = hash_dinero;
		this.hash_edad = hash_edad;
		this.hash_asiento = hash_asiento;
		this.cine = cine;
	}

	public char[][] crearTabla() {

		char[][] asientos = new char[this.filas][this.columnas];
		char array_num[] = { '8', '7', '6', '5', '4', '3', '2', '1' };
		char array_letras[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		int contador = 0;

		for (int i = 0; i < filas; i++) {
			contador = 0;
			for (int j = 0; j < columnas; j++) {

				if (j % 2 == 0) {
					asientos[i][j] = array_num[i];
				} else {
					asientos[i][j] = (char) array_letras[contador];
					contador++;
				}

			}

		}

		return asientos;

	}

	public void mostrarMatriz(char[][] matriz) {

		for (int x = 0; x < matriz.length; x++) {
			System.out.print("|");
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y]);
				if (y != matriz[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}
	}

	public void ponerBooleanDinero() {

		hash_dinero.clear();

		Iterator<Espectador> it = list_espectadores.iterator();
		while (it.hasNext()) {
			Espectador espectador = it.next();
			if (cine.getPrecio_entrada() <= espectador.getDinero()) {
				hash_dinero.put(espectador.getNombre(), true);
			} else {
				hash_dinero.put(espectador.getNombre(), false);
			}

		}

	}

	public void ponerBooleanEdad() {

		hash_edad.clear();

		Iterator<Espectador> it = list_espectadores.iterator();
		while (it.hasNext()) {
			Espectador espectador = it.next();
			if (cine.getPelicula().getEdad_minima() <= espectador.getEdad()) {
				hash_edad.put(espectador.getNombre(), true);
			} else {
				hash_edad.put(espectador.getNombre(), false);
			}

		}

	}

	public int numAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
	}

	private Set<String> randomAsiento() {

		char array_num[] = { '8', '7', '6', '5', '4', '3', '2', '1' };
		char array_letras[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		String str[] = new String[list_espectadores.size()];
		Set<String> miSet = new HashSet<String>();

		for (int i = 0; i < str.length; i++) {
			char numero = array_num[numAleatorio(0, 7)];
			char letra = array_letras[numAleatorio(0, 9)];
			String concatenation = "" + numero + letra;
			miSet.add(concatenation);
		}

		return miSet;

	}

	/*
	 * private boolean detectarDuplicado(String[] array_string, String asiento) {
	 * 
	 * boolean duplicado = false;
	 * 
	 * if (array_string.length > 1) { for (int i = 0; i < array_string.length; i++)
	 * { if (array_string[i].equals(asiento)) { duplicado = true; } } }
	 * 
	 * return duplicado;
	 * 
	 * }
	 */

	public void sentarGente() {

		hash_asiento.clear();

		Iterator<String> it1 = randomAsiento().iterator();
		Iterator<Espectador> it = list_espectadores.iterator();
		while (it.hasNext() && it1.hasNext()) {
			Espectador espectador = it.next();
			String asiento = it1.next();
			if (hash_dinero.get(espectador.getNombre()) && hash_edad.get(espectador.getNombre())) {
				hash_asiento.put(espectador.getNombre(), asiento);
			}
		}

	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public ArrayList<Espectador> getList_espectadores() {
		return list_espectadores;
	}

	public void setList_espectadores(ArrayList<Espectador> list_espectadores) {
		this.list_espectadores = list_espectadores;
	}

	public Hashtable<String, Boolean> getHash_dinero() {
		return hash_dinero;
	}

	public void setHash_dinero(Hashtable<String, Boolean> hash_dinero) {
		this.hash_dinero = hash_dinero;
	}

	public Hashtable<String, Boolean> getHash_edad() {
		return hash_edad;
	}

	public void setHash_edad(Hashtable<String, Boolean> hash_edad) {
		this.hash_edad = hash_edad;
	}

	public Hashtable<String, String> getHash_asiento() {
		return hash_asiento;
	}

	public void setHash_asiento(Hashtable<String, String> hash_asiento) {
		this.hash_asiento = hash_asiento;
	}

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}

	@Override
	public String toString() {
		return "Asientos [filas=" + filas + ", columnas=" + columnas + ", list_espectadores=" + list_espectadores
				+ ", hash_dinero=" + hash_dinero + ", hash_edad=" + hash_edad + ", hash_asiento=" + hash_asiento
				+ ", cine=" + cine + "]";
	}

}
