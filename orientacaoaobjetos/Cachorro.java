package orientacaoaobjetos;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("O cachorro " + getNome() + " late: au au au! ");
		
	}
	
	public void correr() {
		System.out.println("O cachorro " + getNome() + " corre a 48 km/h.");
	}

}
