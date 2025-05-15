public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria Oliveira", "987.654.321-00");

        cliente.criarConta("corrente", 1000);
        cliente.criarConta("poupanca", 2000);
        cliente.criarConta("corrente", 500);

        // Realiza saques e rendimentos
        cliente.getContas().get(0).sacar(100); // Corrente
        cliente.getContas().get(1).sacar(200); // Poupança
        cliente.getContas().get(2).sacar(50); // Simples

        for (Conta c : cliente.getContas()) {
            c.aplicarRendimento();
        }

        cliente.mostrarSaldos();
    }
}
