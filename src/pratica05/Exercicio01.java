package pratica05;
	/*
	 * 1) Em linguagem de programação Java, escreva um algoritmo que leia 10 números e imprima
	quantos números negativos foram lidos.
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
			System.out.println("Números negativos "+ count);
			sc.close();
		}
}
