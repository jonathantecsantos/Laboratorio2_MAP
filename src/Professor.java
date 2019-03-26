import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	private String nome;
	private double matricula;
	private Rda rda;
	
	public Professor(String nome, double matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.rda = new Rda();
	}
	
	public String getNome() {
		return nome;
	}
	
	public Rda getRda() {
		return this.rda;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

	public String listarDisciplinasAlocadas() {
		return rda.listarDisciplinasAlocadas();
	}
	
	public String horarioDoProfessor() {
		return rda.horario();
	}
}
