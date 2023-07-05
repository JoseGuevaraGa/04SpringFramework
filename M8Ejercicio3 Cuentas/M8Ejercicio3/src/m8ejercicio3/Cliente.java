package m8ejercicio3;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Cuenta> getCuentas() {
        cuentas = new ArrayList<Cuenta>();
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void agregarCuentas(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }
}
