public class TransporteTerrestreFactory implements ITransporteFactory {
    // metodo que criar e retorna um obj TransporteTerrestre
    @Override
    public TransporteTerrestre CriarTransporte() {
        return new TransporteTerrestre();
    }
}
