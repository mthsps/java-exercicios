package bloco1;
import java.util.Arrays;

public class Lista15 {
	
	
	public static void questao1(int ... v) {
		
		/*
		Faça um programa que receba três inteiros e diga qual deles é o maior.
		*/
		
		int maiorNum = 0;
		
		for(int i=0; i < v.length; i++) {
			if (v[i] > maiorNum) 
				maiorNum = v[i];
		}
			
		System.out.println("O maior número é: " + maiorNum);
	}
	
	
	
	static void questao2(int ... lista) {
		
		/*
		Faça um programa que entre com três números e coloque em ordem crescente.
		*/
		
		sort(lista, 0, lista.length-1);
		
		System.out.println("A lista ordenada é: " + Arrays.toString(lista));
		
		}

	public static void sort(int[] lista, int esquerda, int direita) {
		
		// Arrays.sort(v); --- Solução simples, utilizando a biblioteca Arrays do Java.
		
		int i, j, x, y;
		
		
		i = esquerda; j = direita;
		
		x = lista[(esquerda+direita)/2];
		
		do {
			while((lista[i] < x && (i < direita))) i++;
			while((x < lista[j]) && (j > esquerda)) j--;
			
			if(i <= j) {
				
				y = lista[i];
				lista[i] = lista[j];
				lista[j] = y;
				i++; j--;
			}
			
		} while (i <= j);
		
		if(esquerda < j) sort(lista, esquerda, j);
		if(direita > i) sort(lista, i, direita);
		
	}
	

	
	public static void questao3(int idade) {
		
		/*
		Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto
		*/
		
		if (idade >= 10 & idade <= 14) System.out.println("Categoria: Infantil Idade: entre 10 e 14 anos");
		
		else if (idade >= 15 & idade <= 17) System.out.println("Categoria: Juvenil, Idade: entre 15 e 17 anos");
		
		else if (idade >= 18 & idade <= 25) System.out.println("Categoria: Adulta, Idade: entre 18 e 25 anos");
		
		else System.out.println("Idade não coberta");
	}
	
	
	
	public static void questao4(int numero) {
		
		/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado. */
		
		if (numero % 2 == 0 & numero != 0) {
			System.out.println("Número par: " + Math.sqrt(numero));	
			
		} else if (numero % 2 != 0) {
			System.out.println("Número ímpar: " + Math.pow(numero, 2));
			
		} else { 
			System.out.println("O número é zero");
		}
		
	}
	


	public static void main(String args[]) {
		
		/* Testes para as questões. */
		
		questao1(5, 6, 7);
		questao2(5, 100, 7, -56, 89, 4, 87, -23);
		questao3(-1);
		questao4(15);
	}
	
}
