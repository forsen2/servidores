package servidores;

public class Tecnico extends Servidor{

	private String funcao;
	
	public Tecnico(String nome, int matricula, double salario, String departamento, String titulacao, String funcao) {
		super(nome, matricula, departamento, titulacao);
		this.funcao = funcao;
	}
	
	public double calcularSalario() {
		
		return 0;
	}
}
