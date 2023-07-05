import java.util.Scanner;

public class extra1 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int numero;
        int result;

        System.out.println("Introdueix nombre enter : " );
        numero = captura.nextInt();
        result = numero * 2;
        System.out.println("El doble d'aquest número : " + result );
        result = numero * 3;
        System.out.println("El triple d'aquest número : " + result );

    }

}
