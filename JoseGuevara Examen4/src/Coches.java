public class Coches {

    protected String marcaCoche;
    protected String modeloCoche;
    protected int potenciaCoche;

    protected int cilidandraCoche;
    protected String matriculaCoche;


    public Coches(String marcaCoche, String modeloCoche, int potenciaCoche, int cilidandraCoche, String matriculaCoche) {
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
        this.potenciaCoche = potenciaCoche;
        this.cilidandraCoche = cilidandraCoche;
        this.matriculaCoche = matriculaCoche;
    }

    public String getMarcaCoche() {
        return marcaCoche;
    }

    public void setMarcaCoche(String marcaCoche) {
        this.marcaCoche = marcaCoche;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public int getPotenciaCoche() {
        return potenciaCoche;
    }

    public void setPotenciaCoche(int potenciaCoche) {
        this.potenciaCoche = potenciaCoche;
    }

    public int getCilidandraCoche() {
        return cilidandraCoche;
    }

    public void setCilidandraCoche(int cilidandraCoche) {
        this.cilidandraCoche = cilidandraCoche;
    }

    public String getMatriculaCoche() {
        return matriculaCoche;
    }

    public void setMatriculaCoche(String matriculaCoche) {
        this.matriculaCoche = matriculaCoche;
    }



}
