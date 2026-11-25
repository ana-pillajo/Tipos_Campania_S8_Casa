public class Campania {
    protected String nombre;
    protected double presupuestoBase;

    public Campania(String nombre, double presupuestoBase) {
        this.nombre = nombre;
        this.presupuestoBase = presupuestoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPresupuestoBase() {
        return presupuestoBase;
    }

    public double calcularCosto() {
        return presupuestoBase;
    }

    public String mostrarInformacion() {
        return nombre + " - Presupuesto base: $" + String.format("%.2f", presupuestoBase);
    }
}