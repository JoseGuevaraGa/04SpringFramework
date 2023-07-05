package m72Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int numTotal;
        String caracter = "*";
        String resultado = " ";

        System.out.println("Introduce un numero: " );
        numTotal = captura.nextInt();

        for (int i = 0; i <= numTotal; i++) {

            for (int j = numTotal; j > i; j--) {
                resultado = " ";
                resultado += caracter;
                System.out.print(resultado);
            }

            System.out.println();
        }
    }
}
