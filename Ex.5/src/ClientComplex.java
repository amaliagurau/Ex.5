
public class ClientComplex {

public static void main(String[] args) {
	
	Complex z1 = new Complex(2, 2);
	Complex z2 = new Complex(3, 3);
	
	z1.Afisare();
	
	double modul = z1.ModulNrComplex();
	System.out.println(modul);
	
	int contor = z1.NrcomplexContor();
	System.out.println("Cate numere complexe: " + contor);
	
	Complex z3 = z1.Suma(z2);
	
	z3.Afisare();
	z1.NrcomplexContor();
}
}