package orientacaoaobjetos;

public class Aviao {
	
	String nome;
	String tipo;
	String fabricante;
	int numPassageiros;
	int qtdCombustivel;
	int peso;
	int ano;
	Boolean emUso;
	
	public Aviao(String nome, String tipo, String fabricante, int numPassageiros, int qtdCombustivel, int ano) {
		this.nome = nome;
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.numPassageiros = numPassageiros;
		this.qtdCombustivel = qtdCombustivel;
		this.ano = ano;
	}
	
	
	public void voar(String destino, float duracao) {
		
		emUso = true;
		
		qtdCombustivel -= (duracao * 20);
		
		if (qtdCombustivel > 15) {
		System.out.println("Viagem iniciada para " + destino + ", com duração prevista de " + duracao + 
				" hora(s).");
		} else {
			System.out.println("A viagem não pode ser iniciada. É necessário abastecer antes.");
		}
		
		}
	
	public void abastecer(int litros) {
		qtdCombustivel +=  litros;
	}
	
	public void imprimirInfos() {
		System.out.println("O avião " + nome + ", fabricado em " + ano + ", do tipo " + tipo + " está em uso: " + emUso);
	}
}
