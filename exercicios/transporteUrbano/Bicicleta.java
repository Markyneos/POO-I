public class Bicicleta extends ModoTransporte implements IBateriaVerificavel {
	private int porcentagemBateria = 100;

	public Bicicleta(String id) {
		super(id);
	}

	public Bicicleta(String id, int porcentagemBateria) {
		super(id);
		this.porcentagemBateria = porcentagemBateria;
	}

	public void verificarBateria() {
		System.out.println("Verificando bateria da bicicleta... OK!");
	}

	public void exibirDetalhes() {
		System.out.println("Bicicleta Compartilhada - ID: " + this.getId() + "\n" + "Bateria: "
				+ porcentagemBateria + "%");
		verificarBateria();
	}
}
