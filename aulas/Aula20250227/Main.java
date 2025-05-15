public class Main {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1, "Marco", 1500, 300);
		Conta conta2 = new Conta(2, "Brasil", 7500, 1500);

		conta1.sacar(1000);
		System.out.println(conta1.saldo);
		conta1.sacar(700);
		System.out.println(conta1.saldo);

		conta2.sacar(9500);
		System.out.println(conta2.saldo);
		conta2.depositar(1500);
		System.out.println(conta2.saldo);

		// SoDados sd = new SoDados();
		//
		// sd.i = 10;
		// sd.f = 100;
		// sd.b = true;
		//
		// SoDados x = new SoDados();
		// x.i = 20;
		// x.f = 200;
		// x.b = false;
		//
		// sd.imprimir();
	}
}
