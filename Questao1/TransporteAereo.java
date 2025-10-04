public class TransporteAereo implements ITransporte {
    // Caluclo do valor do frete com as regras específicas para transporte aereo++
    @Override
    public void CalcularValorFrete(double peso) {
        System.out.printf("Inciando cálculo do frete para transporte aéreo\nPreço por Kg: R$ 15,80 \nValor total: R$ %.2f\n", peso * 15.8);
    }
}
