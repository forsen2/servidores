package servidores;

public class Principal {
	public static void main(String args[]) {
		Universidade un1 = new Universidade("FGA", "QJK 12");
		
		Professor pf1 = new Professor("Joao", 1231, "Mat1", "Adjunto", "2");
		Professor pf2 = new Professor("as", 1231, "Mat1", "Mestre", "2");
		un1.cadastrarServidor(pf1);
		un1.cadastrarServidor(pf2);
		System.out.println(un1.imprimirProfs());
	
	}
}
