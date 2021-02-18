package idade;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calcularidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int anoNascimento;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite  o nome da pessoa: ");
		nome = sc.nextLine();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = sc.nextInt();

		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);

		int idade = (anoAtual - anoNascimento);
		System.out.println(idade + " anos");
		
		if (anoNascimento < 0) {
			System.out.println("Idade inválida");
		} else {
			
			if (idade >= 18) {
				System.out.println(nome + " é maior de idade");
			} else if (idade < 18) {
				System.out.println(nome + " é menor de idade");
			} 
		}
	}

}
