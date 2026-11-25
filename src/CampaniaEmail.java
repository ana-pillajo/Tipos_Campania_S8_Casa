public class CampaniaEmail extends Campania {
    private int cantidadCorreos;

    public CampaniaEmail(String nombre, double presupuestoBase, int cantidadCorreos) {
        super(nombre, presupuestoBase);
        this.cantidadCorreos = cantidadCorreos;
    }

    @Override
    public double calcularCosto() {
        return presupuestoBase + cantidadCorreos * 0.01;
    }

    @Override
    public String mostrarInformacion() {
        return "[Email] " + super.mostrarInformacion()
                + " - Correos: " + cantidadCorreos
                + " - Costo: $" + String.format("%.2f", calcularCosto());
    }
}