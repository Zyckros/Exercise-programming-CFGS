import java.util.Scanner;

public class prog22{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n = 0;
		float num = 0;
		float resultado = 0;
		int i=0;
		
		while(num >= 0){ 
			resultado = resultado + num;
			System.out.println("introducir nota:");
			num = scan.nextFloat();
			i += 1;
		}
		i -=1;
		resultado = (resultado / i);
		System.out.println("la nota media de los examenes es de: " + resultado);
	}	
}