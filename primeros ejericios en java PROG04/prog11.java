import java.util.Scanner;

public class prog11{
	
	public static void main (String[]args){
	
		Scanner scan = new Scanner(System.in);
		float num1 =0;
		float num2 = 0;
		float resultProduct = 0;
		float resultSum = 0;
		
		System.out.println("introduca el primer numero: ");
		num1 = scan.nextFloat();
		System.out.println("introduca el primer numero: ");
		num2 = scan.nextFloat();
		scan.close();
		resultProduct = num1 * num2;
		resultSum = num1 + num1;
		
		System.out.println("Resultado del producto: " + resultProduct);
		System.out.println("Resultado de la suma: " + resultSum);
		
}
}