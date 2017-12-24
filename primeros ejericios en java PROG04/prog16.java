import java.util.Scanner;

public class prog16{
	
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String aster = "";
		
		System.out.println("Introduzca un numero: ");
		num = scan.nextInt();
		
		for(int i=0; i<num; i++){
		
			aster = aster + "*";
		}
		System.out.println("asteriscos: " + aster);
		scan.close();
	}
}