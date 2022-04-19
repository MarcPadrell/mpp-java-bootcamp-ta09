package ej01;

/**
 * Clase hija Lavadora que extiende de Electrodomestico.
 * @author marcp
 *
 */
public class Lavadora extends Electrodomestico{
	
	private final int CARGA = 5;
	
	private int carga;

	public Lavadora() {
		super();
		this.carga = CARGA;
	}
	
	// Constructor con dos parametros
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga = CARGA;
	}
	
	// Constructor con 4 parametros
	public Lavadora(int precio_base, String color, char consumo_energetico, int peso, int carga) {
		super(precio_base, color, consumo_energetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	// Metodo para calcular el precio final de la Lavadora.
	public void precioFinal() {
		
		super.precioFinal();
		
		if(this.carga > 30) {
			this.precio_base += 50;
		}
		
	}
	
	

}
