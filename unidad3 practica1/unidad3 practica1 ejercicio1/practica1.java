import java.util.Scanner;

public class practica1{

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int num1 =0;
        int num2=0;
        int result=0;
        int option = 1;

    while(option != 0){
        System.out.println("");
        System.out.println("1) Introducir dos numeros");
        System.out.println("2) Obtener suma");
        System.out.println("3) Obtener multiplicacion");
        System.out.println("0) Salir");
        System.out.println("");
        option = scan.nextInt();
        
        switch( option ){

            case 0:
            System.out.println("    ¡¡Hasta pronto!!");
            System.out.println("");
            break;
            case 1:

                System.out.println("    Introduce el primer numero:");
                num1 = scan.nextInt();
                System.out.println("    Introduce el segundo numero:");
                num2 = scan.nextInt();
                System.out.println("");
                break;

            case 2:

                result = suma(num1, num2);
                if(num1>num2){
                    System.out.println("    Este es el numero mayor: " + num1);
                }else{
                    System.out.println("    Este es el numero mayor: " + num2);
                }
                System.out.println("");
                System.out.println("    El resultado es: " + result);
                System.out.println("");
                break;
            case 3:

                result = multiplicacion(num1, num2);
                if(num1>num2){
                    System.out.println("    Este es el numero mayor: " + num1);
                }else{
                    System.out.println("    Este es el numero mayor: " + num2);
                }
                System.out.println("");
                System.out.println("    El resultado es: " + result);
                System.out.println("");
                break;
            default:
            System.out.println("    El valor introducido no es correcto...");
            System.out.println("");
        }
    }   
}

    static int suma(int num1, int num2){

        int result= num1 + num2;
        return result;    
    }

    static int multiplicacion(int num1, int num2){
        
        int result= num1 * num2;
        return result;
}
}
