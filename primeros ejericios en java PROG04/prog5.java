import java.util.Scanner;

public class prog5{

	public static void main (String[]args){

		Scanner scan = new Scanner(System.in);
		double num = 0;
		double comparador = 0; 
		
		for(int i =0; i< 5; i++){ 
			
			System.out.println("introduzca el numero: ");
			num = scan.nextDouble();
			
			if(num > comparador){
				comparador = num;
			}
		}
		
		System.out.println("El numero mayor es: " + comparador);
		scan.close();
	}
}
