import java.util.ArrayList;
import java.util.List;

public class Rdm {
	private List<Disciplina> disciplinasMatriculadas;
	
	public Rdm() {
		this.disciplinasMatriculadas = new ArrayList<Disciplina>();
		
	}
	
	public String listarDisciplinasMatriculadas() {
		String saida = "";
		for (Disciplina disciplina : disciplinasMatriculadas) {
			saida = saida+ disciplina.getNome();
		}
		return saida;
	}
	
	public String horario() {
		String saida = "";
		for (Disciplina disciplina : disciplinasMatriculadas) {
			saida = saida+ disciplina.getHorario();		
		}
		return saida;
	}
	
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinasMatriculadas.add(disciplina);
	}

}
