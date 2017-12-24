package javaapplication1;

/**
 *
 * @author zyckros
 */
import java.util.*;


public class BankAccount {

    String owner = null;
    int entity = 0;
    int office = 0;
    String accountNum = "";
    int accountControl = 0;
    int balance = 0;

    public BankAccount() {
    }

    public BankAccount(String owner, int entity, int office, int accountControl, String account) {

        this.owner = owner;
        this.entity = entity;
        this.office = office;
        this.accountControl = accountControl;
        this.accountNum = account;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getEntity() {
        return entity;
    }

    public void setEntity(int entity) {
        this.entity = entity;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAcountNum(String account) {
        this.accountNum = account;
    }

    public int getAccountControl() {
        return accountControl;
    }

    public void setAccountControl(int accountControl) {
        this.accountControl = accountControl;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void altaCliente() {

    }

    public boolean validateAccount(String numberAccount) {

        /*
        para el manejo de datos en una string se usa substring(0,0) con dos parametros. 
        Donde el primer valor indica el punto de partida y el segundo valor la longitud que de la parte de la string a ser analizada

        Character.isDigit(); ---> funcion para comparar si el caracter es un numero
         */
        boolean validate = false;

        if (numberAccount.length() == 23) {
            String entity = "";
            String office = "";
            String accountControl = "";
            String accountNum = "";
            int count = 0;
            
            //extract data from the String
            entity = numberAccount.substring(0, 4);
            office = numberAccount.substring(5, 9);
            accountControl = numberAccount.substring(10, 12);
            accountNum = numberAccount.substring(13, 23);

            for (int i = 0; i < entity.length(); i++) {

                if (Character.isDigit(entity.charAt(i))) {
                    count++;

                }
            }

            for (int i = 0; i < office.length(); i++) {

                if (Character.isDigit(office.charAt(i))) {
                    count++;
                }
            }

            for (int i = 0; i < accountControl.length(); i++) {

                if (Character.isDigit(accountControl.charAt(i))) {
                    count++;
                }
            }

            for (int i = 0; i < accountNum.length(); i++) {

                if (Character.isDigit(accountNum.charAt(i))) {
                    count++;
                }
            }

            //Asign value to data Account
            if (count == 20) {

                this.entity = Integer.parseInt(entity);
                this.office = Integer.parseInt(office);
                this.accountControl = Integer.parseInt(accountControl);
                this.accountNum = accountNum;
                validate = true;
            }

        }
        return validate;

    }

    public void depositMoney(int balance) {
        this.balance += balance;

        System.out.println("Su saldo actual es: " + this.balance);
    }

    public void withdrawBalance(int withdraw) {

        if (withdraw < this.balance) {
            this.balance -= withdraw;
        }
        System.out.println("Su saldo Actual es de: " + this.balance);
    }
}
