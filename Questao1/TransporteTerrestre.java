public class TransporteTerrestre implements ITransporte {

    // Caluclo do valor do frete com as regras específicas para transporte terrestre
    @Override
    public void CalcularValorFrete(double distancia) {
        System.out.printf("Inciando cálculo do frete para transporte terrestre \nPreço por Km: R$ 5,20\nValor total: R$ %.2f\n", distancia * 5.2);
    }

}
