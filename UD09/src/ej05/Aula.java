package ej05;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class Aula {

	private int id;
	private int max_estudiants;
	private String materia_destinada;
	private Profesores profesor;
	private ArrayList<Alumnos> lista_alumnos;
	private Hashtable<String, Double> hash_notas;
	private Hashtable<String, Boolean> hash_ausencia;

	public Aula(int id, int max_estudiants, String materia_destinada, Profesores profesor,
			ArrayList<Alumnos> lista_alumnos, Hashtable<String, Double> hash_notas,
			Hashtable<String, Boolean> hash_ausencia) {
		this.id = id;
		this.max_estudiants = max_estudiants;
		this.materia_destinada = materia_destinada.toLowerCase();
		this.profesor = profesor;
		this.lista_alumnos = lista_alumnos;
		this.hash_notas = hash_notas;
		this.hash_ausencia = hash_ausencia;
	}

	public boolean darClase() {

		ponerNotas();

		if (this.profesor.getMateria().equals(this.materia_destinada.toLowerCase())
				&& comprobarAsistencia(hash_ausencia)) {
			System.out.println("Se puede dar clase!! :)");
			return true;
		} else {
			System.out.println("No se puede dar clase!! :(");
			return false;
		}

	}

	private int ponerAsistencia() {

		int contador = 0;
		
		Iterator<Alumnos> it = lista_alumnos.iterator();
		while (it.hasNext()) {
			Alumnos alumno = it.next();
			boolean ausencia = alumno.probabilidadAusencia();
			hash_ausencia.put(alumno.getNombre(), ausencia);
			if(!ausencia) {
				contador++;
			}
		}
		
		return contador;

	}

	private boolean comprobarAsistencia(Hashtable<String, Boolean> hash_ausencia) {

		if (ponerAsistencia() > lista_alumnos.size()/2) {
			return true;
		} else {
			return false;
		}

	}

	public void ponerNotas() {

		Iterator<Alumnos> it = lista_alumnos.iterator();
		while (it.hasNext()) {
			Alumnos alumno = it.next();
			hash_notas.put(alumno.getNombre(), alumno.getCalificacion());
		}

	}

	public void alumnosAprobados() {

		int contador_masculino = 0;
		int contador_femenino = 0;

		Iterator<Alumnos> it = lista_alumnos.iterator();
		while (it.hasNext()) {
			Alumnos alumno = it.next();
			if (hash_notas.get(alumno.getNombre()) >= 5.0) {
				if (alumno.getSexo().toLowerCase().equals("femenino")) {
					contador_femenino++;
				} else {
					contador_masculino++;
				}
			}

		}

		System.out.println("Alumnas aprobadas: " + contador_femenino);
		System.out.println("Alumnos aprobados: " + contador_masculino);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMax_estudiants() {
		return max_estudiants;
	}

	public void setMax_estudiants(int max_estudiants) {
		this.max_estudiants = max_estudiants;
	}

	public String getMateria_destinada() {
		return materia_destinada;
	}

	public void setMateria_destinada(String materia_destinada) {
		this.materia_destinada = materia_destinada;
	}

	public Profesores getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesores profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumnos> getLista_alumnos() {
		return lista_alumnos;
	}

	public void setLista_alumnos(ArrayList<Alumnos> lista_alumnos) {
		this.lista_alumnos = lista_alumnos;
	}

	public Hashtable<String, Double> getHash_notas() {
		return hash_notas;
	}

	public void setHash_notas(Hashtable<String, Double> hash_notas) {
		this.hash_notas = hash_notas;
	}

	public Hashtable<String, Boolean> getHash_ausencia() {
		return hash_ausencia;
	}

	public void setHash_ausencia(Hashtable<String, Boolean> hash_ausencia) {
		this.hash_ausencia = hash_ausencia;
	}
	
	

}
