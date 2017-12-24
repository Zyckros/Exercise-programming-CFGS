import java.util.Scanner;

public class prog17{
	
	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		int num =0;
		int i = 0;
		String aster = "";
		String espace = "";
		int interiterator = 0;
		
		System.out.println("Introduzca un numero: ");
		num =scan.nextInt();
		scan.close();
		interiterator = num -2;
		
		for(i = 0; i<=interiterator;i++){
			espace = espace + "  ";
		}

		for(i=0; i<=num; i++){
			aster = aster + "/ ";
		}
		System.out.println(aster);
		
		for(i=3;i<=num; i++){ 
			System.out.println("/" + espace + " /");
		}
		System.out.println(aster);
	}
	
}
