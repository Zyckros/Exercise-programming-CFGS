package homeworkTema5;

import java.util.*;

/**
 *
 * @author zyckros
 */
public class MenuAccount {

    //Instance
    BankAccount account = new BankAccount();
    Scanner scan = new Scanner(System.in);

    //function for account cliente
    public void signUp() {

        boolean validate = false;
        System.out.println("¡Bienvenido! para poder darle de alta y que pueda disfrutar de nuestros servicios necesitamos algunos datos primero.\n");
        System.out.print("\nTitular de la cuenta:");
        account.owner = scan.nextLine();

        do {
            System.out.println("\nNumero de la cuenta: Ej XXXX XXXX XX XXXXXXXXXX");
            String numero = scan.nextLine();
            validate = account.validateAccount(numero);
            if (!validate) {
                System.out.println("\nEl numero de cuenta que ha introducido es incorrecto, vuelva a intentarlo.");
            }
        } while (!validate);

    }
    
    //function for menu client
    public void clientMenu() {

        int option = 0;
        int balance = 0;
        int withdraw = 0;
        do {
            System.out.println("\n\nBIENVENIDO A SU GESTOR DE CUENTA ¿QUE DESEA HACER?\n\n "
                    + "1) Ver el número de cuenta completo (CCC - Código Cuenta Cliente).\n"
                    + "2) Ver el titular de la cuenta.\n"
                    + "3) Ver el código de la entidad.\n"
                    + "4) Ver el código de la oficina.\n"
                    + "5) Ver el número de la cuenta (sin entidad, oficina ni dígitos de control).\n"
                    + "6) Ver los dígitos de control de la cuenta\n"
                    + "7) Realizar un ingreso.\n"
                    + "8) Retirar efectivo.\n"
                    + "9) Consultar saldo.\n"
                    + "10) salir de la aplicacion.\n");

            System.out.print("Introduzca una opcion: ");
            option = scan.nextInt();

            switch (option) {

                case 1:
                    System.out.println("El numero de cuenta completo es: " + account.entity + " " + account.office + " " + account.accountControl + " " + account.accountNum);
                    break;
                case 2:
                    System.out.println("El titular de esta cuenta es: " + account.owner);
                    break;
                case 3:
                    System.out.println("El codigo de la entidad es: " + account.entity);
                    break;
                case 4:
                    System.out.println("El codigo de la oficina es: " + account.office);
                    break;
                case 5:
                    System.out.println("El numero de la cuenta es: " + account.accountNum);
                    break;
                case 6:
                    System.out.println("El numero de control de la cuenta es: " + account.accountControl);
                    break;
                case 7:
                    try {
                        System.out.println("¿Que Cantidad desea ingresar? su saldo actual es de: " + account.balance + " €");
                        balance = scan.nextInt();
                        account.depositMoney(balance);
                    } catch (Exception e) {
                    scan.nextLine();
                    balance = 0;
                    System.out.println("Ha introducido un dato incorrecto.");
                    }
                    
                    break;
                case 8:
                    try {
                        System.out.println("¿Que cantidad desea retirar? su saldo actual es de: " + account.balance + " €");
                        withdraw = scan.nextInt();
                        account.withdrawBalance(withdraw);
                    } catch (Exception e) {
                        scan.nextLine();
                        withdraw = 0;
                        System.out.println("Ha introducido un dato incorrecto.");
                    }
                    break;
                case 9:
                    System.out.println("Su saldo actual es de: " + account.balance + " €");
                    break;
                case 10:
                    System.out.println("\nHasta pronto, ¡que tenga un buen dia!.\n");
                    break;
                default:

            }

        } while (option != 10);

    }

}
