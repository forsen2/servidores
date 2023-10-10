package servidores;

public interface Salario {

	 final double SALARIO_BASE_ADJUNTO = 7000;
	 final double SALARIO_BASE_ASSISTENTE= 4600;
	 final double SALARIO_BASE_TECNICO = 3500;
	 final double SALARIO_BASE_MESTRE = 2500;
	 final double GRATIFICACAO = 2.5;
	 final double TITULACAO = 6000;
	 
	 public abstract double calcularSalario();
	
	
}
