package parcialpoo;
public class HabitacionSuite extends Habitacion {
    private double recargo;

    public HabitacionSuite(String numero, double tarifaBase, int noches, double recargo) {
        super(numero, "Suite", tarifaBase, noches);
        this.recargo = recargo;
    }

    public double calcularTotal() {
        double total = tarifaBase * noches;
        return total + (total * recargo / 100);
    }
}
