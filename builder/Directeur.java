package builder;

public class Directeur {
	private MonteurPizza monteurPizza;
	
	public void setMonteurPizza(MonteurPizza monteurPizza) {
		this.monteurPizza = monteurPizza;
	}
	
	public Pizza getPizza() {
		return monteurPizza.getPizza();
	}
	
	public void construirePizza() {
		monteurPizza.creerNouvellePizza();
		monteurPizza.monterPate();
		monteurPizza.monterSauce();
		monteurPizza.monterGarniture();
	}
}
