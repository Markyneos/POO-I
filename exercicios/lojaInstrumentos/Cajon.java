public class Cajon extends Instrumento implements InstrumentoAcustico, InstrumentoPercussao {

	public Cajon(String modelo, double preco) {
		super(modelo, preco);
	}

	public void tocarAcustico() {
		System.out.println("Tuts, tats, tuts, tats, tuts, tats!");
	}

	public void tocar() {
		System.out.println("Tuts, tuts, tuts, TATS! Tuts, tuts, tuts, TATS!");
	}
}
