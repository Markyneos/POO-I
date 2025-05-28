public class Main {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Carlos");

		usuario1.adicionarTransporte(new Bicicleta("BIKE-789"));
		usuario1.adicionarTransporte(new Patinete("PAT-456"));
		usuario1.adicionarTransporte(new Onibus("ÔNIBUS-123"));

		usuario1.mostrarTransportes();
	}
}
