abstract class MeioPagamento {
	private String id;

	public MeioPagamento(String id) {
		this.id = id;
	}

	public void exibirDetalhes() {
		System.out.println("Identificado: " + id);
	}

	public String getId() {
		return id;
	}
}
