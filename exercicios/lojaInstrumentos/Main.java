public class Main {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("Marco");
		u1.adicionarInstrumento(new Guitarra("Les Paul", 2300));
		u1.adicionarInstrumento(new Baixo("Tagima", 5400));
		u1.imprimirCarrinho();
		u1.removerInstrumento(1);
		BaixoAcustico ba1 = new BaixoAcustico("Tagima", 3200);
		ba1.afinar("Padrão");
		Bateria bat1 = new Bateria("Yamaha", 7800);
		bat1.tocar();
		Cajon c1 = new Cajon("Mapex", 2150);
		c1.tocarAcustico();
		Guitarra g1 = new Guitarra("Fender", 8790);
		g1.afinar("Drop C");
		g1.tocarAcorde("E");
		Pandeiro p1 = new Pandeiro("Carnaval", 850);
		p1.tocar();
		Piano pi1 = new Piano("Yamaha", 10340);
		pi1.tocarAcorde("G");
		Ukulele uk1 = new Ukulele("Tagima", 1500);
		uk1.tocarAcorde("B");
		Violao v1 = new Violao("Eagle", 5400);
		v1.afinar("Padrão");
		v1.tocarCorda(3);
		Violino vi1 = new Violino("Yamaha", 3200);
		vi1.tocarCorda(4);
		u1.adicionarInstrumento(ba1);
		u1.adicionarInstrumento(v1);
		u1.imprimirCarrinho();
		u1.pagarCarrinho(100000);
	}
}
