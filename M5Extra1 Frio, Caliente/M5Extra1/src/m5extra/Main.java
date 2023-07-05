package m5extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner captura = new Scanner(System.in);

        short maxIntentos, contIntentos;
        double numero2, auxuliar;
        int resta, numero1;
        final byte n50 = 50;
        final byte n15 = 15;
        boolean mayor = false;
        numero2 = Math.ceil((Math.random() * 10));
        System.out.println(numero2);
        System.out.println("número2: " + numero2);
        int i = 0;
        contIntentos = 0;
        maxIntentos = 5;
        do {
            System.out.println("Introdueix un número entre 1 y 500: ");
            numero1 = captura.nextShort();
            i++;

            if (numero2 > numero1) {resta = (int)numero2 - numero1; mayor = true; }
            else { resta = numero1 - (int)numero2; mayor = false; }
            System.out.println("Resta: " + resta);
            if (resta >= 1){
             if (resta < n15 && mayor == false){ System.out.println("Calent, calent: el teu número és més gran"); }
             else if (resta < n15 && mayor == true){ System.out.println("Calent, calent: el teu número és més petit"); }
             else if (resta >= n15 && resta < n50 && mayor == false){ System.out.println("Tebi, Tebi: el teu número és més gran"); }
             else if (resta >= n15 && resta < n50 && mayor == true){ System.out.println("Tebi, Tebi: el teu número és més petit"); }
             else if (resta >= n50){ System.out.println("Fred, fred: el teu número és més gran"); }
             else if (resta <= n50) { System.out.println("Fred, fred: el teu número és més petit "); }
            }
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
