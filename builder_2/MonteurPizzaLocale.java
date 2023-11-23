package builder_2;

public class MonteurPizzaLocale extends MonteurPizza {
	public void monterPate() {
		pizza.setPate("locale");
	}
	
	public void monterSauce() {
		pizza.setSauce("jaune");
	}
	
	public void monterGarniture() {
		pizza.setGarniture("ingredients bio");
	}
}
