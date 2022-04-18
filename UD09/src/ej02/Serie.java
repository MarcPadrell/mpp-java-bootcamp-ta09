package ej02;

public class Serie extends Pantalla {

	private final int TEMPORADAS = 3;

	private int num_temporadas;
	private String creador;

	public Serie() {
		super();
		this.num_temporadas = TEMPORADAS;
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		super(titulo);
		this.creador = creador;
		this.num_temporadas = TEMPORADAS;
		this.creador = "";
	}

	public Serie(String titulo, int num_temporadas, String genero, String creador) {
		super(titulo, genero);
		this.num_temporadas = num_temporadas;
		this.creador = creador;
	}

	public int getNum_temporadas() {
		return num_temporadas;
	}

	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [num_temporadas=" + num_temporadas + ", creador=" + creador + "]";
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
		
		Serie s1;
		
		if(a instanceof Serie){
		      s1 = (Serie)a; 
		      if(this.getNum_temporadas() > s1.getNum_temporadas()) {
		    	  System.out.println("Tiene mas temporadas la serie: "+this.getTitulo());
		      }else if(this.getNum_temporadas() < s1.getNum_temporadas()){
		    	  System.out.println("Tiene mas temporadas la serie: "+s1.getTitulo());
		      }else {
		    	  System.out.println("Tienen el mismo numero de temporadas");
		      }
		}
		
	}

}
