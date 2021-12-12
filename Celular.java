package pregunta2;

public class Celular implements Promocionable {

    private String codigo;
    private String marca;
    private double precio;
    private Pantalla pantalla;

    public Celular(String codigo, String marca, double precio, double nroPulgadas, String resolucion) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.pantalla = new Pantalla(nroPulgadas, resolucion);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public double calcularPromocion() {
        double dsctoPromocion = 0.1;
        return precio * (1 - dsctoPromocion);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=S/ " + precio +
                ", precioPromocion=S/ " + calcularPromocion() +
                ", pantalla=" + pantalla +
                '}';
    }
}
