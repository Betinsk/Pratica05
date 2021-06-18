package pratica05;
	/*
	 * 3) Em linguagem de programação Java, escreva um algoritmo que leia 2 números inteiros
	positivos e que imprima todos os números inteiros existentes entre esses dois limites
	informados.
	 */
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x<y) {
			int cont = y-x;
			for(int i=0;i<cont;i++) {
				if(x>=0) {
					System.out.println(x++);
				}
			}
		}

		
		else {
			int cont = x-y;
			for(int i=0;i<=cont;i++) {
				if(x>=0) {
					System.out.println(y);
					y++;
		}
			}
		
	
		
		sc.close();

	}

	}
	
}
		
	
