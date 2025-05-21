public class Piano extends Instrumento implements InstrumentoCorda, InstrumentoAcustico {

	private int numeroDeTeclas = 88;
	private String afinacao = "Internacional";

	public Piano(String modelo, double preco) {
		super(modelo, preco);
	}

	public int getNumeroDeTeclas() {
		return numeroDeTeclas;
	}

	public String getAfinacao() {
		return afinacao;
	}

	public void tocarCorda(int corda) {
		System.out.println("Som!");
	}

	public void tocarAcorde(String acorde) {
		switch (acorde) {
			case "A":
				System.out.println(listaAcordes[0]);
				break;
			case "B":
				System.out.println(listaAcordes[1]);
				break;
			case "C":
				System.out.println(listaAcordes[2]);
				break;
			case "D":
				System.out.println(listaAcordes[3]);
				break;
			case "E":
				System.out.println(listaAcordes[4]);
				break;
			case "F":
				System.out.println(listaAcordes[5]);
				break;
			case "G":
				System.out.println(listaAcordes[6]);
				break;
			default:
				System.out.println(
						"Esse acorde não está na base de dados... Selecione um acorde maior simples!");
		}
	}

	public void afinar(String afinacao) {
		if (afinacao == "Padrão" || afinacao == "Internacional") {
			this.afinacao = afinacao;
			System.out.println("Seu piano está afinado!");
		} else {
			System.out.println("O piano só pode ser afinado na forma internacional/padrão...");
		}
	}

	public void tocarAcustico() {
		System.out.println("Tuun!");
	}
}
