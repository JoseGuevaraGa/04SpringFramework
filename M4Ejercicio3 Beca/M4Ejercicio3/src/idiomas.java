import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class idiomas {
    public static void main(String[] args) {
        Scanner recibe = new Scanner(System.in);

        int edad;
        String titulo;
        String paro;
        String nombre;
        boolean beca = false;
        ArrayList<String> becados = new ArrayList<String>();


        int i = 0;
        do {
            System.out.println("Introdueix nombre : ");
            nombre = recibe.next();

            System.out.println("Introdueix edat : ");
            edad = recibe.nextInt();

            System.out.println("téns un títol universitari? S o N : ");
            //titulo = recibe.next().charAt(0);
            titulo = recibe.next();
            titulo.toUpperCase();
            System.out.println("Estàs a l’atur S o N : ");
            paro = recibe.next();
            paro.toUpperCase();


            if (edad >= 18 && titulo.equals("S")) {  becados.add(nombre); }
            else if (paro.equals("S") ){ becados.add(nombre); }

            i++;
        }
        while (i < 5);

        int size = becados.size();
        System.out.println("size " + size);
        int j = 0;
        while (j < size) {
            System.out.println("l’alumne/a si té beca " + becados.get(j));
            j++;
        }
        /*
        if (beca){
            System.out.println("l’alumne/a si té beca " );
        }else{
            System.out.println("l’alumne/a no té beca    ");
        } */

    }
}
