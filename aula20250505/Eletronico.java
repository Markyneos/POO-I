public class Eletronico extends Produto {
	public int voltagem;

	public Eletronico(int voltagem, String nome, double preco) {
		super(nome, preco);
		this.voltagem = voltagem;
	}

	@Override
	public void eCaro() {
		if (preco > 200) {
			System.out.println("Produto caro");
		} else {
			System.out.println("Produto barato");
		}
	}
}
