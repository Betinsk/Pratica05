package pratica05;
	/*
	 * 4) O fatorial de um número n é representado por n! e é calculado como apresentado
	abaixo:
	 n! = n x (n – 1) x (n – 2) x ... x 2 x 1, para n > 0 e 0! = 1.
	 Exemplos:
	 5! = 5 x 4 x 3 x 2 x 1 = 120
	 4! = 4 x 3 x 2 x 1 = 24
	 3! = 3 x 2 x 1 = 6
	 2! = 2 x 1 = 2
	 1! = 1
	 0! = 1 (OBS: o fatorial de 0 é sempre 1).
	Em linguagem de programação Java, escreva um algoritmo que leia um número natural
	informado pelo usuário a partir do teclado e que informe o fatorial desse número. Se o
	usuário inserir um número negativo, informe que o número é inválido.
	 */
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

    int fatorial = sc.nextInt();
    if(fatorial <0) {
    	System.out.println("Número inválido");
    }
    else {
    for (int i = 1;i<=5 ; i ++ ) {
      fatorial *= i;

      System.out.println("Fatorial de " +i+"=" +fatorial);
    }
    }
    
    sc.close();
  }
}

