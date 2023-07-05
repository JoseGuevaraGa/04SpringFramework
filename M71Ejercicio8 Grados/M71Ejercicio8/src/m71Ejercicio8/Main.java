package m71Ejercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);
        int gradosC;
        int gradosF;
        final int consK = 32;

        System.out.println("Introduce una temperatura en ºC : " );
        gradosC = captura.nextInt();

        gradosF = ((gradosC * 9) / 5) + consK;

        System.out.println("Temperatura en ºF : " + gradosF );

    }
}
