package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class palabras {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        ArrayList<String> lPalabras = new ArrayList<String>();
        String palabra;
        byte numero1, j;
        char operador;
        float resultado = 0;


        System.out.println("Cuantas palabras quieres introducir : ");
        numero1 = captura.nextByte();
        captura.nextLine();
        j=1;
        for (int i = 0; i < numero1; i++) {
            System.out.println("Introduce la palabra " + j);
            palabra = captura.next();
            lPalabras.add(palabra);
            j++;
        }
        int size=lPalabras.size();
        System.out.println("----Lista de palabras---- ");
        for(int i=0; i< size; i++) {

            System.out.println(lPalabras.get(i));
        }

    }
}
