package m8ejercicio6;

import java.util.ArrayList;

public class Escuderia {
    private String nombre;
    private int presupuesto;
    private String paisOrigen;
    private ArrayList<Coche> coches;
    private ArrayList<Trabajador> trabajadores;

    public Escuderia(String nombre, int presupuesto, String paisOrigen) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.paisOrigen = paisOrigen;
        this.coches = new ArrayList<Coche>();
        this.trabajadores = new ArrayList<Trabajador>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
