package m8ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner captura = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();

        boolean sortir = false;
        int posicion = 0;

        Cliente jose = new Cliente("Jose", "Guevara");
        clientes.add(jose);
        Cliente miguel = new Cliente("Miguel", "Ramos");
        clientes.add(miguel);

        Cuenta uno = new Cuenta(1, 0);
        listaCuentas.add(uno);


        do{
            switch(menu()){
                case 1:
                    posicion = buscarCliente(clientes);
                    crearCliente(clientes, posicion);
                    break;
                case 2:
                    posicion = buscarCliente(clientes);
                    eliminarCliente(clientes, posicion);
                    break;
                case 3:
                    posicion = buscarCliente(clientes);
                    crearCuenta(clientes,listaCuentas, posicion);
                    break;
                case 4:
                    buscarCliente(clientes);
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
        final byte MAXIMO = 5;

        do{
            System.out.println("\nMENú PRINCIPAL CLIENTES");
            System.out.println("0. Salir de la apliacacion.");
            System.out.println("1. Crear Client/a.");
            System.out.println("2. Eliminar Client/a.");
            System.out.println("3. Crear cuenta Client/a.");
            System.out.println("4. Ingresar euros en una cuenta de un Client/a.");
            System.out.println("5. Retirar euros en una cuenta de un Client/a.\n");

            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static void crearCliente(ArrayList<Cliente> clientes, int posicion)  {

        String nombreCliente = " ", apellidoCliente;

        System.out.println("Posicion:" + posicion );

        if (posicion < 0){

            System.out.println("Introduce el nombre del client/a: " );
            nombreCliente = captura.nextLine();

            System.out.println("Introduce el apellido del client/a:");
            apellidoCliente = captura.nextLine();

            captura.nextLine();

            Cliente cliente = new Cliente(nombreCliente, apellidoCliente);
            clientes.add(cliente);

            System.out.println("Clientes : " + clientes.get(0).getNombre() );

        }

        System.out.println("Client/a dado de Alta." + nombreCliente);


    }

    public static int buscarCliente (ArrayList<Cliente> clientes)  {
        boolean existe = false;
        String nombreCliente;
        int posic = -1, i = 0;

        System.out.println("Introduce el nombre del Cliente: " );
        nombreCliente = captura.nextLine();

        while ( !existe && i < clientes.size()){
            //    System.out.println("Nombre:" + hoteles.get(i).getNombre() );
            if (nombreCliente.equalsIgnoreCase(clientes.get(i).getNombre())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }

        System.out.println("Clientes tamaño :" + clientes.size());

        return posic;
    }

    public static void eliminarCliente(ArrayList<Cliente> clientes, int posicion)  {

        System.out.println("Posicion:" + posicion );

        if (posicion < 0){
            System.out.println("El Client/a no existe .");
        }else{
            clientes.remove(posicion);
            System.out.println("El Client/a eliminado .");

        }
    }

    public static void crearCuenta(ArrayList<Cliente> clientes,ArrayList<Cuenta> listaCuentas, int posicion)  {

        int posicionC = 0;
        //Cliente cliente = introducirDatosCliente(clientes);

        System.out.println("Posicion C:" + posicion );

        if (posicion < 0){
            System.out.println("El Client/a no existe .");
        }else{
            posicionC = buscarCuenta(listaCuentas);
            // Cuenta.getCuentas() = ArrayList<Cuenta> listaCuentas;
            Cuenta cuenta = new Cuenta(1, 0, listaCuentas);
            //Cliente.getCuentas().add(cuenta);
    
     
            //Cuenta cuenta = new Cuenta(1, 0, listaCuentas);
            //listaCuentas.add(cuenta);

            System.out.println("Cuenta dada de alta .");
        }
    }

    public static int buscarCuenta (ArrayList<Cuenta> listaCuentas)  {
        boolean existe = false;
        int numeroCuenta;
        int posicU = -1, i = 0;

        System.out.println("Introduce el numero de Cuenta: " );
        numeroCuenta = captura.nextInt();

        while ( !existe && i < listaCuentas.size()){
            System.out.println("Cuenta:" + listaCuentas.get(i).getNumCuenta() );
            if (numeroCuenta == listaCuentas.get(i).getNumCuenta()) {
                posicU = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }

        System.out.println("Cuentas tamaño :" + listaCuentas.size());

        return posicU;
    }



}
