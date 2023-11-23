package builder_1;

abstract class MonteurAbstrait {
	protected Produit produit;
	public Produit getProduit() {
		return produit;
	}
	public void creerNouveauProduit() {
		produit = new Produit();
	}
	public abstract void construirePartieA();
	public abstract void construirePartieB();
}