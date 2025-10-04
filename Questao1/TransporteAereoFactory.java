public class TransporteAereoFactory implements ITransporteFactory {
    // metodo que criar e retorna um obj TransporteAereo
    @Override
    public TransporteAereo CriarTransporte() {
        return new TransporteAereo();
    }

}
