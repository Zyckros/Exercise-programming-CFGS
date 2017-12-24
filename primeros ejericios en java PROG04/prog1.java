import java.util.Scanner;

public class prog1{

	public static void main (String[]args){
	int n = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("introduce un numero");
	n = scan.nextInt(); 
	scan.close();
		if (n<0){ 
			System.out.println("Es negativo");
		}else{
	
			if (n > 0){ 
				System.out.println("Es positivo");
			}else{
				System.out.println("Es nulo");
			}
		}
		
	}
}