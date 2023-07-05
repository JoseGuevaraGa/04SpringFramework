import java.util.Scanner;

public class Cursos {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int edad;

        System.out.println("Introduce tu edad : " );
        edad = captura.nextInt();

        if (edad <= 5){
            System.out.println("Preescolar");
         } else if (edad >= 6 && edad <= 11){
            System.out.println("Primaria");
          } else if (edad >= 12 && edad <= 15){
            System.out.println("ESO");
           } else if (edad >= 16 && edad <= 17){
            System.out.println("Batxillerat");
            }
         else
        {
            System.out.println("Universidad");
        }

    }
}
