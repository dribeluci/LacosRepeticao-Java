/* Exercício Proposto: 
Escrever um programa que receba vários números inteiros no teclado. 
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0*/

package exerciciosLacosRepeticao;

import java.util.Scanner;

public class AtividadeDoWhile02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, media = 0, cont = 0, soma = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				if (numero % 3 == 0) {
					cont++;
					soma = soma + numero;
				}
			}
		} while (numero != 0);
		media = soma / cont;
		System.out.println("A média dos multiplos de 3 é: " + media);

		leia.close();
	}
}
