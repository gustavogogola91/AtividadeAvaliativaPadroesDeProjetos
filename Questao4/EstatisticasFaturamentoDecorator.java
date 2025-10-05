package Questao4;

public class EstatisticasFaturamentoDecorator extends RelatorioDecorator {

    public EstatisticasFaturamentoDecorator(IRelatorio relatorio) {
        super(relatorio);

    }

    @Override
    public String Descricao() {
        return relatorio.Descricao() + ", estatisticas de faturamento";
    }

}
