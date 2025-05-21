public abstract class Instrumento {
	private static int autoIncrement = 0;
	private int id;
	private String modelo;
	private double preco;

	public Instrumento(String modelo, double preco) {
		this.id = autoIncrement;
		this.modelo = modelo;
		this.preco = preco;
		autoIncrement++;
	}

	public int getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double novoPreco) {
		preco = novoPreco;
	}

	public void exibirInformacoes() {
		System.out.printf("Id: %d | Modelo: %s | Preço: %.2f", id, modelo, preco);
	}
}
