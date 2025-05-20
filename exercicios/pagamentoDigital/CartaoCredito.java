public class CartaoCredito extends MeioPagamento implements Autorizavel {

	public CartaoCredito(String numero) {
		super(numero);
	}

	public void autorizarPagamento() {
		System.out.println("Pagamento autorizado!");
	}
}
