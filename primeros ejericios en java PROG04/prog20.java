import java.util.Scanner;

public class prog20{

	public static void main (String []args){
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int i;
		String print = "";
		System.out.println("Introduce la altura del triangulo: ");
		n = scan.nextInt();
		scan.close();
		
		for(i=0;i< n;i++){

			print = print + " *  ";
			System.out.println(print);	
		}
	}
}