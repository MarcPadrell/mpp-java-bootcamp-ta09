package ej05;

public class Alumnos extends Personas {

	private double CALIFICACION = 0.0;

	private double calificacion;

	public Alumnos() {
		super();
		this.calificacion = CALIFICACION;
	}

	public Alumnos(String nombre, int edad, String sexo, double calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public boolean probabilidadAusencia() {

		int numeroAleatorio = (int) (Math.random() * 100);

		if (numeroAleatorio < 50) {
			return false;
		} else {
			return true;
		}

	}

}
