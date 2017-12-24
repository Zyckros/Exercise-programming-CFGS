
package unidad3practica2;


import java.util.Scanner;
public class Unidad3practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Scanner scan = new Scanner(System.in);
        Alumnos alumno = new Alumnos();
        System.out.println("introduce el nombre:");
        alumno.setNombre(scan.nextLine()); 
        System.out.println("introduce el dni:");
        alumno.setDni(scan.nextLine());
        System.out.println("Introduce la direccion: ");
        alumno.setDireccion(scan.nextLine());
        System.out.println("Introduce el telefono: ");
        alumno.setTelefono(scan.nextInt());
        System.out.println("Introduce la nota: ");
        alumno.setNota(scan.nextFloat());
        System.out.println("\n" +"Nombre: " + alumno.getNombre() + "\n" + "DNI: " +alumno.getDni() + "\n" +"Direccion: " + alumno.getDireccion() + "\n" + "telefono: " +  alumno.getTelefono() + "\n" + "Nota: "+ alumno.getNota());
    }

    
    
}
