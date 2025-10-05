package Questao2;

public class PagamentoBoleto implements IPagamento {
    @Override
    public void RealizarPagamento() {
       System.out.println("Pagamento realizado no Boleto");
    }
}
