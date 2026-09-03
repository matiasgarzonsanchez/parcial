package parcialpoo;

public class Habitacion {
    protected String numero;
    protected String tipo;
    protected double tarifaBase;
    protected int noches;

    public Habitacion(String numero, String tipo, double tarifaBase, int noches) {
        if (tarifaBase < 0) {
            throw new IllegalArgumentException("La tarifa base no puede ser negativa");
        }
        if (noches <= 0) {
            throw new IllegalArgumentException("La cantidad de noches debe ser mayor a cero");
        }
        this.numero = numero;
        this.tipo = tipo;
        this.tarifaBase = tarifaBase;
        this.noches = noches;
    }

    public double calcularTotal() {

        return tarifaBase * noches;
    }

    public boolean esIgual(Habitacion otra) {
    return numero.equals(otra.numero);
    }

    public String toString() {
        return "habitacion " + numero + " - " + tipo + " - Tarifa base: " + tarifaBase + " - Noches: " + noches + " - Total: " + calcularTotal();
    }
}
