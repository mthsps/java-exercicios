package collections;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	/*
	* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	* trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	* programa deverá atender as seguintes funcionalidades:
	*	Armazenar dados da List
	*	Remover dados da list;
	*	Atualizar dados da list.
	*	Apresentar todos os dados da list.
	*/
	
	List<String> estoque = new ArrayList<String>();
	
	public void adicionar(String produto) {
		estoque.add(produto);
	}
	
	public void retirar(String produto) {
		estoque.remove(produto);
	}
	
	public void atualizar(String produto, String novoProduto) {
		int index = estoque.indexOf(produto);
		estoque.set(index, novoProduto);
	}
	
	public void imprimir() {
		System.out.println(estoque);
	}
	
	
	
	public static void main(String[] args) {
		
		Estoque estoqueEletro = new Estoque();
		
		estoqueEletro.adicionar("celular");
		estoqueEletro.imprimir();
		estoqueEletro.adicionar("TV");
		estoqueEletro.adicionar("notebook");
		estoqueEletro.imprimir();
		estoqueEletro.adicionar("console");
		estoqueEletro.retirar("TV");
		estoqueEletro.imprimir();
		estoqueEletro.atualizar("notebook", "laptop");
		estoqueEletro.imprimir();
	}

}


	


