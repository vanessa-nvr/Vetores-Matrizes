package Exerc�ciosVetoresMatrizes;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

		double[] notas=new double[5];
		double maior=0;
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i<5;i++) {
			System.out.printf("Digite a %d� pontua��o: ",(i+1));
			notas[i]=ler.nextDouble();
			if (notas[i]>maior) {
				maior=notas[i];
			}
		}
		for(int i=0; i<5; i++) {
			System.out.printf("\nA %d� pontua��o �: %.2f",(i+1),notas[i]);
		}
		System.out.println("\nA maior pontua��o �: "+maior);
	}

}
