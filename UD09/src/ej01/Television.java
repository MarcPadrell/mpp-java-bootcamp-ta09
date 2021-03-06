package ej01;

/**
 * Clase hija Television que hereda de Electrodomestico.
 * @author marcp
 *
 */
public class Television extends Electrodomestico {
	
	// Constantes
	private final int RESOLUCION = 20;
	private final boolean SINTONIZADOR = false;

	private int resolucion;
	private boolean sintonizador_tdt;
	
	/*Constructores*/
	
	public Television() {
		super();
	}

	public Television(int precio, int peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION;
		this.sintonizador_tdt = SINTONIZADOR;
	}
	
	public Television(int precio_base, String color, char consumo_energetico, int peso, int pulgadas,
			boolean sintonizador_tdt) {
		super(precio_base, color, consumo_energetico, peso);
		this.resolucion = pulgadas;
		this.sintonizador_tdt = sintonizador_tdt;
	}

	public int getPulgadas() {
		return resolucion;
	}

	public boolean isSintonizador_tdt() {
		return sintonizador_tdt;
	}
	
	/**
	 * Metodo para calcular i sumar a su precio base un plus debido a la resolucion o por el sintonizador.
	 */
	public void precioFinal() {

		super.precioFinal();

		if (this.resolucion > 40) {
			this.precio_base = (int) (this.precio_base + 0.3 * this.precio_base);
		} else if (isSintonizador_tdt()) {
			this.precio_base += 50;
		}

	}

}
