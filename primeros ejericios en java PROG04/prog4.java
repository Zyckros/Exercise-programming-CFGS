import java.util.Scanner;

public class prog4{
	
	public static void main (String [] args){
	
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int count = 1;
		int positivos = 0;
		int negativos = 0;
		int nulos = 0;
		
		for(int i =1; i<5; i++){ 
			
			System.out.println("introduzca el numero: ");
			num[count] = scan.nextInt();
			
			if(num[count] < 0){
				negativos = negativos + 1;
		
			}else{
				
				if(num[count] > 0){
					positivos = positivos + 1;
					
				}else{
					nulos = nulos + 1;
				}
			}
			count = count + 1;
		}
			
		System.out.println( "Los numeros positivos son: " + positivos);
		System.out.println("Los numeros negativos son: " + negativos);
		System.out.println("Los numeros nulos son: " + nulos);
	}
}
	
