
import java.util.Scanner;

public class prog7{
	
	public static void main (String []args){
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int inter = 0;
	
		System.out.println( "introduzca el primer numero:");
		a = scan.nextInt();
		System.out.println( "introduzca el segundo numero:");
		b = scan.nextInt();
		System.out.println( "introduzca el tercer numero:");
		c = scan.nextInt();
		scan.close();

		if(a<b && b<c){
			System.out.println(" A:" + a + " B:" + b + " C:" + c);
 		}
			
		if(a<c && c<b){
			inter = b;
			b = c;
			c = inter;
		}
			
		if(a > b && b > c){
			inter = c;
			c = a;
			a = inter;
			System.out.println( "A:" + a + " B:" + b + " C:" + c);
		}
			
		if(a > c && b > a){
			inter = b;
			b = a;
			a = c;
			c = inter;
			System.out.println("A:" + a + " B:" + b + " C:" + c);
		}
			
		if(a > b && a < c){
			inter = a;
			a = b;
			b = inter;
			System.out.println("A:" + a + " B:" + b + " C:" + c);
		}

		if (c > b && c < a){
			inter = a;
			a = b;
			b = c;
			c = inter;
			System.out.println("A:" + a + " B:" + b + " C:" + c);
		}
	}	
}