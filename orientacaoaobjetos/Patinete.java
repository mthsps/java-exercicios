package orientacaoaobjetos;

public class Patinete {
	
	String tipo;
	int velocidadeAtual;
	int velocidadeMax;
	Boolean emUso = false;
	
	
	public Patinete(String tipo, int velocidadeMax) {
		this.tipo = tipo;
		this.velocidadeMax = velocidadeMax;
	}
	
	
	public void usar() {
		emUso = true;
		System.out.println("Você está usando o patinente...");
		
	}
	
	public void aumentarVelocidade(int maisVelo) {
		
		if (!emUso) {
			System.out.println("Você precisa primeiro usar o patinete...");
		} else {
			
			if (maisVelo < velocidadeMax & (maisVelo + velocidadeAtual) < velocidadeMax & velocidadeAtual <= velocidadeMax) {
				velocidadeAtual += maisVelo;
				System.out.println("Sua velocidade atual é: " + velocidadeAtual + "km/h.");	
			} else {
				System.out.println("Você já atingiu a velocidade máxima... Calma aí...");
			}
		}
		
	}
	
	public void parar() {
		velocidadeAtual = 0;
		emUso = false;
		System.out.println("Você parou o patinete.");
	}
	
	public void imprimirInfos() {
		System.out.println("Seu patinete é " + tipo + ", com velocidade máxima de " + velocidadeMax + " km/h.");
	}
	
	
	
	

}
