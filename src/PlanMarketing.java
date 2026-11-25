import java.util.ArrayList;

public class PlanMarketing {
    private String nombre;
    private ArrayList<Campania> campanias;

    public PlanMarketing(String nombre) {
        this.nombre = nombre;
        campanias = new ArrayList<>();
    }

    public void agregarCampania(Campania campania) {
        if (campania != null) {
            campanias.add(campania);
        }
    }

    public int cantidadCampanias() {
        return campanias.size();
    }

    public String listarCampanias() {
        String resultado = "Plan: " + nombre + "\n";
        for (Campania campania : campanias) {
            resultado += campania.mostrarInformacion() + "\n";
        }
        return resultado;
    }

    public double calcularCostoTotal() {
        double total = 0;
        for (Campania campania : campanias) {
            total += campania.calcularCosto();
        }
        return total;
    }
}