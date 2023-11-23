package arithmetic;

public final class Arithmetic {
	private static Arithmetic instance = null;
	
	private int x;
	private int y;
	private String nom;
	
	private Arithmetic() {
		super();
	}
	
	private Arithmetic(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private Arithmetic (int x, int y, String nom) {
		this.x = x;
		this.y = y;
		this.nom = nom;
	}
	
	public static Arithmetic getInstance () {
		if (instance == null) {
			instance = new Arithmetic();
		}
		return instance;
	}
	public static Arithmetic getInstance (int x, int y, String nom) {
		if (instance == null) {
			instance = new Arithmetic (x, y, nom);
		}
		return instance;
	}
	
	public int somme (int x, int y) {
		return x+y;
	}
	
	public float mutliplication (int x, int y) {
		return x*y;
	}
	
	public int soustraction (int x, int y) {
		return x-y;
	}
	
	public float moyenne (int x, int y) {
		return somme(x, y)/2;
	}
	
	public void affiche() {
		System.out.println("\n Je suis une instance mes valeurs sont: x =" + this.x + "et y =" + this.y);
	}
	
	
}
