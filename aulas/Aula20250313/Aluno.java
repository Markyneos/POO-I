import java.time.Year;
import java.util.Random;

public class Aluno {
	Random rand = new Random();
	private String matricula = Year.now().getValue() + String.format("%04d", rand.nextInt(10000));
	private String nome = "";
	private String curso = "";
	private String turma = "";
	private int periodo = 1;
	private double nota1b = 0.0;
	private double nota2b = 0.0;
	private double notaf = (nota1b + nota2b) / 2;
	public static int qtdAlunos = 0;

	public Aluno(String nome, String curso, String turma, int periodo) {
		this.nome = nome.toUpperCase();
		this.curso = curso;
		this.turma = turma;
		this.periodo = periodo;
		qtdAlunos++;
	}

	public Aluno(String nome, String curso, String turma) {
		this.nome = nome.toUpperCase();
		this.curso = curso;
		this.turma = turma;
		qtdAlunos++;
	}

	public Aluno(String nome) {
		this.nome = nome;
		qtdAlunos++;
	}

	@Override
	public String toString() {
		return String.format(
				"Aluno: %s\nMatrícula: %s\nCurso: %s\nTurma: %s\nPeríodo: %d\nNota 1: %.2f\nNota 2: %.2f\nNota final: %.2f",
				nome, matricula, curso, turma, periodo, nota1b, nota2b, notaf);
	}

	public void imprimir() {
		System.out.printf("Matrícula: %s\nNome: %s\nCurso: %s\nTurma: %s\n", matricula, nome, curso, turma);
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getTurma() {
		return turma;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setNota1b(double nota1b) {
		this.nota1b = nota1b;
	}

	public double getNota1b() {
		return nota1b;
	}

	public void setNota2b(double nota2b) {
		this.nota2b = nota2b;
	}

	public double getNota2b() {
		return nota2b;
	}

	public boolean passar(String novaTurma) {
		if (notaf >= 7) {
			periodo++;
			turma = novaTurma;
			return true;
		} else {
			return false;
		}
	}

	public boolean passarDif(int novoPeriodo, String novaTurma) {
		if (notaf >= 7) {
			turma = novaTurma;
			periodo = novoPeriodo;
			return true;
		} else {
			System.out.println("Aluno reprovado");
			return false;
		}
	}

	public double mediaFinal() {
		return notaf;
	}
}
