package orientacaoaobjetos;

public class Funcionario {
	
	String nome;
	int idade;
	String cargo;
	int tempoTrabalho;
	private double salario;
	private String status;
	
	
	public Funcionario(String nome, int idade, String cargo, int tempoTrabalho, double salario,
			String status) {
		
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.tempoTrabalho = tempoTrabalho;
		this.definirSalario(salario);
		this.definirStatus(status);
	} 
	
	
	public void serPromovido(String cargo) {
		System.out.println("Parabéns, você foi promovida/o de " + this.cargo + " para " + cargo + "!");
		this.cargo = cargo;
	}
	
	public void serDemitido() {
		definirStatus("Demitido");
		System.out.println("Infelizmente, " + nome + ", você foi demitido...");
		
	}
	
	public void aumentarSalario(double aumento) { 
		salario += aumento;
		System.out.println("Você recebeu um aumento de " + aumento + " R$. Agora seu salário é: " + salario + " R$.");
	}
	
	public void definirSalario(double salario) {
		this.salario = salario;
	}


	public void definirStatus(String status) {
		this.status = status;
	}
	
	public void imprimirInfos( ) {
		System.out.println(nome + ", você trabalha há " + tempoTrabalho + " anos na empresa. "
				+ "Seu salário atual é: " + salario + " R$. Seu estado atual é " + status);
	}

	

	
	
	
}
