package ej05;

import java.util.Arrays;

public class Profesores extends Personas {

	private final String MATERIA = "matematicas";

	private String materia;

	public Profesores() {
		super();
		this.materia = MATERIA;
	}

	public Profesores(String nombre, int edad, String sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = comprobarMateria(materia);
	}

	private String comprobarMateria(String materia) {

		String materia_lower = materia.toLowerCase();
		String[] materias = { "matematicas", "filosofia", "fisica" };

		if (Arrays.asList(materias).contains(materia_lower)) {
			return materia;
		} else {
			return MATERIA;
		}
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public boolean probabilidadAusencia() {

		int numeroAleatorio = (int) (Math.random() * 100);

		if (numeroAleatorio < 20) {
			return false;
		} else {
			return true;
		}

	}

}
