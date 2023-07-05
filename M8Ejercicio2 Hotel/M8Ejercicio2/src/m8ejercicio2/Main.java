package m8ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner captura = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<Hotel> hoteles = new ArrayList<>();
        boolean sortir = false;
        int posicion = 0;

        Hotel nh = new Hotel("NH", 16, 4, 500);
        hoteles.add(nh);
        Hotel hilton = new Hotel("Hilton", 20, 5, 600);
        hoteles.add(hilton);
        Hotel hotel = new Hotel("Grand Palace", 24, 3, 700);
        hoteles.add(hotel);

        do{
            switch(menu()){
                case 1:
                    posicion = buscarHotel(hoteles);
                    crearHotel(hoteles, posicion);
                    break;
                case 2:
                    bajaHotel(hoteles);
                    break;
                case 3:
                    posicion = buscarHotel(hoteles);
                    verHotel(hoteles, posicion);
                    break;
                case 4:
                    buscarHotel(hoteles);
                    break;
                case 5:
                    modificarHotel(hoteles);
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
            System.out.println("1. Alta Hoteles.");
            System.out.println("2. Baja Hoteles.");
            System.out.println("3. Ver Hoteles.");
            System.out.println("4. Consultar Hoteles.");
            System.out.println("0. Salir de la aplicación.\n");
            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static void crearHotel(ArrayList<Hotel> hoteles, int posicion)  {
        String nombreHotel = " ";

        int numHabitaciones, plantasHotel, superficieHotel;

        System.out.println("Posicion:" + posicion );

        if (posicion < 0){

            System.out.println("Introduce el nombre del hotel: " );
            nombreHotel = captura.nextLine();

            System.out.println("Introduce el numero de habitaciones:");
            numHabitaciones = captura.nextInt();

            System.out.println("Introduce el numero de plantas del hotel:");
            plantasHotel = captura.nextInt();

            System.out.println("Superficie total Hotel :");
            superficieHotel = captura.nextInt();

            captura.nextLine();

            Hotel hotel = new Hotel(nombreHotel, numHabitaciones, plantasHotel, superficieHotel);
            hoteles.add(hotel);

            System.out.println("Hoteles : " + hoteles.get(0).getNombre() );

        }

        System.out.println("Hotel dado de Alta." + nombreHotel);


    }

    public static int buscarHotel (ArrayList<Hotel> hoteles)  {
        boolean existe = false;
        String nombreHotel;
        int posic = -1, i = 0;

        System.out.println("Introduce el nombre del hotel: " );
        nombreHotel = captura.nextLine();

        while ( !existe && i < hoteles.size()){
        //    System.out.println("Nombre:" + hoteles.get(i).getNombre() );
            if (nombreHotel.equalsIgnoreCase(hoteles.get(i).getNombre())) {
                posic = i;
                existe = true;
        //        System.out.println("Entra :" );
            }
            i++;
        }

        System.out.println("Hoteles tamaño :" + hoteles.size());

        return posic;
    }

    public static void verHotel (ArrayList<Hotel> hoteles, int posicion)  {

        if (posicion != -1){
            System.out.println("El nombre del hotel es: " + hoteles.get(posicion).getNombre());
            System.out.println("El numero de habitaciones del hotel es: " + hoteles.get(posicion).getNumHabitaciones());
            System.out.println("El numero de plantas del hotel es: " + hoteles.get(posicion).getNumPlantas());
            System.out.println("La superficie del hotel es: " + hoteles.get(posicion).getSuperficieHotel());

            //System.out.println(hoteles.get(posicion).CalcularManteniment());
        }else{
            System.out.println("El hotel buscado no se encuentra: " );
        }

    }

    public static int modificarHotel (ArrayList<Hotel> hoteles)  {
        boolean existe = false;
        String nombreHotel;
        int posic = -1, i = 0;

        System.out.println("Introduce el nombre del hotel: " );
        nombreHotel = captura.nextLine();

        while ( !existe && i < hoteles.size()){
            //    System.out.println("Nombre:" + hoteles.get(i).getNombre() );
            if (nombreHotel.equalsIgnoreCase(hoteles.get(i).getNombre())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }

        System.out.println("Hoteles tamaño :" + hoteles.size());

        return posic;
    }

    public static void bajaHotel(ArrayList<Hotel> hoteles)  {
        String nombreHotel = "";
        int posicion = 0;

        posicion = buscarHotel(hoteles);

        if (posicion < 0){
            System.out.println("Hotel no existe." + nombreHotel);

        }else{
            hoteles.remove(posicion);
            System.out.println("Hotel eliminado." + nombreHotel);
        }


    }

}
