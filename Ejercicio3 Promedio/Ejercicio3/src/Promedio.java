import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        int nota1, nota2, nota3;
        float promedio;

        System.out.println("Introdueix nota 1 : ");
        nota1 = notas.nextInt();
        System.out.println("Introdueix nota 2 : ");
        nota2 = notas.nextInt();
        System.out.println("Introdueix nota 3 : ");
        nota3 = notas.nextInt();

        promedio = (float)(nota1+nota2+nota3) / 3;

        System.out.println("La media de tus notas es: " + promedio);

        notas.close();
       }
    }
