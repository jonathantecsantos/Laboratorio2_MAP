import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private double matricula;
	private Rdm rdm;
	
	
	public Aluno(String nome, double matricula){
		this.nome = nome;
		this.matricula = matricula;
		this.rdm = new Rdm();
	}
	
	public String listarDisciplinasMatriculadas() {
		
		return rdm.listarDisciplinasMatriculadas();
	}
	
	public String meuHorario() {
	
		return rdm.horario();
	
	}
	
	public Rdm getRdm() {
		return this.rdm;
	}
	

	public String getNome() {
		return nome;
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


}
