package servidores;

public class Universidade {

	private String nome;
	private String endereco;
	private Servidor[] funcionarios;
	private int qtdFuncionarios;
	
	public Universidade(String nome, String end) {
		this.nome = nome;
		this.endereco = end;
		qtdFuncionarios = 0;
		funcionarios = new Servidor[500];
	}
	
	public boolean cadastrarServidor(Servidor s) {
		if(qtdFuncionarios < 500) {
			funcionarios[qtdFuncionarios] = s;
			qtdFuncionarios++;
			return true;
		}else {
			return false;
		}
	}
		
		public String imprimirProfs() {
			String res = nome;
			for(int i = 0; i < qtdFuncionarios; i++) {
				if(funcionarios[i] instanceof Professor) {
					res = res.concat("\n");
					res = res.concat(funcionarios[i].toString());
				}
			}
			return res;
		}
	
		
	}

