public class Livro extends Produto {
	public String autor;
	public int paginas;

	public Livro(String autor, int paginas, String nome, double preco) {
		super(nome, preco);
		this.autor = autor;
		this.paginas = paginas;
	}

	public void eGrande() {
		if (paginas > 100) {
			System.out.println("Livro grande");
		} else {
			System.out.println("Livro pequeno");
		}
	}
}
