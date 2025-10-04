public class Main {
    public static void main(String[] args) {
        
        TransporteService ts = new TransporteService();

        System.out.println("Iniciando teste Transporte Aereo");
        ts.ProcessarTransporte(new TransporteAereoFactory(), 10);
        
        System.out.println("\n\n\nIniciando teste Transporte Terrestre");
        ts.ProcessarTransporte(new TransporteTerrestreFactory(), 10);
    }
}
