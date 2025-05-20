public class Main {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Mariana");
		usuario1.adicionarMeio(new CartaoCredito("1234-5678-9012-3456"));
		usuario1.adicionarMeio(new PIX("mariana@email.com"));
		usuario1.adicionarMeio(new BoletoBancario("23793381283000000124560000078601975580000001000"));

		usuario1.mostrarPagamentos();
	}
}
