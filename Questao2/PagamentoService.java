package Questao2;

public class PagamentoService {
    public IPagamento GerarPagamento(IPagamentoFactory factory) {
        IPagamento pagamento = factory.CriarPagamento();

        return pagamento;
    }
}
