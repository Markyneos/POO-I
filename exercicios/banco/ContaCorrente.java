public class ContaCorrente extends Conta implements Pix {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    public double fazerPix(double quantidade) {
        saldo -= quantidade;
        System.out.printf("Pix de %.2f realizado\n", quantidade);
        return saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor + 5) {
            saldo -= (valor + 5); // taxa de R$ 5,00
        } else {
            System.out.println("Saldo insuficiente na Conta Corrente.");
        }
    }

    public void aplicarRendimento() {
        saldo *= 1.012; // 1,2%
    }

    @Override
    public String toString() {
        return "Conta Corrente - Saldo: R$ " + String.format("%.2f", saldo);
    }

    public String getTipoConta() {
        return "Conta Corrente";
    }
}
