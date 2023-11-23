package factorymethod2_2;

public class ProduitFactory1 extends ProduitFactory {
	protected ProduitA createProduitA() {
		return new ProduitA1();
	}
}
