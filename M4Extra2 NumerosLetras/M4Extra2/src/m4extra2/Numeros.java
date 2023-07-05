package m4extra2;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int number = 0;
        float numDec;
        int parteEntera;
        String unidad = " ";
        String decena = " ";
        boolean mayorDiez = false;

        System.out.println("Introduce un número entre 0 y 99 : " );
        number = captura.nextInt();

        if (number >= 10) {
            mayorDiez = true;
            numDec = (float)number / 10;
            parteEntera = (int) numDec;

            int iUnidad = number%10;
            number = iUnidad;

            switch (parteEntera) {
                case 1:
                    decena = "Diez";
                    break;
                case 2:
                    decena = "Veinte";
                    break;
                case 3:
                    decena = "Treinta";
                    break;
                case 4:
                    decena = "Cuarenta";
                    break;
                case 5:
                    decena = "Cincuenta";
                    break;
                case 6:
                    decena = "Sesenta";
                    break;
                case 7:
                    decena = "Setenta";
                    break;
                case 8:
                    decena = "Ochenta";
                    break;
                case 9:
                    decena = "Noventa";
                    break;
                default:

            }
        }

        if (number <= 9) {

            switch (number) {
                case 1:
                    unidad = "Uno";
                    break;
                case 2:
                    unidad = "Dos";
                    break;
                case 3:
                    unidad = "Tres";
                    break;
                case 4:
                    unidad = "Cuatro";
                    break;
                case 5:
                    unidad = "Cinco";
                    break;
                case 6:
                    unidad = "Seis";
                    break;
                case 7:
                    unidad = "Siete";
                    break;
                case 8:
                    unidad = "Ocho";
                    break;
                case 9:
                    unidad = "Nueve";
                    break;
                default:
            }
        }
        if (mayorDiez) {
            if (decena.equals("Diez")  && unidad.equals(" ")){
                System.out.println(decena);
            }else {
            System.out.println( decena + " y " + unidad);}
        }else { System.out.println(unidad); }
    }
}
