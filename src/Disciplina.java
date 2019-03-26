import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private double codigo;
	private String nome;
	private String horario;
	private List<String> nomes;
	
	
	public Disciplina(String nome,double codigo,String horario) {
		this.nome = nome;
		this.codigo = codigo;
		this.horario = horario;	
		nomes = new ArrayList<String>();
	}
	
	public void addNome(String nome) {
		nomes.add(nome);
	}
	
	public int getQtdAlunos() {
		return this.nomes.size();
	}
	
	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getHorario() {
		return horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String listarAlunosMatriculados() {
		String saida = "";
		for (String nome : nomes) {
			saida = saida +nome;			
		}
		return saida;
	}
}
