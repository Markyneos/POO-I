public class Livro {
    private static int numeroLivros = 0;
    private String nome;
    private int anoPublicacao;
    private Bibliotecario ultimaAlteracao;
    private Autor autor;
    private Detalhamento detalhamento;
    private Editora editora;

    public Livro(String nome, int anoPublicacao, String nomeAutor, String nacionalidadeAutor, String resumo,
            int quantidadePaginas, int quantidadeCapitulos,
            Editora editora, Bibliotecario bibliotecario) {
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = new Autor(nomeAutor, nacionalidadeAutor);
        this.detalhamento = new Detalhamento(resumo, quantidadePaginas, quantidadeCapitulos);
        this.editora = editora;
        this.ultimaAlteracao = bibliotecario;
        numeroLivros++;
    }

    public Livro(String nome, int anoPublicacao, String nomeAutor, String nacionalidadeAutor, int qtdPaginas,
            int qtdCapitulos, Editora editora, Bibliotecario bibliotecario) {
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = new Autor(nomeAutor, nacionalidadeAutor);
        this.detalhamento = new Detalhamento(qtdPaginas, qtdCapitulos);
        this.editora = editora;
        this.ultimaAlteracao = bibliotecario;
        numeroLivros++;
    }

    public Livro(String nome, int anoPublicacao, String nomeAutor, int qtdPaginas, int qtdCapitulos, Editora editora,
            Bibliotecario bibliotecario) {
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = new Autor(nomeAutor);
        this.detalhamento = new Detalhamento(qtdPaginas, qtdCapitulos);
        this.editora = editora;
        this.ultimaAlteracao = bibliotecario;
        numeroLivros++;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getNomeAutor() {
        return autor.getNome();
    }

    public String getNacionalidadeAutor() {
        return autor.getNacionalidade();
    }

    public void setResumo(String novoResumo, Bibliotecario ultimoBibliotecario) {
        this.detalhamento.setResumo(novoResumo);
        this.ultimaAlteracao = ultimoBibliotecario;
    }

    public String getResumo() {
        return detalhamento.getResumo();
    }

    public int getQuantidadePaginas() {
        return detalhamento.getQtdPaginas();
    }

    public int getQuantidadeCapitulos() {
        return detalhamento.getQtdCapitulos();
    }

    public static int getQuantidadeLivros() {
        return numeroLivros;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora novaEditora, Bibliotecario ultimaAlteracao) {
        this.editora = novaEditora;
        this.ultimaAlteracao = ultimaAlteracao;
    }

    public Bibliotecario getUltimaAlteracao() {
        return ultimaAlteracao;
    }

}
