package m8ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Campeonato {
    static Scanner captura = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Escuderia> escuderias = new ArrayList<>();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        boolean sortir = false;
        int posicion = 0;

        Escuderia ferrari = new Escuderia("Ferrari", 2000000, "Italia");
        escuderias.add(ferrari);
        Escuderia rb = new Escuderia("Redbull", 3000000, "Holanda");
        escuderias.add(rb);

        Trabajador checo = new Trabajador("Sergio","Perez", 33,3);
        trabajadores.add(checo);

        Coche rb8 = new Coche(5000,300, "azul",30000);



        do{
            switch(menu()){
                case 1:
                    posicion = buscarEscuderia(escuderias);
                    crearPilotos(trabajadores, posicion);
                    break;
                case 2:

                    bajaPilotos(trabajadores);
                    break;
                case 3:
                    // posicion = buscarEscuderia(escuderias);
                    verTrabajador(trabajadores);
                    break;
            /*    case 4:
                    buscarEscuderia(escuderias);
                    break;
                case 5:
                    modificarEscuderia(escuderias);
                    break; */
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
        final byte MAXIMO = 3;

        do{
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("1. Alta Pilotos/Mecanicos.");
            System.out.println("2. Baja Pilotos/Mecanicos.");
            System.out.println("3. Ver Pilotos/Mecanicos.");
            System.out.println("0. Salir de la aplicación.\n");
            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static void crearPilotos(ArrayList<Trabajador> trabajadores, int posicion)  {
        String nombreEscuderia = " ", paisOrigen = " ", nombrePiloto = "", apellidoPiloto = "";
        int posPiloto = 0, posTrabajador = 0,  edad = 0,  antiguedad = 0,  sueldo = 0;

        int presupuesto;

        //System.out.println("Posicion:" + posicion );

        if (posicion < 0){
            System.out.println("Escuderia no existe." + nombreEscuderia);
        }else{
            //System.out.println("Escuderia ya existe." + nombreEscuderia);

            posTrabajador = seleccionTipoTrabajador();

            switch (posTrabajador){
                case 1:
                    altaPiloto(trabajadores);
                    break;
                case 2:
                    altaMecanico(trabajadores);
                    break;
                default:
                    System.out.println("Opcion no valida " );
                    break;
            }
            //System.out.println("Escuderia dada de Alta." + nombreEscuderia);
        }

    }

    public static int buscarEscuderia (ArrayList<Escuderia> escuderias)  {
        boolean existe = false;
        String nombreEscuderia;
        int posic = -1, i = 0;

        System.out.println("Introduce el nombre de la escuderia: " );
        nombreEscuderia = captura.nextLine();

        while ( !existe && i < escuderias.size()){

            if (nombreEscuderia.equalsIgnoreCase(escuderias.get(i).getNombre())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }

        //System.out.println("Escuderias tamaño :" + escuderias.size());

        return posic;
    }

    public static int buscarTrabajador (ArrayList<Trabajador> trabajadores)  {
        boolean existe = false;
        String nombrePiloto;
        int posic = -1, i = 0;

        System.out.println("Introduce el nombre del trabajador: " );
        nombrePiloto = captura.nextLine();

        while ( !existe && i < trabajadores.size()){

            if (nombrePiloto.equalsIgnoreCase(trabajadores.get(i).getNombre())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }

        //System.out.println("Pilotos tamaño :" + trabajadores.size());

        return posic;
    }

    public static void bajaPilotos(ArrayList<Trabajador> trabajadores)  {
        String nombrePiloto = "";
        int posicion = 0;

        posicion = buscarTrabajador(trabajadores);

        if (posicion < 0){
            System.out.println("Piloto no existe." + nombrePiloto);

        }else{
            trabajadores.remove(posicion);
            System.out.println("Trabajador dado de baja." + nombrePiloto);
        }


    }

    public static void verTrabajador(ArrayList<Trabajador> trabajadores)  {
        String nombreTrabajador = "";
        int posicion = 0;

        posicion = buscarTrabajador(trabajadores);

        if (posicion < 0){
            System.out.println("Trabajador no existe." + nombreTrabajador);

        }else{
            System.out.println("Nombre Piloto:" + trabajadores.get(posicion).getNombre());
            System.out.println("Nombre Apellido:" + trabajadores.get(posicion).getApellido());
            System.out.println("Edad:" + trabajadores.get(posicion).getEdad());
            System.out.println("Antiguedad:" + trabajadores.get(posicion).getAntiguedad());
        }



    }

    public static byte seleccionTipoTrabajador()  {
        Scanner entrada = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 2;

        do{
            System.out.println("\nSelecciona el trabajador a dar de alta");
            System.out.println("1. Pilotos.");
            System.out.println("2. Mecanicos.");
            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Selecciona una opción valida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static void altaPiloto(ArrayList<Trabajador> trabajadores)  {
        String nombreEscuderia = " ", paisOrigen = " ", nombrePiloto = "", apellidoPiloto = "";
        int posPiloto = 0, posTrabajador = 0,  edad = 0,  antiguedad = 0,  sueldo = 0;

        posPiloto = buscarTrabajador(trabajadores);

        if (posPiloto < 0){
            //System.out.println("Piloto no existe." + nombreEscuderia);

            System.out.println("Introduce el nombre del piloto: " );
            nombrePiloto = captura.nextLine();

            System.out.println("Introduce el apellido:");
            apellidoPiloto = captura.nextLine();

            System.out.println("Introduce la edad:");
            edad = captura.nextInt();

            System.out.println("Introduce la antiguedad:");
            antiguedad = captura.nextInt();

            System.out.println("Introduce el sueldo:");
            sueldo = captura.nextInt();

            captura.nextLine();

            //*Trabajador trabajador = new Trabajador(nombrePiloto,apellidoPiloto,edad, antiguedad );
            //*trabajadores.add(trabajador);
            Piloto piloto = new Piloto(nombrePiloto,apellidoPiloto,edad, antiguedad,50,60,165,45 );

            System.out.println("Trabajadores : " + trabajadores.get(0).getNombre() );

        }else{
            System.out.println("Piloto ya existe." + nombrePiloto);
        }

    }
    public static void altaMecanico(ArrayList<Trabajador> trabajadores)  {
        String estudios = " ", nombreMecanico = "", apellidoMecanico = "";
        int posPiloto = 0, posTrabajador = 0,  edad = 0,  antiguedad = 0,  sueldo = 0;

        posPiloto = buscarTrabajador(trabajadores);

        if (posPiloto < 0){
            //System.out.println("Piloto no existe." + nombreEscuderia);

            System.out.println("Introduce el nombre del mecanico: " );
            nombreMecanico = captura.nextLine();

            System.out.println("Introduce el apellido:");
            apellidoMecanico = captura.nextLine();

            System.out.println("Introduce la edad:");
            edad = captura.nextInt();

            System.out.println("Introduce la antiguedad:");
            antiguedad = captura.nextInt();

            System.out.println("Introduce el sueldo:");
            sueldo = captura.nextInt();

            System.out.println("Introduce los estudios Mecanico:");
            estudios = captura.nextLine();
            captura.nextLine();

            Mecanico mecanico = new Mecanico(nombreMecanico, apellidoMecanico, edad, antiguedad,50, estudios,100 );

            //System.out.println("Trabajadores : " + trabajadores.get(0).getNombre() );

        }else{
            System.out.println("Mecanico ya existe." + nombreMecanico);
        }

    }
}
