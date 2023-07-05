import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int nuMaximo = 50, nuMultiplo = 0;

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < nuMaximo; i++) {
            numeros.add(nuMultiplo);
            nuMultiplo = nuMultiplo + 3;
            i = nuMultiplo;
        }
        System.out.println("Array de numeros " + numeros);
    }
}