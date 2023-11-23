package builder_1;

public class Directeur {
	private MonteurAbstrait monteurAbstrait;
	//Methode pour definir le monteur abstrait
	public void setMonteurAbstrait(MonteurAbstrait monteurAbstrait) {
		this.monteurAbstrait = monteurAbstrait;
	}
	//Methode pour obtenir le produit construit
	public Produit getProduit() {
		return monteurAbstrait.getProduit();
	}
	//Methode pour construire le produit en utilisant le monteur abstrait
	public void construire() {
		monteurAbstrait.creerNouveauProduit();
		monteurAbstrait.construirePartieA();
		monteurAbstrait.construirePartieB();
	}
}