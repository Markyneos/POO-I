public class Motorista {
	private String nome;
	private int cnh;
	private static int qntdMotoristas = 0;

	@Override
	public String toString() {
		return String.format("Nome: %s | CNH: %d", nome, cnh);
	}

	public Motorista(String nome, int cnh) {
		this.nome = nome;
		this.cnh = cnh;
		qntdMotoristas++;
	}

	public String getNome() {
		return nome;
	}

	public int getCnh() {
		return cnh;
	}

	public static int getQntdMotoristas() {
		return qntdMotoristas;
	}
}
