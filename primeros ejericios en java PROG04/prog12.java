import java.util.Scanner;

public class prog12{
	
	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		float num =0;
	 	num = -1;
		
	while(num<0 || num>10){ 
		
		System.out.println("Introducir la nota del alumno: "); 
		num = scan.nextFloat();	
		
		if(num<0 || num>10){
			System.out.println("Nota incorrecta, vuelva a intentarlo.");
		}
	}
	
	if(num>=0 && num<=4.99){
		System.out.println("Suspenso.");

	}else{
		
		if(num >=5 && num <= 6.99){
			System.out.println("Aprobado.");
		}
			
			if(num >=7 && num <= 8.99){
				System.out.println("Notable.");
				
			}else{
				
				if(num >=7 && num <= 8.99){ 
					System.out.println("Notable.");
					
				}else{
					
					if(num >= 9 && num <= 10){
						System.out.println("Sobresaliente.");
					
					}
				}
			}
		}
		
	}
	
}
