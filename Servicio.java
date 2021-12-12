package pregunta2;

public class Servicio implements Promocionable {

    private String codigo;
    private String nombre;
    private double precio;

    public Servicio(String codigo, String nombre, double precio) throws Exception {
        if (precio > 5000) {
            throw new Exception("Precio muy alto");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double calcularPromocion() {
        double dsctoPromocion = 0.1;
        return precio * (1 - dsctoPromocion);
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=S/ " + precio +
                ", precioPromocion=S/ " + calcularPromocion() +
                '}';
    }
}
