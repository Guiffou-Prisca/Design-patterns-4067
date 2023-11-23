package factorymethod2_2;

public class ProduitFactory2 extends ProduitFactory {
	protected ProduitA createProduitA() {
		return new ProduitA2();
	}
}
