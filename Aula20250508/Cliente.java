import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String cpf;
	private List<Conta> listaContas = new ArrayList<Conta>();

	public Cliente(String nome, String cpf, double saldoInicial, int tipoConta) {
		this.nome = nome;
		this.cpf = cpf;
		switch (tipoConta) {
			case 1:
				listaContas.add(new ContaCorrente(saldoInicial));
				break;
			case 2:
				listaContas.add(new ContaPoupanca(saldoInicial));
				break;
			default:
				System.out.println("Digite para escolher: 1: Conta Corrente | 2: Conta Poupança");
				break;
		}
	}

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void mostrarSaldos() {
		for (int i = 0; i < listaContas.size(); i++) {
			System.out.printf("Id: %d | Saldo: %.2f", i, listaContas.get(i).getSaldo());
		}
	}

	public Conta getConta(int id) {
		if (id <= listaContas.size() && id >= 0) {
			return listaContas.get(id);
		}
	}
}
