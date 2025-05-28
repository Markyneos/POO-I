import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<ModoTransporte> listaTransportes = new ArrayList<ModoTransporte>();

	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void mostrarTransportes() {
		for (ModoTransporte m : listaTransportes) {
			if (m instanceof IBateriaVerificavel) {
				m.exibirDetalhes();
			} else {
				m.exibirDetalhes();
				System.out.println("Ônibus não requer verificação de bateria.");
			}
		}
	}

	public void adicionarTransporte(ModoTransporte novoTransporte) {
		listaTransportes.add(novoTransporte);
	}

	public ArrayList getListaTransportes() {
		return listaTransportes;
	}

}
