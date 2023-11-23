package builder_1;

public class Produit {
	private String partieA = "";
	private String partieB = "";
	
	public void setPartieA(String partieA) {
		this.partieA = partieA;
	}
	
	public void setPartieB(String partieB) {
		this.partieB = partieB;
	}
	
	public void print() {
		System.out.println(this.toString());
		System.out.println("PartieA="+partieA + "PartieB=" + partieB);
	}
}
