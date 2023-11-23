package builder_2;

public class Client {
	public static void main(String[] args) {
		Directeur directeur = new Directeur();
		MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
		MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
		MonteurPizza monteurPizzaLocale = new MonteurPizzaLocale();
		
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
		
		directeur.setMonteurPizza(monteurPizzaLocale);
		directeur.construirePizza();
		Pizza pizzaLocale = directeur.getPizza();
		System.out.println("Pizza Locale");
		pizzaLocale.print();
		
	}
}
