package m8ejercicio3;

import java.util.ArrayList;

public class Cuenta {


    private int    numCuenta;
    private int    saldo;
    private ArrayList<Cuenta> cuentas;

    public Cuenta(int numCuenta, int saldo, ArrayList<Cuenta> cuentas) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.cuentas = cuentas;
    }

    public Cuenta(int numCuenta, int saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cuenta> getCuentas() {

        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }


}
