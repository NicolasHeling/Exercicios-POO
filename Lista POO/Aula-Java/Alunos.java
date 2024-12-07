import java.util.ArrayList;
import java.util.List;

public class Alunos{
    private String nome;
    private String matricula;
    private String curso;
    private List<Double> notas;

    public Alunos(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota inválida. Deve estar entre 0 e 10.");
        }
    }

    public double calcularMediaNotas() {
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota registrada.");
            return 0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Double> getNotas() {
        return notas;
    }
}