package pregunta2;

public class Pantalla {

    private double nroPulgadas;
    private String resolucion;

    public Pantalla(double nroPulgadas, String resolucion) {
        this.nroPulgadas = nroPulgadas;
        this.resolucion = resolucion;
    }

    public double getNroPulgadas() {
        return nroPulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "nroPulgadas=" + nroPulgadas +
                ", resolucion='" + resolucion + '\'' +
                '}';
    }
}
