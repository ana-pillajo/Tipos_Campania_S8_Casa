public class Main {
    public static void main(String[] args) {
        Campania redes = new CampaniaRedes("Navidad en Instagram", 300.00, 20);
        Campania email = new CampaniaEmail("Newsletter Black Friday", 100.00, 15000);
        Campania influ = new CampaniaInfluencers("Lanzamiento peluches", 500.00, 3);

        PlanMarketing plan = new PlanMarketing("Plan Fin de Año");
        plan.agregarCampania(redes);
        plan.agregarCampania(email);
        plan.agregarCampania(influ);

        System.out.println("=== COSTO POR CAMPAÑA ===");
        System.out.println(redes.getNombre() + ": $" + String.format("%.2f", redes.calcularCosto()));
        System.out.println(email.getNombre() + ": $" + String.format("%.2f", email.calcularCosto()));
        System.out.println(influ.getNombre() + ": $" + String.format("%.2f", influ.calcularCosto()));
        System.out.println();

        System.out.println("=== LISTADO DEL PLAN ===");
        System.out.println(plan.listarCampanias());

        System.out.println("Costo total del plan: $" + String.format("%.2f", plan.calcularCostoTotal()));
        System.out.println();

        System.out.println("=== DESAFÍO: CAMPAÑA DE VIDEO ===");
        Campania video = new CampaniaVideo("Spot YouTube", 400.00, 30);
        plan.agregarCampania(video);
        System.out.println(plan.listarCampanias());
        System.out.println("Campañas en el plan: " + plan.cantidadCampanias());
        System.out.println("Nuevo costo total del plan: $" + String.format("%.2f", plan.calcularCostoTotal()));
    }
}