import java.util.Scanner;

public class prog18{
	
	public static void main(String []args){		
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String aster = "";
		int i = 0;

		System.out.println(" Introduzca un numero: ");
		num = scan.nextInt();
		
		for(i=1;i<= num; i++){
			aster = aster + "  *";
		}
		
		for(i=0;i<num;i++){}	
			System.out.println(aster);			
	}
}
