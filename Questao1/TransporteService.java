public class TransporteService {
    // Utilizado o service para o usuário apenas chamar passando a fabrica que ele quer, sem precisar ter contato direto com a fábrica
    public void ProcessarTransporte(ITransporteFactory factory, double var) {
        ITransporte transporte = factory.CriarTransporte();
        transporte.CalcularValorFrete(var);
    }
}