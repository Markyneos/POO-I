public class Editora {
    private String nome;
    private String email;

    public Editora(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean setNome(String novoNome) {
        if (nome == novoNome) {
            return false
        }
        else {
            nome = novoNome;
            return true;
        }
    }

    public void setEmail(String novoEmail) {
        email = novoEmail;
    }
}
