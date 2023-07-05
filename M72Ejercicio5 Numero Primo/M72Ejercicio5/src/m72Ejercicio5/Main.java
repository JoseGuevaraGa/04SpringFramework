package m72Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);

        int numTotal;

        System.out.println("Introduce un numero: ");
        numTotal = captura.nextInt();
        if (numTotal < 0) {
            System.out.println("Error el numero tiene que ser positivo ");
        }

        primo(numTotal);


    }

        static void primo (float numero) {
            int numContador = 0;

            for(int i = 1; i <= numero; i++)
            {
                if((numero % i) == 0)
                {
                    numContador ++;
                }
            }

            if(numContador <= 2)
            {
                System.out.println("El " +(int)numero+ " es un numero primo");
            }else{
                System.out.println("El " +(int)numero+ " no es un numero primo");
            }


        }
    }

