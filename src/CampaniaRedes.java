public class CampaniaRedes extends Campania {
    private int numeroPublicaciones;

    public CampaniaRedes(String nombre, double presupuestoBase, int numeroPublicaciones) {
        super(nombre, presupuestoBase);
        this.numeroPublicaciones = numeroPublicaciones;
    }

    @Override
    public double calcularCosto() {
        return presupuestoBase + numeroPublicaciones * 15.0;
    }

    @Override
    public String mostrarInformacion() {
        return "[Redes] " + super.mostrarInformacion()
                + " - Publicaciones: " + numeroPublicaciones
                + " - Costo: $" + String.format("%.2f", calcularCosto());
    }
}