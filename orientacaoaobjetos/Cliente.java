package orientacaoaobjetos;

import java.time.LocalDate;

public class Cliente {
	
	public String nome;
	public int CPF;
	public String endereco;
	public String email;
	public int telefone;
	public String tipoContato;
	
	private LocalDate dataCadastro;
	private LocalDate ultimaCompra;
	private double credito = 0;
	private int numCompras;
	
	public Cliente(String nome, int CPF, String endereco, String email, int telefone, String tipoContato) {
		this.nome = nome;
		this.CPF = CPF;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.dataCadastro =  LocalDate.now();
		this.ultimaCompra =  LocalDate.now();
	}
	
	
	public void comprar(double valorProduto) {
		ultimaCompra = LocalDate.now();
		credito = credito - valorProduto;
		numCompras++;
	}
	
	public void pagar(int valor) {
		credito += valor;
	}
	
	public void pagar(double valor) {
		credito += valor;
	}
	
	public void imprimirInfos() {
		
		System.out.println("Seu nome é " + nome + ". Seu cadastro foi realizado em  " + dataCadastro + 
				" e você já realizou " + numCompras + " compra(s). Sua última compra foi em: " + ultimaCompra + 
				". Seu saldo atual é: " + credito + "R$");

	}
	
	

}
