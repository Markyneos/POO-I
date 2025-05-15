public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    public void sacar(double valor) {
        if (saldo >= valor + 15) {
            saldo -= (valor + 15); // taxa de R$ 15,00
        } else {
            System.out.println("Saldo insuficiente na Conta Poupança.");
        }
    }

    public void aplicarRendimento() {
        saldo *= 1.005; // 0,5%
    }

    @Override
    public String toString() {
        return "Conta Poupança - Saldo: R$ " + String.format("%.2f", saldo);
    }

    public String getTipoConta() {
        return "Conta Poupança";
    }
}
