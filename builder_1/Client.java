package builder_1;

public class Client {

	public static void main(String[] args) {
		//Creation du directeur
		Directeur directeur = new Directeur();
		//Creation du monteur concret
		MonteurAbstrait monteurConcret = new MonteurConcret();
		//Configuration du directeur avec le monteur concret
		directeur.setMonteurAbstrait(monteurConcret);
		//Construction du produit par le directeur
		directeur.construire();
		//Recuperation du produit construit
		Produit produit = directeur.getProduit();
		
		//Affichage du produit complet
		System.out.println("Produit complet");
		produit.print();

	}

}
