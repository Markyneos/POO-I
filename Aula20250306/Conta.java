public class Conta {
	int numero;
	String nome;
	float saldo;
	float limite;

	boolean sacar(double valor) {
		if (valor > saldo) {
			System.err.println("Saque não permitido.");
			return false;
		} else {
			saldo -= valor;
			System.out.println("Saque liberado.");
			return true;
		}
	}

	void depositar(double valor) {
		saldo += valor;
	}
}
