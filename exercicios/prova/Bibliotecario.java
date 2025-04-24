import java.util.Random;

public class Bibliotecario {
    private Random rand = new Random();
    private String numeroRegistro = String.format("%4d", rand.nextInt(10000));
    private String nome;

    public Bibliotecario(String nome) {
        this.nome = nome;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getNome() {
        return nome;
    }
}
