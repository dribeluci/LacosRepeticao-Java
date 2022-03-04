/* Exercício proposto:
Crie um programa que leia um número do teclado até que encontre
 um número igual a zero. No final, mostre a soma dos números digitados.*/

package exerciciosLacosRepeticao;

import java.util.Scanner;

public class AtividadeDoWhile01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, soma = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			soma = soma + numero;
		} while (numero != 0);

		System.out.println("A soma de todos os números é: " + soma);
		leia.close();
	}
}
