/* 
Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 
2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: 
número de pessoas calmas; 
número de mulheres nervosas; 
número de homens agressivos; 
número de outros calmos;
número de pessoas nervosas com mais de 40 anos; 
número de pessoas calmas com menos de 18 anos.
 */

package exerciciosLacosRepeticao;

import java.util.Scanner;

public class AtividadeWhile02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int cont = 1, sexo = 0, idade = 0, opcoes = 0;
        int nPessoasCalma = 0, nMulheresNervosas = 0, nHomensAgressivos = 0;
        int nOutrosCalmos = 0, nPessoasNervosasMaior40 = 0, nPessoasCalmaMenor18 = 0;
        Scanner entrada = new Scanner(System.in);
        
        while (cont < 3) {
            
            System.out.println("Digite sua idade");
            idade = entrada.nextInt();
            
            System.out.println("Digite seu sexo, 1-feminino, 2-masculino e 3-Outros");
            sexo = entrada.nextInt();
            
            while (sexo < 1 || sexo > 3) {
                System.out.println("Digite seu sexo, 1-feminino, 2-masculino e 3-Outros");
                sexo = entrada.nextInt();
            }
            
            System.out.println("Digite 1 para pessoa calma, 2 para pessoa nervosa e 3 para pessoa agressiva");
            opcoes = entrada.nextInt();
            while (opcoes < 1 || opcoes > 3) {
                System.out.println("Digite 1 para pessoa calma, 2 para pessoa nervosa e 3 para pessoa agressiva");
                opcoes = entrada.nextInt();
            }
            
            if (opcoes == 1) {
                nPessoasCalma++;
            }
            if (sexo == 1 && opcoes == 2) {
                nMulheresNervosas++;
            }
            if (sexo == 2 && opcoes == 3) {
                nHomensAgressivos++;
            }
            if (sexo == 3 && opcoes == 1) {
                nOutrosCalmos++;
            }
            if (opcoes == 1 && idade < 18) {
                nPessoasCalmaMenor18++;
            }
            if (opcoes == 2 && idade > 40) {
                nPessoasNervosasMaior40++;
            }
            cont ++;
        }
        entrada.close();
        System.out.println("Numero de pessoas calmas " + nPessoasCalma);
        System.out.println("Numero de mulheres nervosas " + nMulheresNervosas);
        System.out.println("Numero de homens agressivos " + nHomensAgressivos);
        System.out.println("Numero de outros calmos " + nOutrosCalmos);
        System.out.println("Numero de pessoas nervosas com mais de 40 " + nPessoasNervosasMaior40);
        System.out.println("Numero de pessoas nervosas com menos de 18 " + nPessoasCalmaMenor18);
    }
}