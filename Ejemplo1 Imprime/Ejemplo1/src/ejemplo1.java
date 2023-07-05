import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;

        System.out.println("Introduce tu nombre : " );
        nombre = captura.nextLine();
        System.out.println("Introduce tu apellido : " );
        apellido = captura.nextLine();
        System.out.println("Introduce tu edad : " );
        edad = captura.nextInt();

        System.out.println("Nombre : " + nombre );
        System.out.println("Apellido : " + apellido );
        System.out.println("Edad : " +edad );


    }
}
