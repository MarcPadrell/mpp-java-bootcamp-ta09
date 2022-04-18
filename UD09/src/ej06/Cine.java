package ej06;

public class Cine {

	private Peliculas pelicula;
	private double precio_entrada;

	public Cine(Peliculas pelicula, double precio_entrada) {
		this.pelicula = pelicula;
		this.precio_entrada = precio_entrada;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio_entrada() {
		return precio_entrada;
	}

	public void setPrecio_entrada(double precio_entrada) {
		this.precio_entrada = precio_entrada;
	}
	
	

}
