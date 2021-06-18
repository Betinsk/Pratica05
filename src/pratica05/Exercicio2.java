package pratica05;
	/*
	 * 2) Em linguagem de programação Java, escreva um algoritmo que calcule e imprima a
	soma dos números inteiros entre 7 e 20, inclusive.
	
	 */
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ini = 7;
		int count =7;
		
		
		for(int i=0;i<13;i++) {
			ini += 1;
			count += ini;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
