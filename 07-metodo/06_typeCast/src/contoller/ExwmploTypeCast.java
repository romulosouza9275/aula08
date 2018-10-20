package contoller;
public class ExwmploTypeCast {
	public static void main (String[] args) {
		int a = 5, b = 2;
		int c;
		 
	c = a / b ;
	System.out.println("valor de c: " + c);
	
	double d;
	d = a/ b ;
	System.out.println("Valor de D: " + d);
	double e;
    //conversão explícita
	e = (double) a / b;
	
	float f = 14.5f;
	//conversão implícita.
	e= f;
	System.out.println("Valor de E: "+ e);
	
	
	
	}

}
