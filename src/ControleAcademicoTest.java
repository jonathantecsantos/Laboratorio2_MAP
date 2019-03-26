import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ControleAcademicoTest {

	ControleAcademico ca = new ControleAcademico();

	@Test
	void testAddNovoAluno() {
		ca.addNovoAluno("Jonathan", 01);
		Aluno alunoProcurado = ca.procuraAluno(01);
		//Testa se o aluno foi cadastrado
		assertEquals(01,alunoProcurado.getMatricula());	
	}

	@Test
	void testAddNovoProfessor() {
		ca.addNovoProfessor("Sabrina", 01);
		Professor professorProcurado = ca.procuraProfessor(01);
		//Testa se o professor foi cadastrado
		assertEquals(01, professorProcurado.getMatricula());
	}
	
	@Test
	void testAddNovaDisciplina() {
		ca.addNovaDisciplina("Algebra", 01, "Terça e Quinta");
		Disciplina disciplinaProcurada = ca.procuraDisciplina(01);
		//Testa se a disciplina foi cadastrada
		assertEquals(01, disciplinaProcurada.getCodigo());
	}
	
	@Test
	void testProcuraAluno() {
		ca.addNovoAluno("Abimael", 06);
		Aluno alunoProcurado = ca.procuraAluno(06);
		//Testa se o aluno retornado é igual ao procurado
		assertEquals("Abimael",alunoProcurado.getNome());	
	}
	
	@Test
	void testProcuraProfessor() {
		ca.addNovoProfessor("Ernesto", 12);
		Professor professorProcurado = ca.procuraProfessor(12);
		//Testa se o professor retornado é igual ao procurado
		assertEquals("Ernesto",professorProcurado.getNome());	
	}
	
	@Test
	void testProcuraDisciplina() {
		ca.addNovaDisciplina("MAP", 22, "Terça e Quinta");
		Disciplina disciplinaProcurada = ca.procuraDisciplina(22);
		//Testa se a disciplina retornada é igual a procurada
		assertEquals("MAP", disciplinaProcurada.getNome());
	}
	
	@Test
	void testMatriculaAluno() {
		Aluno aluno = new Aluno("Jonathan",01);
		Disciplina disciplina = new Disciplina("LP2",01,"Seg e Sex");
		aluno.getRdm().addDisciplina(disciplina);
		disciplina.addNome(aluno.getNome());
		//Testa se o aluno está matriculado em determinada disciplina
		assertEquals("LP2",aluno.getRdm().listarDisciplinasMatriculadas());
	}
	
	@Test
	void testAlocaProfessor() {
		Professor professor = new Professor("Thiago", 01);
		Disciplina disciplina = new Disciplina("LP1", 01, "Seg e Qua");
		professor.getRda().addDisciplina(disciplina);
		//Testa se o professor está alocado em determinada disciplina
		//Testa disciplinas Alocadas do Professor
		assertEquals("LP1", professor.getRda().listarDisciplinasAlocadas());
	}
	

	@Test
	void testHorarioDoProfessor() {
		Professor professor = new Professor("Thiago", 01);
		Disciplina disciplina = new Disciplina("LP1", 01, "Seg e Qua");
		professor.getRda().addDisciplina(disciplina);
		//Testa se o horário do professor foi alocado
		assertEquals("Seg e Qua",professor.getRda().horario());
	}

	@Test
	void testListarDisciplinaAluno() {
		Aluno aluno = new Aluno("Abimael",01);
		Disciplina disciplina = new Disciplina("LP2",01,"Seg e Sex");
		aluno.getRdm().addDisciplina(disciplina);
		Disciplina disciplina2 = new Disciplina(" LP3",01,"Qua e Qui");
		aluno.getRdm().addDisciplina(disciplina2);
		assertEquals("LP2 LP3", aluno.getRdm().listarDisciplinasMatriculadas());
	}
	
	@Test
	void testHorarioDoAluno() {
		Aluno aluno = new Aluno("Abimael",01);
		Disciplina disciplina = new Disciplina("LP2",01,"Seg e Sex");
		aluno.getRdm().addDisciplina(disciplina);
		assertEquals("Seg e Sex", aluno.meuHorario());
	}

	@Test
	void testQuantidadeDeAlunos() {
		//Adiciona 4 alunos
		ca.addNovoAluno("Jonh", 01);
		ca.addNovoAluno("Cersei", 02);
		ca.addNovoAluno("Sansa", 03);
		ca.addNovoAluno("Bran", 04);
		//cria disciplina
		ca.addNovaDisciplina("Calculo", 01, "Sexta");
		//adiciona os 4 alunos na disciplina
		ca.matriculaAluno(01, 01);
		ca.matriculaAluno(02, 01);
		ca.matriculaAluno(03, 01);
		ca.matriculaAluno(04, 01);
		//testa o número de alunos cadastrados na disciplina
		assertEquals(4,ca.procuraDisciplina(01).getQtdAlunos());
		
	}
	
	@Test
	void testListarAlunosMatriculados() {
		ca.addNovoAluno("Jonh", 01);
		ca.addNovaDisciplina("Calculo", 01, "Sexta");
		ca.matriculaAluno(01, 01);
		//Verifica a lista de alunos matriculados na disciplina procurada
		assertEquals("Jonh", ca.procuraDisciplina(01).listarAlunosMatriculados());
	}

}
