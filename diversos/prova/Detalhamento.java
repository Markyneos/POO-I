public class Detalhamento {
    private String resumo;
    private int qtdPaginas;
    private int qtdCapitulos;
    private boolean resumoFeito = false;

    public Detalhamento(String resumo, int qtdPaginas, int qtdCapitulos) {
        this.resumo = resumo;
        this.qtdPaginas = qtdPaginas;
        this.qtdCapitulos = qtdCapitulos;
        resumoFeito = true;
    }

    public Detalhamento(int qtdPaginas, int qtdCapitulos) {
        this.qtdPaginas = qtdPaginas;
        this.qtdCapitulos = qtdCapitulos;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String novoResumo) {
        resumo = novoResumo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int novaQuantidade) {
        this.qtdPaginas = novaQuantidade;
    }

    public int getQtdCapitulos() {
        return qtdCapitulos;
    }

    public void setQtdCapitulos(int novaQuantidade) {
        this.qtdCapitulos = novaQuantidade;
    }
}
