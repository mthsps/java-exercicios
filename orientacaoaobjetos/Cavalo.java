package orientacaoaobjetos;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("O cavalo " + getNome() + " relincha: hinn in in! ");
		
	}
	
	public void correr() {
		System.out.println("O cavalo " + getNome() + " corre a 71 km/h.");
	}


}
