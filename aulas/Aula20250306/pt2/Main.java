public class Main {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente(1, "Marco", "123.345.543-23");
		Conta c1 = new Conta(cl1, 10, 1500, 2000);
		System.out.println(c1.saldo);
	}
}
