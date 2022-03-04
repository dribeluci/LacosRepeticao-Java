/* Exercício Proposto: 
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.*/

package exerciciosLacosRepeticao;

import java.util.Scanner;

public class AtividadeWhile01 {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner (System.in)) {
			
			int numero = 1, contMenor= 0, contMaior= 0 ; 
			
			while(numero < 99) {
				System.out.println("Digite um número: ");
				numero = in.nextInt();
				
					if( numero < 21) {
					contMenor++; 
					}
					else {
					contMaior++; 
					}
			}
			System.out.println("A quantidade de pessoas menores que 21 anos é: " + contMenor);
			System.out.println("A quantidade de pessoas maiores que 50 anos é: " + contMaior);
		}
	}	
}