package Questao2;

public class PagamentoCartaoFactory implements IPagamentoFactory {
    @Override
    public IPagamento CriarPagamento() {
        return new PagamentoCartao();
    }
}
