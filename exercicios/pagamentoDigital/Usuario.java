import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<MeioPagamento> listaMeios = new ArrayList<MeioPagamento>();

	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList getLista() {
		return listaMeios;
	}

	public void adicionarMeio(MeioPagamento novoMeio) {
		listaMeios.add(novoMeio);
	}

	public void mostrarPagamentos() {
		for (MeioPagamento m : listaMeios) {
			if (m instanceof CartaoCredito) {
				System.out.println("Cartão de Crédito: " + m.getId());
			} else if (m instanceof BoletoBancario) {
				System.out.println("Código Boleto: " + m.getId());
			} else {
				System.out.println("Chave Pix: " + m.getId());
			}
		}
	}
}
