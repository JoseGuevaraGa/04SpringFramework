import java.util.Scanner;

public class extra2 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int numero;
        int varInt;
        int result;

        System.out.println("Introdueix nombre enter : " );
        numero = captura.nextInt();
        if (numero < 10){
           varInt = numero;
        }else {
            varInt = 1;
        }

        System.out.println(varInt + " x 1  = " + (result = varInt * 1) );
        System.out.println(varInt + " x 2  = " + (result = varInt * 2) );
        System.out.println(varInt + " x 3  = " + (result = varInt * 3) );
        System.out.println(varInt + " x 4  = " + (result = varInt * 4) );
        System.out.println(varInt + " x 5  = " + (result = varInt * 5) );
        System.out.println(varInt + " x 6  = " + (result = varInt * 6) );
        System.out.println(varInt + " x 7  = " + (result = varInt * 7) );
        System.out.println(varInt + " x 8  = " + (result = varInt * 8) );
        System.out.println(varInt + " x 9  = " + (result = varInt * 9) );
        System.out.println(varInt + " x 10 = " + (result = varInt * 10) );

    }
}
