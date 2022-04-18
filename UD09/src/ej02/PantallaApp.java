package ej02;

public class PantallaApp {

	public static void main(String[] args) {

		Serie[] array_series = new Serie[5];
		Videojuego[] array_videojuego = new Videojuego[5];
		int contador = 0;

		array_series[0] = new Serie();
		array_series[1] = new Serie("Breaking Bad", "Marc Padrell");
		array_series[2] = new Serie("Los 100", 4, "Aventuras", "Cristian Rodriguez");
		array_series[3] = new Serie("Friends", "Eduard Palacios");
		array_series[4] = new Serie("Vis a Vis", 5, "Terror", "Joan Laporta");

		array_videojuego[0] = new Videojuego();
		array_videojuego[1] = new Videojuego("Uncharted", 500);
		array_videojuego[2] = new Videojuego("CoD", 800, "Accion", "Activision");
		array_videojuego[3] = new Videojuego("Fifa", 200);
		array_videojuego[4] = new Videojuego("Far Cray", 800, "Aventuras", "Ubisoft");

		// Entregamos un par de series
		array_series[2].entregar();
		array_series[3].entregar();

		// Entregamos un par de videojuegos
		array_videojuego[2].entregar();
		array_videojuego[3].entregar();

		for (int i = 0; i < array_series.length; i++) {

			if (array_series[i].isEntregado()) {
				System.out.println("Serie entregada!!: " + array_series[i]);
				contador++;
			}

		}

		for (int i = 0; i < array_series.length; i++) {

			if (array_videojuego[i].isEntregado()) {
				System.out.println("Videjuego entregado!!: " + array_videojuego[i]);
				contador++;
			}

		}

		System.out.println("Hay un total de " + contador + " series y videjuegos entregados!");

		// Mostramos el videojuego con mas horas estimadas
		array_videojuego[1].compareTo(array_videojuego[2]);

		// Mostramos la serie con mas temporadas
		array_series[2].compareTo(array_series[4]);

	}

}
