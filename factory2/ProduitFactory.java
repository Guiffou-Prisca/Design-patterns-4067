package factory2;

public abstract class ProduitFactory {
	public ProduitA getProduitA() {
		return createProduitA();
	}
	
	protected abstract ProduitA createProduitA();
}
