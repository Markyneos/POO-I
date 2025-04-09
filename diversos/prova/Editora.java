public class Editora {
    private String nome;
    private String cidade;

    public Editora(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Editora(String nome) {
        this.nome = nome;
    }

    public Editora() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String novaCidade) {
        cidade = novaCidade;
    }
}
