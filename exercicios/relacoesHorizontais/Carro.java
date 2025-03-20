public class Carro {
	private String modelo;
	private Motorista motorista;
	private Motor motor;
	private int vezesUtilizado = 0;

	@Override
	public String toString() {
		return String.format("Modelo: %s | Motorista:\n%s\nMotor:\n%s",
				modelo, motorista.toString(), motor.toString());
	}

	public Carro(String modelo, Motorista motorista, double potenciaMotor, String tipoCombustivelMotor) {
		this.modelo = modelo;
		this.motorista = motorista;
		this.motor = new Motor(potenciaMotor, tipoCombustivelMotor);
		vezesUtilizado++;
	}

	public Carro(String modelo, double potenciaMotor, String tipoCombustivelMotor) {
		this.modelo = modelo;
		this.motor = new Motor(potenciaMotor, tipoCombustivelMotor);
	}

	public void setMotorista(Motorista novoMotorista) {
		this.motorista = novoMotorista;
		vezesUtilizado++;
	}

	public Motorista getMotorista() {
		return this.motorista;
	}

	public String getModelo() {
		return modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public int quantidadeVezesUtilizado() {
		return vezesUtilizado;
	}
}
