package parcialpoo;
public class Main {
    public static void main(String[] args) {
        System.out.println("Caso 1");
        try {
            Reserva reserva1 = new Reserva();
            reserva1.agregarHabitacion(new HabitacionSuite("301", 300000, 2, 20));
            reserva1.agregarHabitacion(new HabitacionOferta("208", 100000, 4, 15));
            reserva1.agregarHabitacion(new HabitacionEstandar("105", 150000, 3));
            reserva1.agregarHabitacion(new HabitacionSuite("402", 280000, 1, 20));
            reserva1.agregarHabitacion(new HabitacionOferta("110", 90000, 2, 0));
            reserva1.mostrarResumen();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Caso 2");
        try {
            Habitacion h = new HabitacionEstandar("105", 150000, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Caso 3");
        try {
            Habitacion h = new HabitacionSuite("999", 50000, 3, 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Caso 4");
        try {
            Reserva reserva4 = new Reserva();
            reserva4.agregarHabitacion(new HabitacionEstandar("H1", 120000, 1));
            reserva4.agregarHabitacion(new HabitacionEstandar("h2", 100000, 1));
            reserva4.agregarHabitacion(new HabitacionSuite("h3", 250000, 1, 20));
            reserva4.agregarHabitacion(new HabitacionSuite("h4", 300000, 1, 20));
            reserva4.agregarHabitacion(new HabitacionOferta("H5", 90000, 1, 0));
            reserva4.mostrarResumen();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Caso 5");
        try {
            Reserva reserva5 = new Reserva();
            reserva5.agregarHabitacion(new HabitacionSuite("501", 300000, 2, 20));
            reserva5.agregarHabitacion(new HabitacionSuite("501", 300000, 2, 20));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
