package bloco1;

import java.util.Scanner;

public class Lista16 {
	
	
	private static Scanner input = new Scanner(System.in);

	public static void questao1() {
		
		/* Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR) */
		
		for(int i=1000; i < 2000; i++) {
			if (i % 11 == 5) System.out.println(i);
		}
		
	}

	
	public static void questao2(int ...lista) {
		
		/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		
		int par = 0;
		int impar = 0;
		
		for(int i=0; i<lista.length; i++) {
			if(lista[i] % 2 == 0 & lista[i] != 0) par++;
			if(lista[i] % 2 != 0) impar++;
		}
		
		System.out.println("Número de pares: " + par);
		System.out.println("Número de ímpares: " + impar);
	}
	
	
	public static void questao3() {

		/*
		  Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		  idade for =-99. (WHILE)
		 */


		int idade = 0;

		int menor21Anos = 0;

		int maior50Anos = 0;

		while (idade != -99) {
			
			
			System.out.print("Digite a idade:");
			idade = input.nextInt();
		
			if (idade < 21)
				menor21Anos++;
			if (idade > 50)
				maior50Anos++;
		}

		System.out.println("Número de pessoas menores que 21 anos: " + menor21Anos);
		System.out.println("Número de pessoas maiores que 50 anos: " + maior50Anos);
	}
	
	
	public static void questao4() {
		
		/* Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
			 o número de pessoas calmas;
			 o número de mulheres nervosas;
			 o número de homens agressivos;
			 o número de outros calmos;
			 o número de pessoas nervosas com mais de 40 anos;
			 o número de pessoas calmas com menos de 18 anos.*/
		
		
		int calmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int nervosasMais40anos = 0;
		int calmasMenos18anos = 0;
		int terminar = 0;
		
		while (terminar != 2) {
			
			System.out.print("Qual a sua idade? ");
			int idade = input.nextInt();
			
			System.out.print("Qual a seu sexo? 1.Feminino 2.Masculino 3.Outros ");
			int sexo = input.nextInt();

			System.out.print("Você se considera uma pessoa? 1.Calma 2.Nervosa 3.Agressiva ");
			int temperamento = input.nextInt();
			if (temperamento == 1) calmas++;
			
			if (sexo == 1 & temperamento == 2) mulheresNervosas++;
			if (sexo == 2 & temperamento == 3) homensAgressivos++;
			if (sexo == 3 & temperamento == 1) outrosCalmos++;
			if (idade > 40 & temperamento == 2) nervosasMais40anos++;
			if (idade < 18 & temperamento == 1) calmasMenos18anos++;
			
			
			System.out.print("Adiconar mais uma pessoa?  1. Sim  2. Terminar ");
			terminar = input.nextInt();
			
		}
		

		System.out.println("Número de pessoas calmas: " + calmas);
		System.out.println("Número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Número de homens agressivos " + homensAgressivos);
		System.out.println("Número de outros calmos: " + outrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervosasMais40anos);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + calmasMenos18anos);
		
		
	}
	
	
	public static void questao5() {
			
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
		 */

		input = new Scanner(System.in);
		int numero;
		int soma = 0;

		do {

			System.out.print("Digite um número inteiro a ser somado. Para terminar, digite zero: ");
			numero = input.nextInt();
			soma += numero;

		} while (numero != 0);

		System.out.println("Soma dos números adicionados: " + soma);
				
	}
	
	
	public static void questao6() {
		
		/*Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		int numero;
		int soma = 0;
		int contador = 0;
		double media = 0;
		
		do {	
			
			System.out.print("Digite um número inteiro a ser somado. Para terminar, digite zero: ");
			numero = input.nextInt();
			if (numero !=0 && numero % 3 == 0) {
				soma += numero;
				contador++;
			}
			
		} while (numero != 0);
		
		input.close();
		
		if (contador != 0) media = (double) soma / contador;
		
		System.out.println("Média dos números adicionados que são múltiplos de três: " + media);

	}
	
	
	public static void main(String args[]) {
		questao1();
		questao2(8,9,3,4,6,32,5,643,3,0);
		questao3();
		questao4();
		questao5();
		questao6();
	}

}
