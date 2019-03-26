import java.util.ArrayList;
	import java.util.List;

	public class Rda {
		private List<Disciplina> disciplinasAlocadas;
		
		public Rda() {
			this.disciplinasAlocadas = new ArrayList<Disciplina>();
			
		}
		
		public String listarDisciplinasAlocadas() {
			String saida = "";
			for (Disciplina disciplina : disciplinasAlocadas) {
				saida = saida+ disciplina.getNome();
			}
			return saida;
		}
		
		public String horario() {
			String saida = "";
			for (Disciplina disciplina : disciplinasAlocadas) {
				saida = saida+ disciplina.getHorario();		
			}
			return saida;
		}
		
		public void addDisciplina(Disciplina disciplina) {
			this.disciplinasAlocadas.add(disciplina);
		}

	}

