package servidores;

public abstract class Servidor implements Salario{

	protected String nome;
	protected int matricula;
	protected double salario;
	protected String departamento;
	protected String titulacao;


	
	
	public String getNome() {
		return nome;
	}


	

	
	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public String getTitulacao() {
		return titulacao;
	}



	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}



	public Servidor(String nome, int matricula, String departamento, String titulacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.departamento = departamento;
		this.titulacao = titulacao;
	}



	
	public String toString() {
		return "Servidor [nome=" + nome + ", matricula=" + matricula + ", salario=" + salario + ", departamento="
				+ departamento + ", titulacao=" + titulacao + "]";
	}
	
	
	
}
