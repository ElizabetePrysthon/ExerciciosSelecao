package DoWhileTest;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
	int contador = 1;
	int numero=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		
		do{
			  System.out.println(contador);
			  contador++;
			}while (contador <=numero);

	}

}
