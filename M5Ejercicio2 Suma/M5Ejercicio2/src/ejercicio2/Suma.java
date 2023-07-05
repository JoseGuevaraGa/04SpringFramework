package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
	// write your code here
        Scanner captura = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        byte numero1, numero2;
        int resultado = 0;


        System.out.println("Introduce un número entero 1: ");
        numero1 = captura.nextByte();
        captura.nextLine();
        System.out.println("Introduce un número entero 2: ");
        numero2 = captura.nextByte();
        captura.nextLine();

        for (int i = numero1; i <= numero2; i++) {
            numeros.add(i);
        }
        int size= numeros.size();
        System.out.println("Resultado = ");

        for(int i=0; i< size; i++) {

            System.out.println(numeros.get(i) + " +");
            resultado = resultado + numeros.get(i);

        }
        System.out.println("= " + resultado);
    }
}
