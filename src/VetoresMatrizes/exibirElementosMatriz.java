package VetoresMatrizes;

import java.util.Scanner;

public class exibirElementosMatriz {
	
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int[][] matriz = new int[3][3];

		        System.out.println("----------------------------------");
		        System.out.println("Digite os elementos da matriz 3x3:");
		        System.out.println("----------------------------------");

		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print("\nDigite o elemento da posição [" + i + "][" + j + "]: ");
		                matriz[i][j] = scanner.nextInt();
		            }
		        }

		        System.out.println("\nElementos da Diagonal Principal: ");
		        for (int i = 0; i < 3; i++) {
		            System.out.println(matriz[i][i]);
		        }
		        System.out.println("\nElementos da Diagonal Secundária: ");
		        for (int i = 0; i < 3; i++) {
		            System.out.println(matriz[i][2 - i]);
		        }

		        int somaDiagonalPrincipal = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalPrincipal += matriz[i][i];
		        }
		        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		        
		        int somaDiagonalSecundaria = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalSecundaria += matriz[i][2 - i];
		        }
		        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
	}
}

		


