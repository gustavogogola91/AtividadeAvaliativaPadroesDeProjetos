package Questao4;

public class ExportacaoDecorator extends RelatorioDecorator {

    public ExportacaoDecorator(IRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String Descricao() {

        return relatorio.Descricao() + ", exportação";
        }

}
