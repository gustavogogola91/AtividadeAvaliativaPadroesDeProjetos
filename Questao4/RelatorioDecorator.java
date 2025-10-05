package Questao4;

public abstract class RelatorioDecorator implements IRelatorio {

    protected IRelatorio relatorio;

    public RelatorioDecorator(IRelatorio relatorio) {
        this.relatorio = relatorio;
    }

}
