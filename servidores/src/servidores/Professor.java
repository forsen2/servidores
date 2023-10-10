package servidores;

public class Professor extends Servidor{

	private String disciplinasMinistradas;
	private double salarioTotal;
	public Professor(String nome, int matricula, String departamento, String titulacao, String disciplinasMinistradas) {
		super(nome, matricula, departamento, titulacao);
		this.disciplinasMinistradas = disciplinasMinistradas;

	}
	
	public double calcularSalario() {
		salarioTotal = salario;
		
        if ("Adjunto".equalsIgnoreCase(titulacao)) {
            salarioTotal = SALARIO_BASE_ADJUNTO + (SALARIO_BASE_ADJUNTO * 0.35);
        } else if ("Assistente".equalsIgnoreCase(titulacao)) {
            salarioTotal = SALARIO_BASE_ASSISTENTE + (SALARIO_BASE_ASSISTENTE * 0.25);
        } else if ("Tecnico".equalsIgnoreCase(titulacao)) {
            salarioTotal = SALARIO_BASE_TECNICO + (SALARIO_BASE_TECNICO * 0.25);
        } else if ("Mestre".equalsIgnoreCase(titulacao)) {
            salarioTotal = SALARIO_BASE_MESTRE + (SALARIO_BASE_MESTRE * 0.25);
        }
		
		
	
		return salarioTotal;
	}
	
	public String toString() {
		return "Nome: " + nome + "\n" + "Matricula: " + matricula + "\n" + "Salario: R$" + calcularSalario() + "\n" + "Departamento: " + departamento + "\n" + "Titulacao: " + titulacao;  
	}
}
