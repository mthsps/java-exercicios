package orientacaoaobjetos;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("O prequiça " + getNome() + " emite um som misterioso... ");
		
	}
	
	public void subirArvores() {
		System.out.println("O preguiça " + getNome() + " subiu na árvore bem devagar...");
	}
																				


}
