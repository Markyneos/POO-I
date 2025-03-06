public class Main {
	public static void main(String[] args) {
		System.out.println("BANCO");

		Conta c1 = new Conta();
		c1.numero = 10;
		c1.nome = "Marco";
		c1.limite = 1000;
		c1.saldo = 2000;

		c1.depositar(100);
		boolean resultado = c1.sacar(300);
		System.out.println(resultado);
	}
}
