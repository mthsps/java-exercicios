package orientacaoaobjetos;

public class TestesHeranca {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Giraia", 15);
		
		animal.emitirSom();
		
		Cavalo cavalo = new Cavalo("Fasão", 17);
		
		cavalo.correr();
		cavalo.emitirSom();
		
		Cachorro cachorro = new Cachorro("Bob", 8);
		
		cachorro.correr();
		cachorro.emitirSom();
		
		Preguica preguica = new Preguica("Tiaté", 11);
		
		preguica.emitirSom();
		preguica.subirArvores();
		preguica.setNome("Tioté");
		System.out.println(preguica.getNome());
		

	}

}
