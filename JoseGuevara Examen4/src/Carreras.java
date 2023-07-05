import java.util.ArrayList;
import java.util.Scanner;

public class Carreras {

    static Scanner captura = new Scanner(System.in);
    public static void main(String[] args) {

        boolean sortir = false;
        int posicion = 0;

        ArrayList<Circuito> circuitos = new ArrayList<>();
        ArrayList<Coches> coche = new ArrayList<>();

        Circuito monza = new Circuito("Monza", 3000, 10);
        circuitos.add(monza);

        Circuito montmelo = new Circuito("Montmelo", 4000, 11);
        circuitos.add(montmelo);

        Circuito mexico = new Circuito("México", 6000, 12);
        circuitos.add(mexico);

        Coches mercedes = new Coches("Mercedes", "SLK 500", 100, 4, "AA4000");
        coche.add(mercedes);

        Coches nissan = new Coches("Nissan", "Z24", 130, 6, "AA4004");
        coche.add(nissan);

        Coches skoda = new Coches("Skoda", "Fabia", 70, 3, "AA4001");
        coche.add(skoda);

        Coches audi = new Coches("Audi", "X12", 110, 5, "AA4002");
        coche.add(audi);

        Coches ford = new Coches("Ford", "F500", 120, 8, "AA4003");
        coche.add(ford);

        do{
            switch(menu()){

                case 1:
                    verCircuito(circuitos);
                    break;
                case 2:
                    verCoches(coche);
                    break;
                case 3:
                    validarVelocidad();
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
        final byte MAXIMO = 3;

        do{
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("1. Ver circuitos.");
            System.out.println("2. Ver coches.");
            System.out.println("3. Validar Velocidad.");
            System.out.println("0. Salir de la aplicación.\n");
            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static void verCircuito(ArrayList<Circuito> circuitos)  {
        String nombreTrabajador = "";
        int posicion = 0;

        posicion = buscarCircuito(circuitos);

        if (posicion < 0){
            System.out.println("Trabajador no existe." + nombreTrabajador);

        }else{
            System.out.println("Nombre Circuito:" + circuitos.get(posicion).getNombreCircuito());
            System.out.println("Tamaño Circuito:" + circuitos.get(posicion).getTamañoCircuito());
            System.out.println("Total Coches:" + circuitos.get(posicion).getTotalCoches());
        }



    }

    public static int buscarCircuito (ArrayList<Circuito> circuitos)  {
        boolean existe = false;
        String nombreCircuito;

        int posic = -1, i = 0;

        System.out.println("Introduce el nombre del Circuito: " );
        nombreCircuito = captura.nextLine();

        while ( !existe && i < circuitos.size()){

            if (nombreCircuito.equalsIgnoreCase(circuitos.get(i).getNombreCircuito())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }

        return posic;
    }
    public static void verCoches(ArrayList<Coches> coche)  {
        String marcaCoche = "";
        int posicion = 0;

        posicion = buscarCoches(coche);

        if (posicion < 0){
            System.out.println("Trabajador no existe." + marcaCoche);

        }else{
            System.out.println("Marca Coche:" + coche.get(posicion).getMarcaCoche());
            System.out.println("Modelo Coche:" + coche.get(posicion).getModeloCoche());
            System.out.println("Potencia Coche:" + coche.get(posicion).getPotenciaCoche());
            System.out.println("Cilidrada Coche:" + coche.get(posicion).getCilidandraCoche());
            System.out.println("Matricula Coche:" + coche.get(posicion).getMatriculaCoche());
        }



    }

    public static int buscarCoches (ArrayList<Coches> coche)  {
        boolean existe = false;
        String marcaCoche;

        int posic = -1, i = 0;

        System.out.println("Introduce la marca del coche: " );
        marcaCoche = captura.nextLine();

        while ( !existe && i < coche.size()){

            if (marcaCoche.equalsIgnoreCase(coche.get(i).getMarcaCoche())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }

        return posic;
    }

    public static void validarVelocidad()  {
        int velocidadCoche = 0;


        System.out.println("Introduce la velocidad del coche: " );
        velocidadCoche = captura.nextInt();

        if (velocidadCoche > 80) {
            System.out.println("Has excedido la velocidad maxima: " );
        } else if (velocidadCoche >= 61 && velocidadCoche < 79) {
            System.out.println("Vas bien conduce con precaución ");
        } else if (velocidadCoche > 40 && velocidadCoche < 60) {
            System.out.println("Puedes ir mas rapido: ");
        }

    }
}