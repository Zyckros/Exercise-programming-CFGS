import java.util.Scanner;

public class prog10{

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		Double num = 0.0;
		Double result = 0.0;
		
		while(num >= 0){

			result = result + num;
			System.out.println("introduzca un numero: ");
			num = scan.nextDouble();
		}
		
		System.out.println("resultado: " + result);
		scan.close();
	}
}