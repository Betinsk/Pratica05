package pratica05;
	/*
	 * 1) Em linguagem de programa��o Java, escreva um algoritmo que leia 10 n�meros e imprima
	quantos n�meros negativos foram lidos.
	 */
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		for(int i=0;i<10;i++) {
			int num = sc.nextInt();
			if(num <0) {
				count++;
			}
		}
			System.out.println("N�meros negativos "+ count);
			sc.close();
		}
}
