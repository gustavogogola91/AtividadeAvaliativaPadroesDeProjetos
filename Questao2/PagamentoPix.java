package Questao2;

public class PagamentoPix implements IPagamento {
    @Override
    public void RealizarPagamento() {
        System.out.println("Pagamento realizado no PIX");
    }
}
