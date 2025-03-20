import java.util.Random;
import java.time.Year;

public class Aluno {
    // Atributos
    private String matricula;
    private String nome;
    private String curso;
    private char turma;
    private int periodo;
    private double nota1B;
    private double nota2B;
    private double notaFinal;
    private static int qnt_Alunos = 0;

    // Construtor
    public Aluno(String Nome, String curso) {
        int currYear = Year.now().getValue();
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        String formatRandomNumber = String.format("%04d", randomNumber);
        this.matricula = currYear + formatRandomNumber;
        this.nome = Nome.toUpperCase();
        this.curso = curso.toUpperCase();
        this.turma = 'A';
        this.periodo = 1;
        this.nota1B = 0;
        this.nota2B = 0;
        this.notaFinal = 0;
        qnt_Alunos++;
    }

    public Aluno(String Nome, String curso, char turma, int periodo) {
        int currYear = Year.now().getValue();
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        String formatRandomNumber = String.format("%04d", randomNumber);
        this.matricula = currYear + formatRandomNumber;
        this.nome = Nome.toUpperCase();
        this.curso = curso.toUpperCase();
        this.turma = turma;
        this.periodo = periodo;
        this.nota1B = 0;
        this.nota2B = 0;
        this.notaFinal = 0;
        qnt_Alunos++;
    }

    // get and set
    public void setnota1B(double nota) {
        this.nota1B = nota;
    }

    public void setnota2B(double nota) {
        this.nota2B = nota;
    }

    public void setnotaFinal() {
        this.notaFinal = (this.nota1B + this.nota2B) / 2;
    }

    public void setturma(char turma) {
        this.turma = turma;
    }

    public int getqnt_Alunos() {
        return qnt_Alunos;
    }

    // Mostrar todos os dados da classe
    public void MostrarAluno() {
        System.out.printf(
                "Matricula: %s\nNome: %s\nCurso: %s\nTruma: %s\nPeriodo: %d\nNota 1: %.2f\nNota 2: %.2f\nNota final: %.2f\n",
                matricula, nome, curso, turma, periodo, nota1B, nota2B, notaFinal);
    }

    // Modifica o período e a turma
    public void Passar(int periodo, char turma) {
        this.periodo = periodo;
        this.turma = turma;
    }

    public void PassarMelhor() {
        this.periodo++;
    }

    // Calcula a média final das notas do aluno
    public void CalcularFinal() {
        this.notaFinal = (this.nota1B + this.nota2B) / 2;
    }
}
