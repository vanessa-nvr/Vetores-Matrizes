package Exerc�ciosVetoresMatrizes;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		quantas foram as ocorr�ncias da maior pontua��o.*/

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
		System.out.println("M�dia aritm�tica dos lan�amentos �: "+(soma/10)+"\nOcorr�ncias da maior pontua��o: "+maior);
	}

}
