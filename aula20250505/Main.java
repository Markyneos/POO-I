import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto("Produto genérico", 150);
		Livro l1 = new Livro("Franz Kafka", 83, "Metamorfose", 150);
		Eletronico e1 = new Eletronico(110, "Televisão", 2210);

		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(p1);
		listaProdutos.add(l1);
		listaProdutos.add(e1);

		for (Produto p : listaProdutos) {
			System.out.println(p.nome);
			p.eCaro();
		}
	}
}
