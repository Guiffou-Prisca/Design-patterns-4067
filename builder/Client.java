package builder;

public class Client {
	public static void main(String[] args) {
		Directeur directeur = new Directeur();
		MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
		MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
		
		directeur.setMonteurPizza(monteurPizzaPiquante);
		directeur.construirePizza();
		Pizza pizzaPiquante = directeur.getPizza();
		System.out.println("Pizza Piquante");
		pizzaPiquante.print();
		
		directeur.setMonteurPizza(monteurPizzaReine);
		directeur.construirePizza();
		Pizza pizzaReine = directeur.getPizza();
		System.out.println("Pizza Reine");
		pizzaReine.print();
		
	}
}
