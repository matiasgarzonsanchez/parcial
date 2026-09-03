package parcialpoo;
public class HabitacionOferta extends Habitacion {
    private double descuento;

    public HabitacionOferta(String numero, double tarifaBase, int noches, double descuento) {
        super(numero, "Oferta", tarifaBase, noches);
        this.descuento = descuento;
    }

    public double calcularTotal() {
        double total = tarifaBase * noches;
        return total - (total * descuento / 100);
    }
}
