package Questao2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando teste \n\n\n");

       PagamentoService pagamentoService = new PagamentoService();


       System.out.println("Teste do pagamento por boleto");
       IPagamento boleto = pagamentoService.GerarPagamento(new PagamentoBoletoFactory());

       boleto.RealizarPagamento();

       System.out.println("\n\nTeste do pagamento por Cartao");
       IPagamento cartao = pagamentoService.GerarPagamento(new PagamentoCartaoFactory());

       cartao.RealizarPagamento();

       System.out.println("\n\nTeste de pagamento por PIX");
       IPagamento pix = pagamentoService.GerarPagamento(new PagamentoPixFactory());

       pix.RealizarPagamento();
    }
}
