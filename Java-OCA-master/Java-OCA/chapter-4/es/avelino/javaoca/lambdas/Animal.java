package es.avelino.javaoca.lambdas;

public class Animal {

	private String especies;
	private boolean puedeLadrar;
	private boolean puedeNadar;
	
	public Animal (String nombreEspecies, boolean ladrador, boolean nadador) {
		especies = nombreEspecies;
		puedeLadrar = ladrador;
		puedeNadar = nadador;
	}
	
	public boolean puedeLadrar(){
	 return puedeLadrar;	
	}
	
	public boolean puedeNadar(){
		 return puedeNadar;	
		}
	
	public String toString(){
		 return especies;	
		}
}
