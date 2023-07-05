import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int numero1, numero2;
        char operador;
        float resultado = 0;

        System.out.println("Introdueix un numero 1 : ");
        numero1 = captura.nextInt();
        System.out.println("Introdueix un numero 2 : ");
        numero2 = captura.nextInt();
        System.out.println("Introdueix operador : ");
        operador = captura.next().charAt(0);

        switch (operador) {
            case '*':

                resultado = (float) numero1 * numero2;
                break;
            case '-':
                resultado = (float) numero1 - numero2;
                break;
            case '/':
                ;
                resultado = (float) numero1 / numero2;
                break;
            case '+':
                resultado = (float) numero1 + numero2;
                break;
            default:
         }



        System.out.println("el resultat de fer l’operació: " + resultado);

        captura.close();
    }
}
