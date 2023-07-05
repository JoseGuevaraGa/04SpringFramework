package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Adivina {

    public static void main(String[] args) {
	// write your code here
        Scanner captura = new Scanner(System.in);


        byte numero1, maxIntentos, contIntentos;
        double numero2;

        numero2 = Math.ceil((Math.random() * 10));
        int i = 0;




        contIntentos = 0;
        maxIntentos = 10;
        do {
            System.out.println("Adivina el numero del 1 al 10: ");
            numero1 = captura.nextByte();
            i++;
            contIntentos += 1;
        }
        while (numero1 != numero2 && i < maxIntentos );

        if (numero1 == numero2) {
            System.out.println("Enhorabuena, el número era: " + (int)numero2 + " Y has necesitado: " + contIntentos + " intentos para conseguirlo" );
        }else {
            System.out.println("Has utiliado muchos intentos! el numero es: " + (int) numero2);
        }
    }
}
