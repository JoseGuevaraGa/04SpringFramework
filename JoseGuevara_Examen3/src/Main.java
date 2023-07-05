import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int i = 0, j = 0;
        boolean existe = false;

        ArrayList<String> pDisponibles = new ArrayList<String>();
        ArrayList<String> vComprar = new ArrayList<String>();
        ArrayList<String> pComprados = new ArrayList<String>();

        pDisponibles.add("xampú");
        pDisponibles.add("sabó");
        pDisponibles.add("patates");
        pDisponibles.add("bledes");
        pDisponibles.add("lletuga");
        pDisponibles.add("llimones");
        pDisponibles.add("kiwis");
        pDisponibles.add("alvocats");
        pDisponibles.add("arròs");
        pDisponibles.add("cafè");
        pDisponibles.add("xocolata");

        vComprar.add("xampú");
        vComprar.add("xocolata");
        vComprar.add("alvocats");
        vComprar.add("bledes");
        vComprar.add("llimones");
        vComprar.add("llimonada");

        while ( i < vComprar.size()){

            j = 0;
            existe = false;
            
            while (!existe && j < pDisponibles.size()){
                if (vComprar.get(i) == pDisponibles.get(j)  ) {
                    pComprados.add(vComprar.get(i));
                    existe = true;
                }
                j++;
            }

            i++;
        }

        System.out.println("Productos comprados :" + pComprados);
    }
}