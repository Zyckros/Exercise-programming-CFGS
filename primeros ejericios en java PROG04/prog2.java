import java.util.Scanner;

public class prog2{
	
	public static void main(String [] args){ 
	
		Scanner scan = new Scanner(System.in);
		double n = 0;
		double radio = 0;
		double area = 0;
		double r = 0;

		System.out.println("introduzca un nuemro");
		n = scan.nextDouble();
		scan.close();
		r = Math.PI;
		radio = n * 2;
		area = r * (n * n);
		System.out.println("La longitud es: " + radio);
		System.out.println("El area es: " + area);
	}
}