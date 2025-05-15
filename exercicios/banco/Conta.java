abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    abstract void sacar(double valor);

    abstract void aplicarRendimento();

    public double getSaldo() {
        return saldo;
    }

    abstract String getTipoConta();

}
