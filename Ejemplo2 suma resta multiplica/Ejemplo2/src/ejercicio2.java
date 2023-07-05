import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        int numero1, numero2, suma, resta, multiplica, divide;

        System.out.println("Introdueix número sencer 1 : " );
        numero1 = numeros.nextInt();
        System.out.println("Introdueix número sencer 2 : " );
        numero2 = numeros.nextInt();
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplica = numero1 * numero2;
        divide = numero1  / numero2;

        System.out.println("El resultat de la suma és: " + suma );
        System.out.println("El resultat de la resta és: " + resta );
        System.out.println("El resultat de la multiplicació és: " + multiplica );
        System.out.println("El resultat de la divisió és: " + divide );
        numeros.close();

    }
}
