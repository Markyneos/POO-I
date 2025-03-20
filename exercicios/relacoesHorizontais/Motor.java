public class Motor {
	private double potencia;
	private String tipoCombustivel;

	public Motor(double potencia, String tipoCombustivel) {
		this.potencia = potencia;
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getPotencia() {
		return potencia;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	@Override
	public String toString() {
		return String.format("Potência: %.2f | Tipo de Combustível: %s", potencia, tipoCombustivel);
	}
}
