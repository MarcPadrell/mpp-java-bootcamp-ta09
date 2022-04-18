package ej01;

import java.util.Arrays;
import java.util.Hashtable;

public class Electrodomestico {

	// Constantes
	final protected String BLANCO = "blanco";
	final protected char CONSUMO = 'F';
	final protected int PRECIO = 100;
	final protected int PESO = 5;

	// Atributos
	protected int precio_base;
	protected String color;
	protected char consumo_energetico;
	protected int peso;

	// Constructor por defecto
	public Electrodomestico() {
		this.precio_base = PRECIO;
		this.color = BLANCO;
		this.consumo_energetico = CONSUMO;
		this.peso = PESO;
	}

	public Electrodomestico(int precio_base, int peso) {
		this.precio_base = precio_base;
		this.color = BLANCO;
		this.consumo_energetico = CONSUMO;
		this.peso = peso;
	}

	// Constructor verificando el color
	public Electrodomestico(int precio_base, String color, char consumo_energetico, int peso) {
		this.precio_base = precio_base;
		this.color = comprobarColor(color);
		this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
		this.peso = peso;
	}

	/**
	 * Funion para verificar que la letra del consumo energetico es correcta
	 * 
	 * @param a
	 * @return
	 */
	private char comprobarConsumoEnergetico(char a) {

		Character[] lletres = { 'A', 'B', 'C', 'D', 'E', 'F'};

		if (Arrays.asList(lletres).contains(a)) {
			return a;
		} else {
			return CONSUMO;
		}

	}

	/**
	 * Funcion para verificar si el color intoducido es correcto, si no lo es se
	 * pondra el Blanco
	 * 
	 * @param c
	 * @return
	 */
	private String comprobarColor(String c) {

		String color_lower = c.toLowerCase();
		String[] colors = { "blanco", "negro", "rojo", "azul", "gris" };

		if (Arrays.asList(colors).contains(color_lower)) {
			return color_lower;
		} else {
			return BLANCO;
		}
	}

	public void precioFinal() {

		Hashtable<Character, Integer> letra_precio = new Hashtable<Character, Integer>();

		letra_precio.put('A', 100);
		letra_precio.put('B', 80);
		letra_precio.put('C', 60);
		letra_precio.put('D', 50);
		letra_precio.put('E', 30);
		letra_precio.put('F', 10);

		this.precio_base += letra_precio.get(this.consumo_energetico);

		if (this.peso >= 0 && this.peso <= 19) {
			this.precio_base += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precio_base += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precio_base += 80;
		} else {
			this.precio_base += 100;
		}

	}

	public int getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(int precio_base) {
		this.precio_base = precio_base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = comprobarColor(color);
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}

}
