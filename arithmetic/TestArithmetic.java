package arithmetic;

public class TestArithmetic {
	public static void main(String[] args) {
		int som = Arithmetic.getInstance().somme(2, 5);
		
		System.out.printf("La somme est %d", som);
		
		Arithmetic s1 = Arithmetic.getInstance(8,3, null);
		s1.affiche();
		
		Arithmetic s2 = Arithmetic.getInstance(5,9, null);
		s2.affiche();
		
	}
}
