package m8ejercicio6;

public class Coche {
    protected int potencia;
    protected int velocidadMax;
    protected String color;
    protected int precio;

    public Coche(int potencia, int velocidadMax, String color, int precio) {
        this.potencia = potencia;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.precio = precio;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
