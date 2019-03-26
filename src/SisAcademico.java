
public class SisAcademico {

	public static void main(String[] args) {
		
		ControleAcademico controleAcademico = new ControleAcademico();
		//Adicionando 2 alunos no sistema
		
		controleAcademico.addNovoAluno("Abimael", 01);
		controleAcademico.addNovoAluno("Jonathan", 02);
		
		//Adicionando 2 professores no sistema
		controleAcademico.addNovoProfessor("Ernesto", 01);
		controleAcademico.addNovoProfessor("Augusto", 02);
		
		//Adicionando 3 disciplinas no sistema
		
		controleAcademico.addNovaDisciplina("Calculo", 01,"18:00 às 20:00 / Segunda e Quarta");
		controleAcademico.addNovaDisciplina("Programacao", 02,"20:00 às 22:00 / Terca e Quinta");
		controleAcademico.addNovaDisciplina("Algebra", 03,"08:00 às 10:00 / Segunda e Sexta");

		
		//Matriculando alunos nas disciplinas, usando a matricula do aluno e o codigo da disciplina
		controleAcademico.matriculaAluno(01, 01);
		controleAcademico.matriculaAluno(01, 02);
		controleAcademico.matriculaAluno(02, 01);
		controleAcademico.matriculaAluno(02, 02);
		
		
		//Alocando professores nas disciplinas, usando a matricula do professor e o codigo da disciplina
		controleAcademico.alocaProfessor(01, 01);
		controleAcademico.alocaProfessor(02, 02);
		controleAcademico.alocaProfessor(01,03);
		
		
		//Listando as disciplinas dos professores, passando a matricula do professor
		
		controleAcademico.listarDisciplinasAlocadas(01);
		controleAcademico.listarDisciplinasAlocadas(02);
		
		//horario dos professores:
		controleAcademico.horarioDoProfessor(01);
		controleAcademico.horarioDoProfessor(02);
		
		//lista de alunos por disciplina
		
		controleAcademico.listarAlunosMatriculados(01);
		controleAcademico.listarAlunosMatriculados(02);
		
		//lista disciplinas de um aluno
		controleAcademico.listarDisciplinaAluno(01);
		controleAcademico.listarDisciplinaAluno(02);
		
		//Horario dos alunos:
		controleAcademico.horarioDoAluno(01);
		controleAcademico.horarioDoAluno(02);
		
		//Quantidade de alunos matriculados por disciplina:
		
		controleAcademico.quantidadeDeAlunos(01);
		controleAcademico.quantidadeDeAlunos(02);

	

	}
	

}
