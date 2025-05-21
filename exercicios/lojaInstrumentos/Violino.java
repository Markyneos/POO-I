public class Violino extends Instrumento implements InstrumentoCorda, InstrumentoAcustico {

	private int numeroDeCordas = 4;
	private String afinacao = "Padrão";

	public Violino(String modelo, double preco) {
		super(modelo, preco);
	}

	public int getNumeroDeCordas() {
		return numeroDeCordas;
	}

	public String getAfinacao() {
		return afinacao;
	}

	public void tocarCorda(int corda) {
		switch (corda) {
			case 1:
				System.out.println("Sol!");
				break;
			case 2:
				System.out.println("Ré!");
				break;
			case 3:
				System.out.println("Lá!");
				break;
			case 4:
				System.out.println("Mi!");
				break;
			default:
				System.out.println("Este instrumento não tem esse número de cordas...");
		}
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
		if (afinacao == "Padrão") {
			System.out.println("G D A E");
		} else {
			System.out.println("O violino só possui uma afinação... a padrão!");
		}
	}

	public void tocarAcustico() {
		System.out.println("Vooooooonn!");
	}

}
