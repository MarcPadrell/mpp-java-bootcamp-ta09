package ej03;

public class LibroApp {

	public static void main(String[] args) {

		Libro libro1 = new Libro(10, "La vida de Doble -P", "Arnau Gomez", 150);
		Libro libro2 = new Libro(20, "Workbook", "Mr. Michael", 500);

		System.out.println("Libro 1: " + libro1);
		System.out.println("Libro 2: " + libro2);

		if (libro1.getNum_pag() > libro2.getNum_pag()) {
			System.out.println("Tiene más páginas el libro: " + libro1);
		} else {
			System.out.println("Tiene más páginas el libro: " + libro2);
		}

	}

}
