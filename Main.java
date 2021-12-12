package pregunta2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("A)");
        System.out.println("B)");

        Tienda tiendaCelcom = new Tienda("Celcom");

        Celular celularA = new Celular("CEL01", "Samsung", 1500, 16.5, "1980x1200");
        Celular celularB = new Celular("CEL02", "Apple", 4000, 14, "3250x2800");
        Celular celularC = new Celular("CEL03", "Nokia", 800, 5, "300x400");

        try {
            Servicio servicioA = new Servicio("SER01", "Cambio de Pantalla", 200);
            tiendaCelcom.agregarServicio(servicioA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Servicio servicioB = new Servicio("SER02", "Actualizacion de Firmware", 250);
            tiendaCelcom.agregarServicio(servicioB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Servicio servicioC = new Servicio("SER03", "Migracion de equipo", 50);
            tiendaCelcom.agregarServicio(servicioC);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tiendaCelcom.agregarCelular(celularA);
        tiendaCelcom.agregarCelular(celularB);
        tiendaCelcom.agregarCelular(celularC);


        System.out.println("Informacion de la Tienda:");
        System.out.println("========================");
        System.out.println("Nombre: " + tiendaCelcom.getNombre());
        System.out.println("Celulares disponibles:");
        List<Celular> celularesRegistrados = tiendaCelcom.getCelulares();
        for (Celular celular: celularesRegistrados) {
            System.out.println(celular);
        }

        System.out.println("Servicios disponibles:");
        List<Servicio> serviciosRegistrados = tiendaCelcom.getServicios();
        for (Servicio servicio: serviciosRegistrados) {
            System.out.println(servicio);
        }

        System.out.println("Valor Total: S/ " + tiendaCelcom.obtenerValorTotal());

        System.out.println("E)");
        try {
            Servicio servicioD = new Servicio("SER05", "Compra de toda la tienda", 25050);
            tiendaCelcom.agregarServicio(servicioD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
