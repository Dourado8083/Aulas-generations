package Vetores;
import java.util.Scanner;
public class MaiorDe10 {
    public static void main(String[] args) {
		final int linha = 3, coluna = 3;
		int[][] vet = new int[3][3];
		int contador = 0, li, co;
		Scanner leia = new Scanner(System.in);

		for (li = 0; li < 3; li++) {
			for (co = 0; co < 3; co++) {
				System.out.println("Digite o valor da linha e da coluna:");
				vet[li][co] = leia.nextInt();
				contador++;
				if (vet[li][co] > 10) {
					contador++;
				}
			}
		}
		System.out.println("Números maiores que 10" +contador);
	}   
}
