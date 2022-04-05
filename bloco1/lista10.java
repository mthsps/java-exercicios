package bloco1;

import java.util.Scanner;
import java.util.Random;

public class lista10 {
	
	public static void questao1() {
		
		/*Faça um programa que crie um vetor por leitura com 5 valores
		 de pontuação de uma atividade e o escreva em seguida. Encontre 
		 após a maior pontuação e a apresente. */

		Scanner input = new Scanner(System.in);

		int[] pontuacoes = new int[5];
		int maiorPontuacao = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Por favor escreva um valor: ");
			pontuacoes[i] = input.nextInt();

			System.out.println("O valor adicionado foi: " + pontuacoes[i]);

			if (pontuacoes[i] > maiorPontuacao) {
				maiorPontuacao = pontuacoes[i];
			}

		}
		
		input.close();

		System.out.println("\nA maior pontuação foi: " + maiorPontuacao);
	}
	
	public static void questao2() {
		
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, 
		 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/

		int lancamentos[] = new int[10];
		int soma = 0;
		int contador = 0;
		int maiorLancamento = 0;

		Random sorteia = new Random();

		for (int i = 0; i < 10; i++) {
			// System.out.println("Por favor escreva valor do dado: ")
			lancamentos[i] = sorteia.nextInt((6 - 1) + 1) + 1;

			System.out.println("Lançamento " + (i+1) + ": " + lancamentos[i]);

			soma += lancamentos[i];

			if(lancamentos[i] > maiorLancamento) {
				maiorLancamento = lancamentos[i];
				contador = 0;
			}
			
			if(lancamentos[i] == maiorLancamento) {
				contador++;
			}

		}

		int media = soma / lancamentos.length;

		System.out.println("A média dos lançamentos foi: " + media);

		System.out.println("Número de ocorrências da maior pontuação: " + contador);

	}
	
	
	public static void questao3() {
		
		/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		*/
		
		
		Random sorteia = new Random();

		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];

		for (int i = 0; i < N1.length; i++) {
			for (int j = 0; j < N2[i].length; j++) {
				N1[i][j] = sorteia.nextInt(101);
				N2[i][j] = sorteia.nextInt(101);
				
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
				
			}
		}
	}
	
	
	
	public static void questao4() {
		
		/*Crie um programa que receba valores do usuário para preencher uma matriz 
		 * 3X3, e em seguida, exiba a soma dos valores dela e a 
		 * soma dos valores da primeira diagonal, ou seja, diagonal principal. */
		
		
		Random sorteia = new Random();

		int matriz[][] = new int[3][3];
		int somaElementos = 0;
		int somaDiagonal = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sorteia.nextInt((50 - 1) + 1) + 1;
				somaElementos += matriz[i][j];

				if (i == j) {
					somaDiagonal += matriz[i][j];
				}
			}
		}

		System.out.println("Soma de todos os valores da matriz: " + somaElementos);
		System.out.println("Soma de todos os valores da diagonal principal: " + somaDiagonal);
		
	}
	
	
	public static void main(String args[]) {
		
		/* Testes para as questões. */
		
		questao1();
		questao2();
		questao3();
		questao4();
	}

}
