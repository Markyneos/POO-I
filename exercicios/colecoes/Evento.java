import java.util.Set;
import java.util.TreeSet;

public class Evento {
	private String nome;
	private Set<Participante> lista = new HashSet<Participante>();

	public Evento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionarParticipante(Participante p) {
		if (lista.contains(p)) {
			System.out.println("O participante já está cadastrado no evento.");
		} else {
			lista.add(p);
		}
	}
}
