package ej03;

public class Libro {

	private int isbn;
	private String titulo;
	private String autor;
	private int num_pag;

	public Libro() {
		this(0, "", "", 0);
	}

	public Libro(int isbn, String titulo, String autor, int num_pag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.num_pag = num_pag;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNum_pag() {
		return num_pag;
	}

	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}

	@Override
	public String toString() {
		return "El libro con ISBN: "+isbn+" creado por "+autor+" tiene "+num_pag+" páginas.";
	}

	

}
