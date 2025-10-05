package Questao2;

public class PagamentoBoletoFactory implements IPagamentoFactory {
    @Override
    public IPagamento CriarPagamento() {
        return new PagamentoBoleto();
    }
}
