public class Circuito {

    protected String nombreCircuito;
    protected int tamañoCircuito;
    protected int totalCoches;

    public Circuito(String nombreCircuito, int tamañoCircuito, int totalCoches) {
        this.nombreCircuito = nombreCircuito;
        this.tamañoCircuito = tamañoCircuito;
        this.totalCoches = totalCoches;
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }

    public void setNombreCircuito(String nombreCircuito) {
        this.nombreCircuito = nombreCircuito;
    }

    public int getTamañoCircuito() {
        return tamañoCircuito;
    }

    public void setTamañoCircuito(int tamañoCircuito) {
        this.tamañoCircuito = tamañoCircuito;
    }

    public int getTotalCoches() {
        return totalCoches;
    }

    public void setTotalCoches(int totalCoches) {
        this.totalCoches = totalCoches;
    }
}
