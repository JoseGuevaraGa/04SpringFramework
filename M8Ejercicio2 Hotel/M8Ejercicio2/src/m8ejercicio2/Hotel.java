package m8ejercicio2;

public class Hotel {
    //Aquest mètode ha de tenir en compte que cada persona del servei pot atendre 20 habitacions i
    // haurà de mostrar quantes persones són necessàries per atendre el servei d’habitacions de l’hotel
    // i quin és el cost total destinat al servei sabent que aquestes persones cobren 1.500 al mes.
   private String nombre;
   private int    numHabitaciones;
   private int    numPlantas;
   private int    superficieHotel;

    public Hotel(String nombre, int numHabitaciones, int numPlantas, int superficieHotel) {
        this.nombre = nombre;
        this.numHabitaciones = numHabitaciones;
        this.numPlantas = numPlantas;
        this.superficieHotel = superficieHotel;
    }

    public double CalcularManteniment() {
        int sueldo = 1500, maxHabitaciones = 20;
        String resultado = " ";

        double calculoPersonal = 0 , totalSueldos = 0;

        calculoPersonal = this.numHabitaciones / maxHabitaciones;
        totalSueldos = calculoPersonal * sueldo;

        return totalSueldos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    public int getSuperficieHotel() {
        return superficieHotel;
    }

    public void setSuperficieHotel(int superficieHotel) {
        this.superficieHotel = superficieHotel;
    }
}
