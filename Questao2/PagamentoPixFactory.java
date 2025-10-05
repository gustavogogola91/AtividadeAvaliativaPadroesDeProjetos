package Questao2;

public class PagamentoPixFactory implements IPagamentoFactory{
    @Override
    public IPagamento CriarPagamento() {
        return new PagamentoPix();
    }
}
