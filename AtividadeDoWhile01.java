/* Exerc�cio proposto:
Crie um programa que leia um n�mero do teclado at� que encontre
 um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.*/

package exerciciosLacosRepeticao;

import java.util.Scanner;

public class AtividadeDoWhile01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, soma = 0;

		do {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			soma = soma + numero;
		} while (numero != 0);

		System.out.println("A soma de todos os n�meros �: " + soma);
		leia.close();
	}
}
