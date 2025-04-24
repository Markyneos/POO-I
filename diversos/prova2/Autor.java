public class Autor {
    private String autor;
    private String abreviatura;
    private List<Contato> listaContatos = new ArrayList<Contato>();

    public Autor(String autor, String abreviatura) {
        this.autor = autor;
        this.abreviatura = abreviatura;
    }

    public String getNome() {
        return nome;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void adicionarContato(String tipo, String contato) {
        listaContatos.add(new Contato(tipo, contato));
    }

    public void imprimirContatos() {
        for (int i = 0; i < listaContatos.size(); i++) {
            System.out.println(listaContatos.get(i));
        }
    }

    public int getQtdContatos() {
        return listaContatos.size();
    }
}
