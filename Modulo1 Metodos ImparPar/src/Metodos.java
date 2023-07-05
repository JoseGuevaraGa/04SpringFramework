import java.util.Arrays;
import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int numero;

        System.out.println("Indica un numero entero: ");
        numero = captura.nextInt();

        if (esPar(numero) ){
            System.out.println("El número es: " + numero + " es par");
        }else{
            System.out.println("El número es: " + numero + " es impar");
        }
        captura.close();
    }
    static boolean esPar(int numero){
        boolean resultado = false;
        resultado = (numero % 2 == 0) ? true : false;
        return resultado;
    }
}
