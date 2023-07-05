package m8ejercicio6;

public class Piloto extends Trabajador{

    private double sueldoPiloto;
    private double alturaPiloto;
    private int peso;

    public Piloto(String nombre, String apellido, int edad, int antiguedad, double sueldo, double sueldoPiloto, double alturaPiloto, int peso) {
        super(nombre, apellido, edad, antiguedad);
        this.sueldoPiloto = sueldoPiloto;
        this.alturaPiloto = alturaPiloto;
        this.peso = peso;
    }
}
