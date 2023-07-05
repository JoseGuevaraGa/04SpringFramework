import java.util.Scanner;

public class extra3Pintura {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        float alt, litros, area, mans, ample, totaLitros;
        final int coberturaLitro = 12;

        System.out.println("Introdueix L'alt de la paret : " );
        alt = captura.nextInt();
        System.out.println("Introdueix ample de la paret : " );
        ample = captura.nextInt();
        System.out.println("Introdueix el nombre de mans a aplicar : " );
        mans = captura.nextInt();
        area = alt * ample;
        litros = area / coberturaLitro;
        totaLitros = litros * mans;

        System.out.println("Els litres de pintura a utilitzar : " + totaLitros );


    }
}
