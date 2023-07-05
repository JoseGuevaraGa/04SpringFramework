import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nuMayor = 0, nuMenor = 8;
        int [] numeros = {5, 6, 8, 2, 4, 6, 2};
        
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > nuMayor ) {
                nuMayor = numeros[i];
            }

            if (numeros[i] < nuMenor ) {
                nuMenor = numeros[i];
            }
        }
        System.out.println("El numero Mayor del array es : " + nuMayor);
        System.out.println("El numero Menor del array es " + nuMenor );
    }
}