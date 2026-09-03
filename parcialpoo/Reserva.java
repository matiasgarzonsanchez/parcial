package parcialpoo;
public class Reserva {
    private static int contadorId = 2031;
    private static final int Mamimo_abitaciones = 5;

    private int id;
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;

    public Reserva() {
        this.id = contadorId;
        contadorId++;
        this.habitaciones = new Habitacion[Mamimo_abitaciones];
        this.cantidadHabitaciones = 0;
    }

    public int getId() {
        return id;
    }

    public void agregarHabitacion(Habitacion nueva) {
        if (cantidadHabitaciones >= Mamimo_abitaciones) {
            throw new IllegalArgumentException("No se pueden registrar mas de " + Mamimo_abitaciones + " habitaciones en la recerva");
        }
        for (int i = 0; i < cantidadHabitaciones; i++) {
            if (habitaciones[i].esIgual(nueva)) {
                throw new IllegalArgumentException("La habitacion ya se encuentra registrada en la recerva");
            }
        }
        habitaciones[cantidadHabitaciones] = nueva;
        cantidadHabitaciones++;
    }

    public double calcularTotalReserva() {
        double total = 0;
        for (int i = 0; i < cantidadHabitaciones; i++) {
            total = total + habitaciones[i].calcularTotal();
        }
        return total;
    }

    public void mostrarResumen() {
        System.out.println("Recerva " + id);
        for (int i = 0; i < cantidadHabitaciones; i++) {
            System.out.println(habitaciones[i].toString());
        }
        System.out.println("Total recerva: " + calcularTotalReserva());
    }
}
