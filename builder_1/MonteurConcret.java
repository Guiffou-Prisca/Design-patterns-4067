package builder_1;


class MonteurConcret extends MonteurAbstrait {
	
	public void construirePartieA() {
		produit.setPartieA("Voici la partie A \n");
	}
	
	public void construirePartieB() {
		produit.setPartieB("Voici la partie B \n") ;
	}
	public Produit getProduit() {
		System.out.println(" Voici le Produit");
		return produit;
	}
}
	
