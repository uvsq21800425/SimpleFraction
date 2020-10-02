public class Fraction {
	
	private int a;
	private int b;
	private double resultat;
	
	public Fraction(int a,int b) {
		this.a = a;
		this.b = b;
		this.resultat = (double)a/b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public double getResultat() {
		return resultat;
	}
	
	public String toString() {
		String str = a + "/" + b + " = " + resultat;
		return str;
	}
}