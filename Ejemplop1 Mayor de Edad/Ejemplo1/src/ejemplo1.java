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

        if (edad >= 18){
            System.out.println("Nombre:" + nombre +" "+ apellido+" "+"Eres MAYOR de edad " );
        } else {
            System.out.println("Nombre:" + nombre +" "+ apellido+" "+"Eres MENOR de edad " );
        }

        System.out.println("Edad : " +edad );

    }
}
