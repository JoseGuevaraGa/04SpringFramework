package m72Ejercicio3;

import java.util.Scanner;

public class Arboles {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int numTotal, numTotal2;
        String caracter = "*";
        String resultado = " ";

        System.out.println("Introduce un numero: " );
        numTotal = captura.nextInt();
        numTotal2 = numTotal * 2;

        for (int i = 0; i <= numTotal2; i++) {
            if (i <= numTotal) {
                for (int j = 0; j < i; j++) {
                    resultado = " ";
                    resultado += caracter;
                    System.out.print(resultado);
                }
                System.out.println();
            }else {
                for (int k = numTotal2; k > i; k--) {
                    resultado = " ";
                    resultado += caracter;
                    System.out.print(resultado);
                }

                System.out.println();
            }

        }
    }
}
