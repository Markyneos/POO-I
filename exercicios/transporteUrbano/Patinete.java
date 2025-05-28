public class Patinete extends ModoTransporte implements IBateriaVerificavel {
	private int porcentagemBateria = 100;

	public Patinete(String id) {
		super(id);
	}

	public Patinete(String id, int porcentagemBateria) {
		super(id);
		this.porcentagemBateria = porcentagemBateria;
	}

	public void verificarBateria() {
		System.out.println("Verificando bateria do patinete... OK!");
	}

	public void exibirDetalhes() {
		System.out.println("Patinete Elétrico - ID: " + this.getId() + "\n" + "Bateria: " + porcentagemBateria
				+ "%");
		verificarBateria();
	}
}
