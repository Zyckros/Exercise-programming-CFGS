import java.util.Scanner;

public class prog3{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double num1 =0;
		double num2 = 0;
		double suma =0;
		double resta =0;
		double multiplicacion = 0;
		double division = 0;

		System.out.println("introduzca el primer numero: ");
		num1 = scan.nextDouble();
		System.out.println("introduzca el segundo numero: ");
		num2 = scan.nextDouble();
		scan.close();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		
		System.out.println("este es el resultado de la suma: " + suma);
		System.out.println("este es el resultado de la resta: " + resta);
		System.out.println("este es el resultado de la multiplicacion: " + multiplicacion);
		System.out.println("este es el resultado de la division: " + division);
	}
}