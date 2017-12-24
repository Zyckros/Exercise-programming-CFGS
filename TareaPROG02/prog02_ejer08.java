import java.util.Scanner;

public class prog02_ejer08 {

public static void main (String[] args){

    Scanner scan = new Scanner(System.in);
    float x = 0f;
    float y = 0f;

    System.out.println("introducE primer numero: ");
    x = scan.nextInt();
    System.out.println("introducE segundo numero: ");
    y = scan.nextInt();

    System.out.println("x = " + x + " y = " + y);
    System.out.println("x + y = " + (x+y));
    System.out.println("x - y = " + (x-y));
    System.out.println("x * y = " + (x*y));
    System.out.println("x / y = " + (x/y));
    System.out.println("x ^ y = " + Math.pow(x, 2));
    System.out.println("√ x = " + Math.sqrt(x));
    
    }
}
