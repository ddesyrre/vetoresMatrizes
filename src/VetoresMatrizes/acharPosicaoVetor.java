package VetoresMatrizes;

import java.util.Scanner;

public class acharPosicaoVetor {

	public static void main(String[] args) {
		// Achar posição no vetor
		
		Scanner scanner = new Scanner(System.in);
        
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.print("Digite o numero que você deseja encontrar: ");
        int valor = scanner.nextInt();

        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("\nO numero " + valor + " está localizado na posição: " + posicao);
        } else {
            System.out.println("\nO número " + valor + " não foi encontrado!");
        }


	}

}
