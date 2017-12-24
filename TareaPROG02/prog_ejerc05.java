import java.util.Scanner;

public class prog_ejerc05 {

public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("introduce el primer numero: ");
    int num1 = scan.nextInt();
    System.out.print("introduce el segundo numero: ");
    int num2 = scan.nextInt();
     
        if(num1%num2 == 0){
            System.out.println("es multiplo: " + num1 + " * " + num2 + " = " + num1*num2 + " y " + num1 + " % " + num2 + " = " + num1%num2);
        }
     
}
}
