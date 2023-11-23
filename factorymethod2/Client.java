package factorymethod2;


public class Client {
	public static void main(String[] args) {
		ProduitFactory produitFactory = new ProduitFactory();
		
		ProduitA produitA = null;
		
		produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
		produitA.methodA();
		
		produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
		produitA.methodA();
		
		produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
		produitA.methodA();
		
		produitA = produitFactory.getProduitA(4);
		produitA.methodA();
	}
}
