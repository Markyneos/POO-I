public interface InstrumentoCorda {

	public String[] listaAfinações = { "E A D G B E", "D A D G B E", "C G C F A D", "B F# B E G# C#" };
	public String[] listaAcordes = { "A C# E", "B D# F#", "C E G", "D F# A", "E G# B", "F A C", "G B D" };

	public void tocarCorda(int corda);

	public void tocarAcorde(String acorde);

	public void afinar(String afinacao);

}
