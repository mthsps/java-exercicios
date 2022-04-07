package orientacaoaobjetos;

public class ContaBancaria {
	
	private String nomeTitular;
	private int numConta;
	private int saldo;
	private String senha;
	private int anoNascimento;
	private String status;
	private int tentativasErradas =  0;
	
	
	public ContaBancaria(String nomeTitular, int numConta, int saldo, String senha, int anoNascimento) {
		this.nomeTitular = nomeTitular;
		this.numConta = numConta;
		this.saldo = saldo;
		this.senha = senha;
		this.anoNascimento = anoNascimento;
		status = "aberta";
	}

	
	public void sacar(double valor, String senha) {
		
		if (status == "bloqueada") {
			System.out.println("Sua conta está bloqueada. Entre em contato com urgência.");
		} else if (valor < saldo & this.senha == senha) {
			saldo -= valor;
			tentativasErradas = 0;
			System.out.println("Seu saque foi realizado com sucesso.");
		} else if (valor > saldo) {
			System.out.println("Seu saldo é insuficiente");
		} else {
			System.out.println("Sua senha está incorreta. Você pode redefini-la, caso precise. "
					+ "Três tentativas erradas seguidas bloqueiam a conta.");		
			if(tentativasErradas == 3) {
				status = "bloqueada";
			} else {
				tentativasErradas++;
				System.out.println("Você ainda tem " + (3 - tentativasErradas) + " tentativas restantes.");
			}
		}
		
	}
	
	public void depositar(int numConta, double valor) {
		
		if (status == "bloqueada") {
			System.out.println("Sua conta está bloqueada. Entre em contato com urgência.");
		} else if (this.numConta == numConta) {
			saldo += valor;
			System.out.println("Seu depósito foi realizado com sucesso.");
		} else {
			System.out.println("Você digitou o número da conta incorretamente. Tente novamente.");
		}
		
	}
	
	public void transferir(int numConta, double valor, String senha) {
		
		if (status == "bloqueada") {
			System.out.println("Sua conta está bloqueada. Entre em contato com urgência.");
		} else if (valor < saldo & this.senha == senha & this.numConta != numConta) {
			saldo -= valor;
			tentativasErradas = 0;
			System.out.println("A sua tranferência foi realizada com sucesso.");
		} else if (valor > saldo) {
			System.out.println("Seu saldo é insuficiente.");
		} else if (this.numConta == numConta) {
			System.out.println("Você não pode realizar uma transferência para você mesmo.");
		} else {
			System.out.println("Sua senha está incorreta. Você pode redefini-la, caso precise. "
					+ "Três tentativas erradas bloqueiam a conta.");
			if(tentativasErradas == 3) {
				status = "bloqueada";
			} else {
				tentativasErradas++;
				System.out.println("Você ainda tem " + (3 - tentativasErradas) + "tentativas restantes.");
			}
		}
	}
	
	public void redefinirSenha(int anoNascimento, String novaSenha) {
		if (this.anoNascimento == anoNascimento) {
			senha = novaSenha;
			tentativasErradas = 0;
			System.out.println("Sua senha foi modificada com sucesso.");
		} else {
			System.out.println("Ano de nascimento incorreto. Três tentativas erradas bloqueiam a conta.");
			if (tentativasErradas == 3) {
				status = "bloqueada";
			} else {
				tentativasErradas++;
				System.out.println("Você ainda tem " + (3 - tentativasErradas) + " tentativas restantes.");
			}
		}
		
	}
	
	public void imprimirInfos() {
		System.out.println("Olá, " + nomeTitular + ", seu saldo é: " + saldo + "R$. O status da sua conta é: " + status + ".");
	}
	
	
	

}
