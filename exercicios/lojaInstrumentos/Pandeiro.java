public class Pandeiro extends Instrumento implements InstrumentoAcustico, InstrumentoPercussao {

	public Pandeiro(String modelo, double preco) {
		super(modelo, preco);
	}

	public void tocar() {
		System.out.println("Tchic-tchic, plim-plim, tchic-bum!");
	}

	public void tocarAcustico() {
		System.out.println("Tchic-tchic, plim-plim, tchic-bum!");
	}
}
