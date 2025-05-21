import java.util.ArrayList;

public class Usuario {

	private boolean cpfRegistrado = false;
	private String cpf;
	private String telefone;
	private String nome;
	private ArrayList<Instrumento> carrinhoDeCompras = new ArrayList<Instrumento>();

	public Usuario(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		cpfRegistrado = true;
	}

	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String novoTelefone) {
		telefone = novoTelefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String novoCpf) {
		if (cpfRegistrado) {
			System.out.println("Já existe um cpf cadastrado para esse usuário");
		} else {
			cpf = novoCpf;
			cpfRegistrado = true;
		}
	}

	public void pagarCarrinho(double dinheiro) {
		double soma = 0.0;
		for (Instrumento i : carrinhoDeCompras) {
			soma += i.getPreco();
		}
		if (dinheiro >= soma) {
			carrinhoDeCompras.clear();
			System.out.println("Suas compras foram efetuadas com sucesso!");
		} else {
			System.out.println("Seu dinheiro foi insuficiente...");
		}
	}

	public void removerInstrumento(int id) {
		carrinhoDeCompras.remove(id);
	}

	public void adicionarInstrumento(Instrumento i) {
		carrinhoDeCompras.add(i);
		System.out.println("Instrumento adicionado!");
	}

	public void imprimirCarrinho() {
		for (int i = 0; i < carrinhoDeCompras.size(); i++) {
			System.out.printf("ID: %d | Modelo: %s | Preço: %.2f\n", i,
					carrinhoDeCompras.get(i).getModelo(),
					carrinhoDeCompras.get(i).getPreco());
		}
	}
}
