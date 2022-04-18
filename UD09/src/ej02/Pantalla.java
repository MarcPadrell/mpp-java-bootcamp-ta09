package ej02;

public abstract class Pantalla {

	protected final boolean ENTREGADO = false;

	protected String titulo;
	protected boolean entregado;
	protected String genero;

	public Pantalla() {
		this.titulo = "";
		this.entregado = ENTREGADO;
		this.genero = "";
	}

	public Pantalla(String titulo) {
		this.titulo = titulo;
		this.entregado = ENTREGADO;
		this.genero = "";
	}

	public Pantalla(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
		this.entregado = ENTREGADO;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pantalla [titulo=" + titulo + ", entregado=" + entregado + ", genero=" + genero + "]";
	}
	
	public abstract void entregar();
	
	public abstract void devolver();
	
	public abstract boolean isEntregado();
	
	public abstract void compareTo(Object a);
	

}
