package ExercíciosVetoresMatrizes;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.*/

		int [] lancamentos=new int[10];
		int i,maior=0;
		double soma=0;
		
		Random sortear= new Random();
		
		for(i=0;i<10;i++) {
			int n=sortear.nextInt(1,7);
			lancamentos[i]=n;
			soma+=n;
			
			if(n==6) {
				maior++;
			}
		}
		for(i=0;i<10;i++) {
			System.out.println(lancamentos[i]);
		}
		System.out.println("Média aritmética dos lançamentos é: "+(soma/10)+"\nOcorrências da maior pontuação: "+maior);
	}

}
