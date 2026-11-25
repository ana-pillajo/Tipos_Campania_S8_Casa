public class CampaniaVideo extends Campania {
    private int duracionSegundos;

    public CampaniaVideo(String nombre, double presupuestoBase, int duracionSegundos) {
        super(nombre, presupuestoBase);
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public double calcularCosto() {
        return presupuestoBase + duracionSegundos * 20.0;
    }

    @Override
    public String mostrarInformacion() {
        return "[Video] " + super.mostrarInformacion()
                + " - Duración: " + duracionSegundos + " s"
                + " - Costo: $" + String.format("%.2f", calcularCosto());
    }
}