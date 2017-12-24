import java.util.Scanner;

public class prog14{
	
	public static void main(String[]args){
	
	Scanner scan = new Scanner(System.in);
	float num = 0;
	float numNegative= 0;
	float compare= 0;
	
		do{
			
			System.out.println("Introduzca un numero:");
			num = scan.nextFloat();
			
			if(num>compare){
				compare = num;
			}
			
			if(num<0){
				numNegative = num; 
			}
			
		}while(num != 0);
		
			System.out.println("Este es el numero mayor: " + compare);
			System.out.println("este es el numero negativo: " + numNegative);
			scan.close();
		}	
	
}