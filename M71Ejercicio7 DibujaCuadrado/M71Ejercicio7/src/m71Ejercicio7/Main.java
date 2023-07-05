package m71Ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner captura = new Scanner(System.in);
            int numTotal;
            String caracter;
            System.out.println("Introdueix un número : " );
            numTotal = captura.nextInt();

            System.out.println("Introdueix un caracter: " );
            caracter = captura.next();


            for (int i = 0; i < numTotal; i++) {

                for (int j = 0; j < numTotal; j++) {
                    System.out.print(caracter + " ");
                }

                System.out.println();

            }

            captura.close();

    }
}
