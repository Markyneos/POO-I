public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean saque(double qtdSaque, double taxa) {
		if (qtdSaque > saldo - taxa) {
			System.err.println("Erro: a quantidade sacada deve ser menor que o saldo da conta.");
			return false;
		} else {
			saldo -= qtdSaque + taxa;
			System.out.printf("Saque de R$%.2f realizado.\n", qtdSaque);
			return true;
		}
	}

	public boolean deposito(double qtdDeposito) {
		if (qtdDeposito < 1) {
			System.err.println("Erro: Insira um valor válido.");
			return false;
		} else {
			saldo += qtdDeposito;
			System.out.printf("Depósito de R$%.2f realizado.\n", qtdDeposito);
			return true;
		}
	}

	public double aplicarRendimento(double porcentagem) {
		saldo += saldo * porcentagem;
		return saldo;
	}

}
