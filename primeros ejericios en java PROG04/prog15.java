import java.util.Scanner;

public class prog15{

	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		float billet500 = 0;
		float billet50 = 0;
		float billet10 = 0;
		float billet5 = 0;
		float euro = 0;
		float cambio = 0;
		
		while(cambio <= 0){
			
			System.out.println( "introduzca una cantidad de 1 a 500");
			cambio = scan.nextFloat();
			scan.close();
		}
		
		while(cambio != 0){
			while (cambio >= 500){
				
				cambio = cambio - 500;
				billet500 = billet500 + 1;
			}
			
			while (cambio >= 50){
				
				cambio = cambio - 50;
				billet50 = billet50 + 1;
			}
			
			while (cambio >= 10){
				
				billet10 = billet10 + 1;
				cambio = cambio - 10;
			}
			
			while(cambio >= 5){
				
				cambio = cambio - 5;
				billet5 = billet5 + 1;
			}
			
			while (cambio >= 1){
			
				cambio = cambio - 1;
				euro = euro + 1;
			}
		}
		
		System.out.println("billetes 500: " + billet500); 
		System.out.println("billetes de 50: " + billet50);
		System.out.println(" billetes de 10: " + billet10);
		System.out.println( "billletes de 5: " + billet5);
		System.out.println("euros: " + euro); 
	}
}