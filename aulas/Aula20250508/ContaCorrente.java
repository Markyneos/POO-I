public class ContaCorrente extends Conta {
	private double taxaSaque = 5.0;
	private double taxaRendimento = 0.012;

	public ContaCorrente(double saldo) {
		super(saldo);
	}

	public boolean saqueCorrente(double qtdSaque) {
		return this.saque(qtdSaque, taxaSaque);
	}

	public double aplicarRendimentoCorrente() {
		return this.aplicarRendimento(taxaRendimento);
	}
}
