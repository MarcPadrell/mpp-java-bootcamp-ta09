package ej02;

public class Videojuego extends Pantalla {

	private final int HORAS = 10;

	private int horas_estimadas;
	private String companyia;

	public Videojuego() {
		super();
		this.horas_estimadas = HORAS;
		this.companyia = "";
	}

	public Videojuego(String titulo, int horas_estimadas) {
		super(titulo);
		this.horas_estimadas = horas_estimadas;
		this.companyia = "";
	}

	public Videojuego(String titulo, int horas_estimadas, String genero, String companyia) {
		super(titulo, genero);
		this.horas_estimadas = horas_estimadas;
		this.companyia = companyia;
	}

	public int getHoras_estimadas() {
		return horas_estimadas;
	}

	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}

	public String getCompanyia() {
		return companyia;
	}

	public void setCompanyia(String companyia) {
		this.companyia = companyia;
	}

	@Override
	public String toString() {
		return "Videojuego [horas_estimadas=" + horas_estimadas + ", companyia=" + companyia + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public void compareTo(Object a) {

		Videojuego v1;

		if (a instanceof Videojuego) {
			v1 = (Videojuego) a;
			if (this.getHoras_estimadas() > v1.getHoras_estimadas()) {
				System.out.println("Tiene mas horas estimadas el videojuego: " + this.getTitulo());
			} else if (this.getHoras_estimadas() < v1.getHoras_estimadas()) {
				System.out.println("Tiene mas horas estimadas el videojuego: " + v1.getTitulo());
			} else {
				System.out.println("Tienen el mismo numero de horas estimadas.");
			}
		}

	}

}
