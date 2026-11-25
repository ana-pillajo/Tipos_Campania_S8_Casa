public class CampaniaInfluencers extends Campania {
    private int numeroInfluencers;

    public CampaniaInfluencers(String nombre, double presupuestoBase, int numeroInfluencers) {
        super(nombre, presupuestoBase);
        this.numeroInfluencers = numeroInfluencers;
    }

    @Override
    public double calcularCosto() {
        return presupuestoBase + numeroInfluencers * 500.0;
    }

    @Override
    public String mostrarInformacion() {
        return "[Influencers] " + super.mostrarInformacion()
                + " - Influencers: " + numeroInfluencers
                + " - Costo: $" + String.format("%.2f", calcularCosto());
    }
}