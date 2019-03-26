
import java.util.ArrayList;
import java.util.List;
public class ControleAcademico {
	
	private List<Aluno> alunos;
	private List<Professor> professores;
	private List<Disciplina> disciplinas;
	
	public ControleAcademico() {
		this.alunos = new ArrayList<Aluno>();
		this.professores = new ArrayList<Professor>();
		this.disciplinas = new ArrayList<Disciplina>();
	}
	
	//adiciona um novo aluno
	public void addNovoAluno(String nome,int matricula) {
		Aluno aluno = new Aluno(nome,matricula);
		alunos.add(aluno);
	}
	
	//adiciona um novo professor
	public void addNovoProfessor(String nome,int matricula) {
		Professor professor = new Professor(nome,matricula);
		professores.add(professor);
	}
	
	//adiciona uma nova disciplina
	public void addNovaDisciplina(String nome, double codigo, String horario) {
		Disciplina disciplina = new Disciplina(nome,codigo,horario);
		disciplinas.add(disciplina);
	}
	
	//procura um aluno
	public Aluno procuraAluno(double matricula) {
		Aluno alunoProcurado=null;
		try {
			for  (Aluno aluno : alunos) {
				if (aluno.getMatricula()==matricula) {
					alunoProcurado =  aluno;
				}
			}
		}catch(Exception e) {
			System.out.println("Aluno nao encontrado!");
		}
	return alunoProcurado;	
	}
	
	//procura um professor
	public Professor procuraProfessor(double matricula) {
		Professor professorProcurado=null;
		try {
			for  (Professor professor : professores) {
				if (professor.getMatricula()==matricula) {
					professorProcurado =  professor;
				}
			}
		}catch(Exception e) {
			System.out.println("Professor nao encontrado!");
		}
	return professorProcurado;	
	}
	
	//procura uma disciplina
	public Disciplina procuraDisciplina(double codigo) {
		Disciplina disciplinaProcurada=null;
		try {
		for ( Disciplina disciplina : disciplinas) {
			if(disciplina.getCodigo()==codigo) {
				disciplinaProcurada = disciplina;
			}
		}
		}catch(Exception e) {
			System.out.println("Disciplina nao encontrada!");
		}
	return disciplinaProcurada;	
	}
	
	//matricula alunos nas disciplinas
	public void matriculaAluno(double matricula, double codigo) {
		Aluno aluno = procuraAluno(matricula);
		Disciplina disciplina = procuraDisciplina(codigo);
		aluno.getRdm().addDisciplina(disciplina);
		disciplina.addNome(aluno.getNome());
	}
	
	//aloca professor nas disciplinas
	public void alocaProfessor(double matricula, double codigo) {
		Professor professor = procuraProfessor(matricula);
		Disciplina disciplina = procuraDisciplina(codigo);
		professor.getRda().addDisciplina(disciplina);
	}
	
	//lista disciplinas de um professor
	public void listarDisciplinasAlocadas(double matricula) {
		Professor professor = procuraProfessor(matricula);
		System.out.println("Disciplinas do professor: "+professor.getRda().listarDisciplinasAlocadas());
	}
	
	//mostra o horario de um professor
	public void horarioDoProfessor(double matricula) {
		Professor professor = procuraProfessor(matricula);
		System.out.println("Horario do professor: "+professor.getRda().horario());
	}
	
	//mostra as disciplinas de um aluno
	public void listarDisciplinaAluno(double matricula) {
		Aluno aluno = procuraAluno(matricula);
		System.out.println("Disciplinas do aluno: "+aluno.getRdm().listarDisciplinasMatriculadas());
	}
	
	//mostra o horario de uma aluno
	public void horarioDoAluno(double matricula) {
		Aluno aluno = procuraAluno(matricula);
		System.out.println("Horario do aluno: "+aluno.getRdm().horario());
	}
	
	//mostra a quantidade de alunos por disciplina
	public void quantidadeDeAlunos(double codigo) {
		Disciplina disciplina = procuraDisciplina(codigo);
		System.out.println("Quantidade de alunos: "+disciplina.getQtdAlunos());
	}
	
	//lista os alunos matriculados em uma disciplina
	public void listarAlunosMatriculados(double codigo) {
		Disciplina disciplina = procuraDisciplina(codigo);
		System.out.println("Alunos matriculados: "+disciplina.listarAlunosMatriculados());
	}

	

}
