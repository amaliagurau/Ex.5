
public class Complex {
	
	private double a, b;
	private static int contor = 0;

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
		contor++;
	}
	
	public double ModulNrComplex() {
		double modulnr = Math.sqrt((a*a + b*b));
		return modulnr;	
	}
	
	public void Afisare () {
		System.out.println("Numarul complex: " + a + " i * " + b );
	}
	
	public Complex Suma(Complex z) {
		Complex S = new Complex(z.a, z.b) ;
		S.a = S.a + a;
		S.b = S.b + b;
		return S;
	}
	
	public int NrcomplexContor () {
		return contor;
	}
	
}
