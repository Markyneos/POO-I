import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public void criarConta(String tipo, double saldoInicial) {
        Conta novaConta;
        if (tipo.equalsIgnoreCase("corrente")) {
            novaConta = new ContaCorrente(saldoInicial);
            contas.add(novaConta);
        } else if (tipo.equalsIgnoreCase("poupanca")) {
            novaConta = new ContaPoupanca(saldoInicial);
            contas.add(novaConta);
        } else {
            System.out.println("Selecione conta 'corrente' ou conta 'poupança', somente.");
        }
    }

    public void mostrarSaldos() {
        System.out.println("Cliente: " + nome);
        for (Conta conta : contas) {
            System.out.println(conta.toString());
        }
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
