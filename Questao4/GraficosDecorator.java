package Questao4;

public class GraficosDecorator extends RelatorioDecorator {

    public GraficosDecorator(IRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String Descricao() {
        return relatorio.Descricao() + ", gráficos";
    }

}
