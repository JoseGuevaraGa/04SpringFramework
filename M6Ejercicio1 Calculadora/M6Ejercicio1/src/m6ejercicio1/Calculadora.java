package m6ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int numero1, resultado = 0;
        char operador;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int i = 0;
        do {
            System.out.println("Introdueix un numero " + (i + 1) + ":");
            numero1 = captura.nextInt();
            numeros.add(numero1);
            i ++;
        } while (i < 2);

        System.out.println("Introdueix operador : ");
        operador = captura.next().charAt(0);

        switch (operador) {
            case '*':
                resultado = multiplica(numeros.get(0),numeros.get(1));
                break;
            case '-':
                resultado = resta(numeros.get(0),numeros.get(1));
                break;
            case '/':
                if (numeros.get(1) == 0){
                    System.out.println("No se puede dividir entre cero ");
                }else{
                 resultado = divide(numeros.get(0),numeros.get(1));}
                break;
            case '+':
                resultado = suma(numeros.get(0),numeros.get(1));
                break;
            default:
        }

        System.out.println("el resultat de fer l’operació: " + resultado);

        captura.close();

    }
    static int multiplica(int num1, int num2) {
        return num1 * num2;
    }
    static int resta(int num1, int num2) {
        return num1 - num2;
    }
    static int divide(int num1, int num2) {
        return num1 / num2;
    }
    static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
