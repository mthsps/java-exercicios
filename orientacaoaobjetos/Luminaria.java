package orientacaoaobjetos;

public class Luminaria {
	
	String marca;
	int intensidadeMax;
	int intensidade;
	Boolean ligada;
	
	public Luminaria(String marca, int intensidade) {
		this.marca = marca;
		this.intensidadeMax = intensidade;
		this.ligada = false;
	}
	
	public void ligar() {
		ligada = true;
		intensidade = 1;
		System.out.println("A luminária foi ligada.");
		
	}
	
	public void desligar() {
		if (!ligada) {
			System.out.println("A luminária já está desligada.");
		} else {
			ligada = false;
			intensidade = 0;
			System.out.println("A luminária foi desligada.");
		}
	}
	
	
	public void estabelerIntensidade(int valor) {
		if (valor > intensidade) {
			System.out.println("A intensidade foi colocada no máximo.");
			intensidade = intensidadeMax;
			ligada = true;
		} else {
			if ((valor + intensidade) < 0) {
				System.out.println("A luminária foi desligada.");
				ligada = false;
				intensidade = 0;
				} else {
				System.out.println("A intensidade foi ajustada para " + intensidade + ".");
				intensidade += valor;
				}
		}
	}
	
	
	public void imprimirInfos() {
		if (ligada) {
			System.out.println("A luminária da marca " + marca + " está ligada na intensidade " + intensidade + ".");
		} else {
			System.out.println("A luminária está desligada.");
		}
	}
	
	
	
	
}
