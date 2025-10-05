package Questao2;

public class PagamentoCartao implements IPagamento {
    @Override
    public void RealizarPagamento() {
        System.out.println("Pagamento realizado com cartao de credito.");
    }

}
