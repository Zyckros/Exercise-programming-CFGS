import java.util.Scanner;

public class prog6{
	
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		int num1 =0;
		int num2 =0;
		int num3 =0;
	
		System.out.println("introduzca el primer numero: ");
		num1 = scan.nextInt();
		System.out.println("introduzca el segundo numero: ");
		num2 = scan.nextInt();
		System.out.println("introduzca el tercer numero: ");
		num3 = scan.nextInt();
		scan.close();

		if(num1 < num2 && num1 < num3 && num2 < num3){
			System.out.println("orden ascendente " + num1 + " " + num2 + " " + num3);
		}
		if(num1 < num2 && num1 < num3 && num2 > num3){
			System.out.println( "orden ascendente " + num1 + " " + num3 + " " + num2);
		}
		if( num1 > num2 && num1 < num3 && num2 < num3){
			System.out.println( "orden ascendente " + num2 + " " + num1 + " " + num3);
		}
		if( num1 > num2 && num1 > num3 && num2 < num3){
			System.out.println( "orden ascendente " + num2 + " " + num3 + " " + num1);	
		}
		if(num1 > num2 && num1 > num3 && num2 > num3){
			System.out.println( "orden ascendente " + num3 + " " + num2 + " " + num1);	
		}
		if(num1 < num2 && num1 > num3 && num2 > num3){ 
		System.out.println( "orden ascendente " + num3 + " " + num1 + " " + num2);
		}							
	}
}