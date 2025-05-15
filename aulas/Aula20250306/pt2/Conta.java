public class Conta {
	Cliente titular;
	int numero;
	float saldo;
	float limite;

	public Conta(Cliente titular, int numero, float saldo, float limite) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}

}
