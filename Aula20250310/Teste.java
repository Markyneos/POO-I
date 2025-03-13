public class Teste {
	public int a;
	public int b;
	private int c;
	private static int quantidade = 0;

	public static int getQuantidade() {
		return quantidade;
	}

	public Teste() {
		quantidade++;
	}

	public Teste(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		quantidade++;
	}

	public int getC() {
		return c;
	}
	public void setC(int value) {
		this.c = value;
	}
}
