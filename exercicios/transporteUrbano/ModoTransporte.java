public abstract class ModoTransporte {
	private String id;

	public ModoTransporte(String id) {
		this.id = id;
	}

	public abstract void exibirDetalhes();

	public String getId() {
		return id;
	}
}
