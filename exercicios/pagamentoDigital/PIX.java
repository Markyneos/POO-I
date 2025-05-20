public class PIX extends MeioPagamento implements Autorizavel {
	public PIX(String chave) {
		super(chave);
	}

	public void autorizarPagamento() {
		System.out.println("Pagamento Autorizado");
	}
}
