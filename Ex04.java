package ExercíciosVetoresMatrizes;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal..*/
		
		int[][] matriz= new int[3][3];
		
		int soma=0,diag=0,i,j;
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ",i,j);
				matriz[i][j]=ler.nextInt();
				soma+=matriz[i][j];
				
				if(i==j) {
					diag+=matriz[i][j];
				}
			}
		}
		System.out.println("Soma dos valores dela: "+soma+"\nSoma da diagonal principal: "+diag);
	}

}
