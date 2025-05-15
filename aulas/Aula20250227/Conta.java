public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;

	public Conta(int n, String nom, double s, double l) {
		this.numero = n;
		this.nome = nom;
		this.saldo = s;
		this.limite = l;
	}

	boolean sacar(double v) {
		if (saldo - v < 0 && saldo - v < 0 - limite) {
			System.err.println("Erro: Não se pode sacar mais do que o limite disponível em sua conta.");
			return false;
		}
		else {
		saldo -= v;
		return true;
		}
	}

	void depositar(double v) {
		saldo += v;
	}
}
