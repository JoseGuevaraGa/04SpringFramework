package m8ejercicio4;

public abstract class Edificio {
    protected String nombreEdificio;
    protected int    numeroPlantas, superficie;

    public Edificio(String nombreEdificio, int numeroPlantas, int superficie) {
        this.nombreEdificio = nombreEdificio;
        this.numeroPlantas = numeroPlantas;
        this.superficie = superficie;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public int getSuperficie() {
        return superficie;
    }

    public static double limpiar (int superficie, int numeroPlantas)  {
        // Tiempo que se tarda en limpiar el edificio 1 minuto x cada 5 m2
        // subir cada planta + .5 minutos, minuto se paga a 1 euro por día
        // Calcular y mostrar el precio por mes.
        int tiempoLimpieza = 0, minutosSuperficie = 0;
        double minutosPlanta = 0, medioMin = 0.5, totalMes;

        minutosSuperficie = superficie / 5;
        minutosPlanta = (double)numeroPlantas * medioMin;
        totalMes = (minutosSuperficie + minutosPlanta) * 30;

        return  totalMes;
    }

    public static double calcularCostVigilancia (int superficie, String tipo)  {
        // mostrarà el que costa al mes contractar vigilants a cada edifici.
        // vigilant d’hotel o hospital pot vigilar 1000 m²
        // cinemes poden vigilar 3000 m²
        // Contractar cada vigilant costa als propietaris de l’edifici 1.300 euros mensuals
        // però els vigilants d’hotels cobren un plus de perillositat de 500 euros mensuals.
        int precioVigilante = 1300, plusPeligro = 500;
        double totalCobertura = 0, coberturaVigilancia = 0, coberturaCinema = 0;

        if (tipo.equals("Hotel") || tipo.equals("Hospital") ){
            coberturaVigilancia = (double) superficie / 1000;
            totalCobertura = Math.ceil(coberturaVigilancia);
        }else{
            coberturaCinema = (double) superficie / 3000;
            totalCobertura = Math.ceil(coberturaVigilancia);
        }

        //minutosPlanta = (double)numeroPlantas * medioMin;
        //totalMes = (minutosSuperficie + minutosPlanta) * 30;

        return  totalCobertura;
    }

    public static String repartirComida (int enfermos)  {
        //  “S’estan repartint xxx racions”
        String mensaje = "";
        int comidasDia = 3;
        double totalComidas = 0;

        totalComidas = (double)enfermos * comidasDia;
        mensaje = ("Se estan repartiendo " + totalComidas + " raciones");
        return  mensaje;
    }

    public static String proyectarSesion (int asistentes, double precio)  {
        // “S’han recaptat xxx euros”
        String mensajeR = "";
        double totalRecaptacion = 0;

        totalRecaptacion = (double)asistentes * precio;
        mensajeR = ("Se ha recaudado " + totalRecaptacion + " euros");
        return  mensajeR;
    }

    public static double servicioHotel (int totalHabitaciones)  {
        // Es calcula que cada membre del servei pot atendre 20 habitacions
        // Quantes persones són necessàries per atendre el servei d’habitacions l’hotel
        // Quin és el total necessari per als sous d’aquestes persones
        // sueldo 1000 persona

        int atiende = 20, sueldo = 1000;
        double totalPersonas = 0, totalSueldos = 0;

        totalPersonas = (double)totalHabitaciones / atiende;

        totalSueldos = totalPersonas * sueldo;

        return  totalSueldos;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nombreEdificio='" + nombreEdificio + '\'' +
                ", numeroPlantas=" + numeroPlantas +
                ", superficie=" + superficie +
                '}';
    }
}
