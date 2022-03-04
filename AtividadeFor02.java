/*Exercício proposto:

Ler 10 números e imprimir quantos são pares e quantos são ímpares. */

package exerciciosLacosRepeticao;

import java.util.Scanner;

public class AtividadeFor02 {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			int contPar= 0 , contImpar= 0, numero; 

			for (numero= 1; numero <=10; numero++) {
				System.out.println(" Digite um número: ");
				numero = entrada.nextInt();
				
				if(numero % 2 ==0 ) {
					   contPar++;  
				} else {
					contImpar++;
				}
			} 
			System.out.println("A quantidade de pares é: " + contPar);
			System.out.println("A quantidade de impares é: " + contImpar);
			
entrada.close();
		}
	}

}
