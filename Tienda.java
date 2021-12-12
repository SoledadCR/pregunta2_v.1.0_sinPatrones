package pregunta2;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    private List<Celular> celulares;
    private List<Servicio> servicios;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.celulares = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void agregarCelular(Celular celular) {
        this.celulares.add(celular);
    }

    public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public double obtenerValorTotal() {
        double sumaTotal = 0;
        for (Celular celular: celulares) {
            sumaTotal = sumaTotal + celular.calcularPromocion();
        }
        for (Servicio servicio: servicios) {
            sumaTotal = sumaTotal + servicio.calcularPromocion();
        }
        return sumaTotal;
    }
}
