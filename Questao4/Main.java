package Questao4;

public class Main {
    public static void main(String[] args) {

        // Criação de um relatorio base
        IRelatorio relatorio1 = new Relatorio();

        // Adicionando Graficos ao relatorio 1
        relatorio1 = new GraficosDecorator(relatorio1);
        System.out.println(relatorio1.Descricao());

        // Adicionado Estatisticas do faturamento ao relatorio 1
        relatorio1 = new EstatisticasFaturamentoDecorator(relatorio1);
        System.out.println(relatorio1.Descricao());

        // Adicionado Exportacao ao relatorio 1
        relatorio1 = new ExportacaoDecorator(relatorio1);
        System.out.println(relatorio1.Descricao());
        System.out.println();

        // Criando novo relatorio
        IRelatorio relatorio2 = new Relatorio();

        // Adicionadno exportação
        relatorio2 = new ExportacaoDecorator(relatorio2);
        System.out.println(relatorio2.Descricao());
    }
}
