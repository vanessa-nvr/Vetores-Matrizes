package ExercíciosVetoresMatrizes;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.*/

	int[][]n1 = new int[4][6];
	int[][]n2 = new int[4][6];
	int[][]m1 = new int[4][6];
	int[][]m2 = new int[4][6];
	
	int i,l,c,soma=0,sub=0;
	
	Random sortear= new Random();
	
	for(l=0;l<4;l++) {
		for(c=0;c<n1[l].length;c++) {
			int num1=sortear.nextInt(100);
			n1[l][c]=num1;
			int num2=sortear.nextInt(100);
			n2[l][c]=num2;
			
			m1[l][c]=n1[l][c]+n2[l][c];
			m2[l][c]=n1[l][c]-n2[l][c];
			}
		}
	for(i=0;i<2;i++) {
		if (i==1) {
			System.out.println("\nM2\n");
		}
		else{
			System.out.println("M1\n");
		}
		for(l=0;l<4;l++) {
			for(c=0;c<m1[l].length;c++) {
				if (i==0) {
					System.out.print( m1[l][c]+" ");
				}
				else {
					System.out.print(m2[l][c]+" ");
				}
			}
			System.out.println();
		}
	}
	}
}
