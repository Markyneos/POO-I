public class Contato {
    private String tipo;
    private String contato;

    public Contato(String tipo, String contato) {
        this.tipo = tipo;
        this.contato = contato;
    }

    public String getTipo() {
        return tipo;
    }

    public String getContato() {
        return contato;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s\nContato: %s\n", tipo, contato);
    }

}
