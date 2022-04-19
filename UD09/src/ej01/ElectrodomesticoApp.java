package ej01;

/**
 * Clase Main para instanciar los diferentes tipos de electrodomesticos.
 * @author marcp
 *
 */
public class ElectrodomesticoApp {

	public static void main(String[] args) {

		Electrodomestico array_electrodomesticos[] = new Electrodomestico[10];
		int precio_electrodomesticos = 0;
		int precio_television = 0;
		int precio_lavadora = 0;
		
		// Añadimos diferentes objetos al array de electrodomesticos
		array_electrodomesticos[0] = new Electrodomestico();
		array_electrodomesticos[1] = new Electrodomestico(300, 80);
		array_electrodomesticos[2] = new Electrodomestico(150, "lila", 'H', 100);
		array_electrodomesticos[3] = new Television();
		array_electrodomesticos[4] = new Television(80, 60);
		array_electrodomesticos[5] = new Television(80, "blanco", 'A', 10, 20, true);
		array_electrodomesticos[6] = new Lavadora();
		array_electrodomesticos[7] = new Lavadora(100, 50);
		array_electrodomesticos[8] = new Lavadora(20, "azul", 'E', 70, 90);
		array_electrodomesticos[9] = new Television();
		
		// Mostramos el precio de cada electrodomestico y lo guardamos en una variable dependiendo del tipo.
		for (int i = 0; i < array_electrodomesticos.length; i++) {

			array_electrodomesticos[i].precioFinal();
			System.out.println("Electrodomestico número " + i + " tiene un precio final: "
					+ array_electrodomesticos[i].getPrecio_base());

			if (array_electrodomesticos[i] instanceof Television) {
				precio_television += array_electrodomesticos[i].getPrecio_base();
			} else if (array_electrodomesticos[i] instanceof Lavadora) {
				precio_lavadora += array_electrodomesticos[i].getPrecio_base();
			} else {
				precio_electrodomesticos += array_electrodomesticos[i].getPrecio_base();
			}

		}

		System.out.println("Precio final de los Electrodomesticos: " + precio_electrodomesticos);
		System.out.println("Precio final de las Televisiones: " + precio_television);
		System.out.println("Precio final de las Lavadoras: " + precio_lavadora);
		System.out.println("Precio total: " + (precio_electrodomesticos + precio_lavadora + precio_television));

	}

}
