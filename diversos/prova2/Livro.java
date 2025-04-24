public class Livro {
    private String titulo;
    private int anoPubli;
    private Editora editora;
    private Map<Autor> listaAutores = new HashMap<Autor>();

    public Livro(String titulo, int anoPubli, Editora editora) {
        this.titulo = titulo;
        this.anoPubli = anoPubli;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public Editora getEditora() {
        return editora;
    }

    public void adicionarAutor(Autor autor) {
        listaAutores.put(autor.getAbreviatura(), autor.getNome());
    }

    public String getAutor(String abreviatura) {
        return listaAutores.get(abreviatura);
    }
}
