package ejercicio6;

import java.util.Scanner;

public class Zodiaco {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        byte mes, dia;

        System.out.println("Introduce el día de nacimiento : ");
        dia = captura.nextByte();
        System.out.println("Introduce el mes de nacimiento : ");
        mes = captura.nextByte();

        switch (mes) {
            case 1:
                if (dia < 20){
                    System.out.println("Capricorn-Capricornio ");
                }else{
                    System.out.println("Aquari-Acuario");
                }
                break;
            case 2:
                if (dia < 19){
                    System.out.println("Aquari-Acuario");
                }else{
                    System.out.println("Peixos-Piscis ");
                }
                break;
            case 3:
                if (dia < 21){
                    System.out.println("Peixos-Piscis");
                }else{
                    System.out.println("Àries-Aries ");
                }
                break;
            case 4:
                if (dia < 20){
                    System.out.println("Àries-Aries");
                }else{
                    System.out.println("Taure-Tauro");
                }
                break;
            case 5:
                if (dia < 21){
                    System.out.println("Taure-Tauro");
                }else{
                    System.out.println("Bessons-Géminis ");
                }
                break;
            case 6:
                if (dia < 21){
                    System.out.println("Bessons-Géminis");
                }else{
                    System.out.println("Cranc-Cáncer");
                }
                break;
            case 7:
                if (dia < 23){
                    System.out.println("Cranc-Cáncer");
                }else{
                    System.out.println("Lleó-Leo");
                }
                break;
            case 8:
                if (dia < 23){
                    System.out.println("Lleó-Leo");
                }else{
                    System.out.println("Verge-Virgo");
                }
                break;
            case 9:
                if (dia < 23){
                    System.out.println("Verge-Virgo");
                }else{
                    System.out.println("Balança-Libra");
                }
                break;
            case 10:
                if (dia < 23){
                    System.out.println("Balança-Libra");
                }else{
                    System.out.println("Escorpí-Escorpión");
                }
                break;
            case 11:
                if (dia < 23){
                    System.out.println("Escorpí-Escorpión");
                }else{
                    System.out.println("Sagitari-Sagitario");
                }
                break;
            case 12:
                if (dia < 22){
                    System.out.println("Sagitari-Sagitario");
                }else{
                    System.out.println("Capricorn-Capricornio");
                }
                break;
            default:
                System.out.println("Fechas no validas");
        }
    }
}
