package ej04;

public class RaicesApp {

	public static void main(String[] args) {

		Raices raiz1 = new Raices(5, 10, 2);

		System.out.println("RAIZ 1");
		raiz1.calcular();
		raiz1.ObtenerRaices();
		raiz1.ObtenerRaiz();

		Raices raiz2 = new Raices(1, -2, 1);

		System.out.println("\nRAIZ 2");
		raiz2.calcular();
		raiz2.ObtenerRaices();
		raiz2.ObtenerRaiz();

		Raices raiz3 = new Raices(7, 0, 5);

		System.out.println("\nRAIZ 3");
		raiz3.calcular();
		raiz3.ObtenerRaices();
		raiz3.ObtenerRaiz();

	}

}
