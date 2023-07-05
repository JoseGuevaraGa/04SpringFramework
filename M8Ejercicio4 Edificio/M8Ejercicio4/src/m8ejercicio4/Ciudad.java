package m8ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ciudad {
    static Scanner captura = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Edificio> edificios = new ArrayList<>();
        int opcion = 0, posicion = 0;
        boolean sortir = false;

        Hotel nh = new Hotel("NH", 4, 500);
        Hospital clinicaUno = new Hospital("Clinica Uno", 5, 600);
        Cine multicines = new Cine("Multicines", 3, 1000);


        edificios.add(nh);
        edificios.add(clinicaUno);
        edificios.add(multicines);

        do{
            switch(menu()){
                case 1:
                    posicion = buscarEdificio(edificios);
                    crearEdificio(edificios, posicion);
                    break;
                case 2:
                    bajaEdificio(edificios);
                    break;
                case 3:
                    verEdificio(edificios);
                    break;
                case 4:
                    buscarEdificio(edificios);
                    break;
                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
                    sortir = true;
                    break;
            }
        }while(!sortir);
    }

    public static byte menu(){
        Scanner entrada = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 4;

        do{
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("1. Alta Edificios.");
            System.out.println("2. Baja Edificios.");
            System.out.println("3. Ver Edificios.");
            System.out.println("4. Consultar Edificios.");
            System.out.println("0. Salir de la aplicación.\n");
            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static int buscarEdificio (ArrayList<Edificio> edificios)  {
        boolean existe = false;
        String nombreHotel;
        int posic = -1, i = 0;

        System.out.println("Introduce el nombre del edificio: " );
        nombreHotel = captura.nextLine();

        while ( !existe && i < edificios.size()){
            if (nombreHotel.equalsIgnoreCase(edificios.get(i).getNombreEdificio())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }
        return posic;
    }

    public static void crearEdificio(ArrayList<Edificio> edificios, int posicion)  {
        String nombreEdificio = " ";

        int plantasEdificio, superficieEdificio;

        System.out.println("Posicion:" + posicion );

        if (posicion < 0){

            System.out.println("Introduce el nombre del edificio: " );
            nombreEdificio = captura.nextLine();

            System.out.println("Introduce el numero de plantas del edificio:");
            plantasEdificio = captura.nextInt();

            System.out.println("Superficie total edificio :");
            superficieEdificio = captura.nextInt();

            captura.nextLine();

            Hotel edificio = new Hotel(nombreEdificio, plantasEdificio, superficieEdificio);
            edificios.add(edificio);

            System.out.println("Edificios : " + edificios.get(0).getNombreEdificio());
            System.out.println("Edificio dado de Alta." + nombreEdificio);

        }else{
            System.out.println("Edificio ya existe." + nombreEdificio);
        }

    }

    public static void bajaEdificio(ArrayList<Edificio> edificios)  {
        String nombreEdificio = "";
        int posicion = 0;

        /* System.out.println("Introduce el nombre del edificio a eliminar: " );
           nombreEdificio = captura.nextLine();  */

        posicion = buscarEdificio(edificios);

        if (posicion < 0){
            System.out.println("Edificio no existe." + nombreEdificio);

        }else{
            edificios.remove(posicion);
            System.out.println("Edificio eliminado." + nombreEdificio);
        }


    }

    public static void verEdificio(ArrayList<Edificio> edificios)  {
        String nombreEdificio = "";
        int posicion = 0;

        posicion = buscarEdificio(edificios);

        if (posicion < 0){
            System.out.println("Edificio no existe." + nombreEdificio);

        }else{
            edificios.remove(posicion);
            System.out.println(edificios.toString());
            edificios.get(posicion).getNombreEdificio();
        }



    }

}
