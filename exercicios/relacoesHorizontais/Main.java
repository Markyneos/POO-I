public class Main {
	public static void main(String[] args) {
		Motorista motorista1 = new Motorista("Pedro Wallia", 123456);
		Motorista motorista2 = new Motorista("Vitor Motta", 789123);

		Carro carro1 = new Carro("Celta", 150, "Diesel");
		Carro carro2 = new Carro("Monza Turbinado", motorista2, 120, "Aditivada");
		carro1.setMotorista(motorista2);
		carro2.setMotorista(motorista1);

		System.out.println("Vezes que o carro foi utilizado " + carro1.quantidadeVezesUtilizado());
		System.out.println("Quantidade de motoristas registrados " + Motorista.getQntdMotoristas());

		System.out.println(carro1.toString());
		System.out.println(carro2.toString());

	}
}
