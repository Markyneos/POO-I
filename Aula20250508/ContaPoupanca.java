public class ContaPoupanca extends Conta {
	private double taxaSaque = 7.0;
	private double taxaRendimento = 0.005;

	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	public boolean saquePoupanca(double qtdSaque) {
		return this.saque(qtdSaque, taxaSaque);
	}

	public double aplicarRendimentoPoupanca() {
		return this.aplicarRendimento(taxaRendimento);
	}
}
