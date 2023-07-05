package m8ejercicio6;

public class Mecanico extends Trabajador {
    private String estudiosMecanico;
    private double sueldoMecanico;

    public Mecanico(String nombre, String apellido, int edad, int antiguedad, double sueldo, String estudiosMecanico, double sueldoMecanico) {
        super(nombre, apellido, edad, antiguedad);
        this.estudiosMecanico = estudiosMecanico;
        this.sueldoMecanico = sueldoMecanico;
    }

    public String getEstudiosMecanico() {
        return estudiosMecanico;
    }

    public void setEstudiosMecanico(String estudiosMecanico) {
        this.estudiosMecanico = estudiosMecanico;
    }

    public double getSueldoMecanico() {
        return sueldoMecanico;
    }

    public void setSueldoMecanico(double sueldoMecanico) {
        this.sueldoMecanico = sueldoMecanico;
    }
}
