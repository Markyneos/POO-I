public class Onibus extends ModoTransporte {
	public Onibus(String id) {
		super(id);
	}

	public void exibirDetalhes() {
		System.out.println("Ônibus - ID: " + getId());
	}
}
