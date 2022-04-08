package orientacaoaobjetos;

public class TestesHeranca {
	
	/* 1.  Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	* comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	* características de forma que tudo o que for comum a todos os animais fique na classe
	* Animal: 
	*		Mãe: Animal
	*			Filhos: 
	*				Cavalo: nome, idade, correr, emitir som;
	*				Cachorro: nome, idade, correr, emitir som;
	*				Preguica: nome, idade, correr, subir em árvores;		
	*
	*
	* 2. Implemente um programa que crie os 3 tipos de animais definidos no exercício
	*  anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
	*  é, dependente do tipo de animal. 
	*/	

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
