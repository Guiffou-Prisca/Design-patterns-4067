package factory2;

public class Client {
	public static void main(String[] args) {
		ProduitFactory produitFactory1= new ProduitFactory1();
		ProduitFactory produitFactory2 = new ProduitFactory2();
		ProduitFactory produitFactory3 = new ProduitFactory3();
		
		ProduitA produitA = null;
		
		System.out.println("Utilisation de la 1ere fabrique");
		produitA = produitFactory1.getProduitA();
		produitA.methodA();
		
		System.out.println("Utilisation de la 2nde fabrique");
		produitA = produitFactory2.getProduitA();
		produitA.methodA();
		
		System.out.println("Utilisation de la 3nde fabrique");
		produitA = produitFactory3.getProduitA();
		produitA.methodA();
	}
}
