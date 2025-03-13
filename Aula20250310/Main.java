public class Main {
	public static void main(String[] args) {

		System.out.println("TESTE");

		Teste t1 = new Teste(10, 20, 30);
		System.out.println(Teste.getQuantidade());
		Teste t2 = new Teste();
		System.out.println(Teste.getQuantidade());
		Teste t3 = new Teste();
		System.out.println(Teste.getQuantidade());

	}
}
