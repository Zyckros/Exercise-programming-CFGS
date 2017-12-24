import java.util.Scanner;

public class prog02_ejer09  {

public static void main (String[] args){

Scanner input = new Scanner(System.in);

		int numero, d1, d2, d3, d4, d5;

		System.out.print("Ingrese un número de 5 digitos: ");
		numero = input.nextInt();

		d1 = numero % 10;
		d2 = numero % 100 / 10;
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;

		System.out.println(d5 +" "+ d4 + " " + d3 + " " + d2 + " " + d1);

}
}