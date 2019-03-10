package es.avelino.javaoca.lambdas;

import java.util.ArrayList;
import java.util.List;

public class BusquedaAnimales {

	public static void main(String[] args) {
		List<Animal> animales = new ArrayList<Animal>();
		
		animales.add(new Animal("pez", false, true));
		animales.add(new Animal("canguro", true, false));
		animales.add(new Animal("conejo", true, false));
		animales.add(new Animal("tortuga", false, true));
		
		System.out.println("Animales que pueden ladrar: ");
		imprime(animales, a -> a.puedeLadrar());
		System.out.println("Animales que pueden ladrar: ");
		imprime(animales, a -> a.puedeNadar());
	}
	
	private static void imprime(List<Animal> animales, IComprobadorAnimales comprobador) {
		for (Animal animal : animales) {
			if (comprobador.comprobar(animal)) {
				System.out.print(animal + " ");
			}
		}
		System.out.println();
	}
}
